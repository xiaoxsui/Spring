import com.xxs.Service.AnnotateService;
import com.xxs.Service.UserService;
import com.xxs.config.SpringConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

    @Test
    public void test(){
        UserService userService = new UserService();

        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("bean.xml");
/*        IUserService service = ioc.getBean(UserService.class);
        service.Hello();
        IUserService service2 = (IUserService) ioc.getBean("userService");
        service2.Hello();*/
        AnnotateService aService = ioc.getBean(AnnotateService.class);
        aService.hello();
    }

    //使用config配置类来进行容器获取
    @Test
    public void newTest(){
        AnnotationConfigApplicationContext ioc = new AnnotationConfigApplicationContext(SpringConfig.class);
        AnnotateService aService = ioc.getBean(AnnotateService.class);
        aService.hello();

    }
}
