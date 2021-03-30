import com.springframework.zhangsx.MyBean;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 张书新
 * @version 1.0
 * @date 2021/3/29 11:03 下午
 */
public class IocTest {

	@Test
	public void testIoc() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		MyBean bean = applicationContext.getBean(MyBean.class);
	}

}
