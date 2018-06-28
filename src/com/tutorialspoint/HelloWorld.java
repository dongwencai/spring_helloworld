package com.tutorialspoint;
import org.springframework.beans.factory.annotation.Required;
public class HelloWorld {
    private String message;
    private Integer age;
    @Required
    public void setMessage(String message){
        this.message  = message;
    }
    @Required
    public void setAge(Integer age) {this.age = age;}
    public void getMessage(){
        System.out.println("Your Message : " + message);
    }
    public void getAge() {System.out.println("Your Age : " + age);}
}