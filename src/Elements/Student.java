package Elements;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Richard
 */
public class Student {
    
    int age;
    String name;
    float gpa;
    
    
    public Student(){
        age = 0;
        name = "";
        gpa = 0.0f;
    }
    
     public Student(int a, String n, float g){
        age = a;
        name = n;
        gpa = g;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
     
     
    @Override
    public String toString(){
       
       String text = "Name:" + this.name + ", Age:" + this.age + ", GPA:" + this.gpa;
       return text;
   }
    
    
    
}
