package git.jwang.oasys.controller.user;

import git.jwang.oasys.model.dao.user.UserDao;
import git.jwang.oasys.services.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * @PROJECT_NAME: oa_system
 * @DESCRIPTION:
 * @USER: jwang
 * @DATE: 2020/12/19 下午5:36
 */

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserService userService;

    @RequestMapping("userlogmanage")
    public String user_log_manage() {
        return "user/userlogmanage";
    }

    /**
     * 用户管理-查询用户，并按照部门进行排序、分页
     * @param model
     * @param page
     * @param size
     * @return
     */
    @RequestMapping("usermanage")
    public String user_manage(Model model, @RequestParam(value = "page", defaultValue = "0") int page,
                              @RequestParam(value = "size", defaultValue = "10") int size) {

        userService.userManage(model, page, size);
        return "user/usermanage";
    }

    @RequestMapping("usermanagepaging")
    public String userPaging(Model model, @RequestParam(value = "page", defaultValue = "0") int page,
                             @RequestParam(value = "size", defaultValue = "10") int size,
                             @RequestParam(value = "usersearch", required = false) String usersearch) {
        userService.userPaging(model, page, size, usersearch);
        return "user/usermanagepaging";
    }

    @RequestMapping(value="useredit",method = RequestMethod.GET)
    public String getUserEdit(@RequestParam(value = "userid",required=false) Long userid, Model model) {

        userService.getUserEdit(userid, model);
        return "user/edituser";
    }

}
