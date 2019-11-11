package Elements;

import BasicSeralizer.DeSerializer;
import BasicSeralizer.Serializer;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Richard
 */
public class Menu {

    Student currentStudent;
    Student searchedStudent;
    Serializer saver;
    DeSerializer loader; 
    Scanner kb;
    int menuOperator;
    public boolean looper;
    
    public Menu(){
        currentStudent = new Student();
        searchedStudent = new Student();
        saver = new Serializer();
        loader = new DeSerializer();
        kb = new Scanner(System.in);
        menuOperator = 0;
        looper = true;
    }

    public void startMenu() {
 
        while (looper) {
            
            System.out.print("Please enter number 1-5 for operation:");
            menuOperator = kb.nextInt();
            
            switch (menuOperator) {
                case 1:
                    currentStudent = addStudent();
                    break;
                case 2:
                    System.out.println(currentStudent.toString());
                    break;
                case 3:
                    saver.Serialize(currentStudent);
                    break;
                case 4:
                    
                    currentStudent = loader.Deserialize(searchedStudent);
                    break;
                case 5:
                    looper = false;
                    break;
                default:
                    System.out.println("Bad input please input a number 1-5.");
            }
        }
    }
    
    public Student addStudent(){
        
        Student newStudent;
        String name;
        int age;
        float gpa;
        
        System.out.print("Enter student name: ");
        name = kb.next();
        
        System.out.print("Enter student age: ");
        age = kb.nextInt();
        
        System.out.print("Enter student GPA: ");
        gpa = kb.nextFloat();
        
        newStudent = new Student(age, name, gpa);

        return newStudent;
    }
    

}
