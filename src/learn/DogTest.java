package learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DogTest {
    public static void main(String[] args) {
        ApplicationContext ttt = new ClassPathXmlApplicationContext("spring.xml");
        Dog dog = (Dog) ttt.getBean("dog");
        Jek jek = (Jek) ttt.getBean("jek");
        dog.print();
        System.out.println(jek.bark());
    }
}