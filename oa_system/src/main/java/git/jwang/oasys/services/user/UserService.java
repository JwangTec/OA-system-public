package git.jwang.oasys.services.user;

import com.github.pagehelper.util.StringUtil;
import git.jwang.oasys.model.dao.role.RoleDao;
import git.jwang.oasys.model.dao.user.DeptDao;
import git.jwang.oasys.model.dao.user.PositionDao;
import git.jwang.oasys.model.dao.user.UserDao;
import git.jwang.oasys.model.entity.Blog;
import git.jwang.oasys.model.entity.role.Role;
import git.jwang.oasys.model.entity.user.Dept;
import git.jwang.oasys.model.entity.user.Position;
import git.jwang.oasys.model.entity.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import java.util.List;

/**
 * @PROJECT_NAME: oa_system
 * @DESCRIPTION:
 * @USER: jwang
 * @DATE: 2020/12/19 下午6:27
 */

@Service
@Transactional
public class UserService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private PositionDao positionDao;
    @Autowired
    private DeptDao deptDao;
    @Autowired
    private RoleDao roleDao;

    public void userPaging(Model model, Integer page, Integer size, String usersearch) {
        Sort sort=new Sort(new Sort.Order(Sort.Direction.ASC,"dept"));
        Pageable pa=new PageRequest(page, size,sort);
        Page<User> userspage = null;
        if (StringUtil.isEmpty(usersearch)) {
            userspage = userDao.findByIsLock(0, pa);
        }else {
            System.out.println(usersearch);
            userspage = userDao.findNameLike(usersearch, pa);
        }

        List<User> users = userspage.getContent();
        model.addAttribute("users",users);
        model.addAttribute("page", userspage);
        model.addAttribute("url", "usermanagepaging");
    }

    public void userManage(Model model, int page, int size) {
        final Sort sort = new Sort(new Sort.Order(Sort.Direction.ASC, "dept"));
        final Pageable pa = new PageRequest(page, size, sort);
        Page<User> userspage = userDao.findByIsLock(0, pa);
        List<User> users = userspage.getContent();
        model.addAttribute("users", users);
        model.addAttribute("page", userspage);
        model.addAttribute("url", "usermanagepaging");
    }

    public void getUserEdit(Long userid, Model model) {

        if(userid!=null){
            User user = userDao.findOne(userid);
            model.addAttribute("where","xg");
            model.addAttribute("user",user);
        }

        List<Dept> depts = (List<Dept>) deptDao.findAll();
        List<Position> positions = (List<Position>) positionDao.findAll();
        List<Role> roles = (List<Role>) roleDao.findAll();

        model.addAttribute("depts", depts);
        model.addAttribute("positions", positions);
        model.addAttribute("roles", roles);
    }
}
