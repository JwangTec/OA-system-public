package git.jwang.oasys.services.user;

import com.alibaba.fastjson.JSONObject;
import git.jwang.oasys.model.dao.user.UserLogDao;
import git.jwang.oasys.model.dao.user.UserLogRecordDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @PROJECT_NAME: oa_system
 * @DESCRIPTION:
 * @USER: jwang
 * @DATE: 2020/12/19 下午4:13
 */

@Service
@Transactional
public class UserLogService {

    @Autowired
    UserLogDao userLogDao;

    @Autowired
    UserLogRecordDao userLogRecordDao;


    public String countWeakLogin() {
        Integer []r = new Integer[7];
        final Calendar calendar = Calendar.getInstance();
        setToFirstDay(calendar);
        for (int i = 0; i < 7; i++) {
            SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD");
            r[i] = userLogRecordDao.countlog(sdf.format(calendar.getTime()));
            calendar.add(Calendar.DATE, 1);
        }

        return JSONObject.toJSONString(r);
    }

    private static void setToFirstDay(Calendar calendar) {
        while (calendar.get(Calendar.DAY_OF_WEEK) != Calendar.MONDAY) {
            calendar.add(Calendar.DATE, -1);
        }
    }
}
