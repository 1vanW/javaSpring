package spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Person person = context.getBean("personBean",Person.class);
        System.out.println(person.getSurName());
        System.out.println(person.getAge());
//        person.callYourPet();

//        Pet cat1 = context.getBean("catBean",Cat.class);
//        Pet cat2 = context.getBean("catBean",Cat.class);
//
//        System.out.println(cat1==cat2);


    }
}
