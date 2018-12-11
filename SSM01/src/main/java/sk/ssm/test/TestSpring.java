package sk.ssm.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 测试Spring
 * */
public class TestSpring {
    public static void main(String[] args) {
        //获取Spring容器
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:applicationContent.xml");
        //显示容器中的bean
        for (String beans : applicationContext.getBeanDefinitionNames()) {
            System.out.println(beans);
        }
    }
}
