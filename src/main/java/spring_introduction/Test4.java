package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

//        Dog myDog = context.getBean("myPet",Dog.class);
//        Dog yourDog = context.getBean("myPet",Dog.class);
//        myDog.setName("Klepa");
//        yourDog.setName("Alisha");
//        System.out.println(myDog.getName());
//        System.out.println(yourDog.getName());


//        System.out.println(myDog == yourDog);
//
//        System.out.println(myDog.toString());
//        System.out.println(yourDog.toString());
//
        context.close();

    }
}
