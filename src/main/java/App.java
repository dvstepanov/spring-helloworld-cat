import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanWorldOne = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanWorldTwo = (HelloWorld) applicationContext.getBean("helloworld");
        Cat beanCatOne = (Cat) applicationContext.getBean("cat");
        Cat beanCatTwo = (Cat) applicationContext.getBean("cat");
        System.out.println(beanWorldOne.equals(beanWorldTwo));
        System.out.println(beanCatOne.equals(beanCatTwo));


    }
}