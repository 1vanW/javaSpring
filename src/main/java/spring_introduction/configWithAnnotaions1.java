package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class configWithAnnotaions1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");
//
//        Cat cat = context.getBean("cat",Cat.class);
//        cat.say();

        Person person= context.getBean("personBean",Person.class);

        person.callYourPet();

        System.out.println(person.getAge());
        System.out.println(person.getSurName());

        context.close();

    }
}
