import com.Husky.spring.service.Interfaces.accountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SmTest {
    @Test
    public void testSm(){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        accountService service=context.getBean("accountService", accountService.class);
        try{
            service.transfer("1001","1002",3000.0);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
