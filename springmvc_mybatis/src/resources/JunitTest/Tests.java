package resources.JunitTest;

import java.util.List;
import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.zb.entity.User;
import com.zb.service.UserService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/resources/spring/applicationContext.xml")
public class Tests {

    // 3种注入方式
    // @Resource 可以指定具体的bean名称
    // @Autowired 不支持指定bean名称
    @Resource(name = "userServiceImpl")
    // 可以指定具体的bean.
    private UserService userService;

    /**
     * 测试获取所有用户
     * 
     * 作者: zhoubang 
     * 日期：2015年9月25日 上午9:03:43
     */
    @Test
    public void getAll() {
        List<User> users = userService.getAll();
        for (int i = 0; i < users.size(); i++) {
            User u = (User) users.get(i);
            System.out.println(u.toString());
        }
    }
}
