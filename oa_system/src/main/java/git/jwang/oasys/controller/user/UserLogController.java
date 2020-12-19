package git.jwang.oasys.controller.user;

import com.alibaba.fastjson.JSONObject;
import git.jwang.oasys.model.dao.user.UserDao;
import git.jwang.oasys.model.dao.user.UserLogDao;
import git.jwang.oasys.model.dao.user.UserLogRecordDao;
import git.jwang.oasys.services.user.UserLogRecordService;
import git.jwang.oasys.services.user.UserLogService;
import jdk.nashorn.internal.ir.CallNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @PROJECT_NAME: oa_system
 * @DESCRIPTION:
 * @USER: jwang
 * @DATE: 2020/12/19 下午3:31
 */

@Controller
@RequestMapping("/")
public class UserLogController {

    @Autowired
    private UserLogDao userLogDao;

    @Autowired
    private UserLogService userLogService;

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserLogRecordDao userLogRecordDao;

    @Autowired
    private UserLogRecordService userLogRecordService;


    //显示当前一周内的登陆方用户相关浏览器、ip等信息
    @RequestMapping("countweeklogin")
    public String dfsa(HttpServletResponse response) throws IOException {

        String json = userLogService.countWeakLogin();
        System.out.println(json);
        response.setHeader("Cache-Contyol", "no-cache");
        response.setContentType("text/json;charset=UTF-8");
        response.getWriter().write(json);
        return null;
    }

}
