package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("personBean")
public class Person {
//    @Autowired
//    @Qualifier("catBean")
    private Pet pet;
//    @Value("${person.surName}")
    private String surName;
//    @Value("${person.Age}")
    private int age;
//    @Autowired
    public Person( Pet pet) {
        System.out.println("Person is created");
        this.pet = pet;
    }
//
//        public Person() {
//        System.out.println("Person bean is created");
//
//    }
//    @Autowired
//    @Qualifier("catBean")
    public void setPet(Pet pet) {
        System.out.println("Class Person setPet");
        this.pet = pet;
    }

    public String getSurName() {

        return surName;
    }

    public void setSurName(String surName) {
        System.out.println("class person setSURname");
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class person setAGe");
        this.age = age;
    }

    public Pet getPet() {
        return pet;
    }

    public void callYourPet(){
        System.out.println("Hello my lovely Pet" );
        pet.say();
    }
}
