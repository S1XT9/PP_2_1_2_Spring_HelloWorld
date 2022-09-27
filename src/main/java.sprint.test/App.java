import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        Cat cat1 = (Cat) applicationContext.getBean("cat");
        Cat cat2 = (Cat) applicationContext.getBean("cat");
        System.out.println(bean1==bean);
        System.out.println(cat1==cat2);
        cat1.setCatName("Sonya");
        cat2.setCatName("Leto");
        bean.setMessage("Hello");
        bean1.setMessage("Privet");
        System.out.println(cat1.getCatName()==cat2.getCatName());
        System.out.println(bean1.getMessage()==bean.getMessage());
    }
}