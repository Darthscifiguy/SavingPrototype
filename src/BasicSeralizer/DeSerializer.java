/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasicSeralizer;

import Elements.Student;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Richard
 */
public class DeSerializer {
    
    
    public Student Deserialize(Student savedStudent){
    try {
         FileInputStream fileIn = new FileInputStream("/tmp/employee.ser");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         savedStudent = (Student) in.readObject();
         in.close();
         fileIn.close();
         return savedStudent;
      } catch (IOException i) {
         i.printStackTrace();
         return null;
      } catch (ClassNotFoundException c) {
         System.out.println("Student class not found");
         c.printStackTrace();
         return null;
      }
    
    }
}
