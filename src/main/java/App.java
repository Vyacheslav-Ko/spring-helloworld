import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld beanWorldTwo =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.equals(beanWorldTwo));

        Cat beanCat =
                (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat.getVoice());
        Cat beanCatTwo =
                (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat.equals(beanCatTwo));

    }
}