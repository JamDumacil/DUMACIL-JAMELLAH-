/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course;
import java.util.Scanner;
/**
 *
 * @author cc2_1d-9
 */
public class Course {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.print("Enter your Department: ");
        String department = input.nextLine();
         
        if (department.equals("COA")) {
            System.out.println("Choose your academic programm in letter: ");
            System.out.println(" A) Bachelor of Science in Accountancy");
            System.out.println(" B) Bachelor of Science in Accounting Technology");
            System.out.println(" C) Bachelor of Science in Management Accounting");
            System.out.println(" D) Bachelor of Se");
          
           if (department.equals("A")) {
               System.out.println("Science in Forensic Accounting"); 
            
               System.out.println("College of Accountancy");
               System.out.println("Course: Bachelor of Science in Accountancy (BSA)");
               System.out.println("Description: ");
               
           } else if(department.equals("B")) {
               System.out.println("College of Accountancy");
               System.out.println("Course: Bachelor of Science in Accounting Technology (BSAT)");
               
           } else if(department.equals("C")) {
               System.out.println("College of Accountancy");
               System.out.println("Course: Bachelor of Science in Management Accounting (BSMA)");
               
           } else if(department.equals("D")) {
               System.out.println("College of Accountancy");
               System.out.println("Course: Bachelor of Science in Forensic Accounting (BSFA)");
               
           } else {
               System.out.println("Unknown Program");
           }
                 
        } else if(department.equals("CEA")) {
            System.out.println("Choose your academic programm in letter: ");
            System.out.println(" A) Bachelor of Science in Architechture");
            System.out.println(" B) Bachelor of Science in Civil Engineering");
            System.out.println(" C) Bachelor of Science in Electronics Engineering");
            System.out.println(" D) Bachelor of Science in Environemtal and Sanitary Engineering");
            String program2 = input.nextLine();
             
           if (program2.equals("A")) {
               System.out.println("College of Engineering and Architecture");
               System.out.println("Course: Bachelor of Science in Architechture (BSA)");
               
           } else if(program2.equals("B")) {
               System.out.println("College of Engineering and Architecture");
               System.out.println("Course: Bachelor of Science in Civil Engineering (BSCE)");
               
           } else if(program2.equals("C")) {
               System.out.println("College of Engineering and Architecture");
               System.out.println("Course: Bachelor of Science in Electronics Engineering (BSEE)");
               
           } else if(program2.equals("D")) {
               System.out.println("College of Engineering and Architecture");
               System.out.println("Course: Bachelor of Science in Environemtal and Sanitary Engineering (BSES)");
               
           } else {
               System.out.println("Unknown Program");
           }
            
            
        } else if(department.equals("CITCS")) {
            
            System.out.println("Choose your academic programm in letter: ");
            System.out.println(" A) Bachelor of Science in Computer Science");
            System.out.println(" B) Bachelor of Science in Information System");
            System.out.println(" C) Bachelor of Science in Information Technology");
            System.out.println(" D) Associate in Computer Technology");
            String program2 = input.nextLine();
             
           if (program2.equals("A")) {
               System.out.println("College of Information Technology and Computer Science");
               System.out.println("Course: Bachelor of Science in Computer Science (BSCS)");
               
           } else if(program2.equals("B")) {
               System.out.println("College of Information Technology and Computer Science");
               System.out.println("Course: Bachelor of Science in Information System (BSIS)");
               
           } else if(program2.equals("C")) {
               System.out.println("College of Information Technology and Computer Science");
               System.out.println("Course: Bachelor of Science in Information Technology (BSIT)");
               
           } else if(program2.equals("D")) {
               System.out.println("College of Information Technology and Computer Science");
               System.out.println("Course: Associate in Computer Technology (ACT)");
               
           } else {
               System.out.println("Unknown Program");
           }
            
        } else if (department.equals("CTE")) {
            
            System.out.println("Choose your academic programm in letter: ");
            System.out.println(" A) Bachelor of Science in Elemetary Education - General");
            System.out.println(" B) Bachelor of Science in Elemetary Education");
            System.out.println(" C) Bachelor of Science in Secondary Education");
            String program2 = input.nextLine();
             
           if (program2.equals("A")) {
               System.out.println("College of Teacher Education");
               System.out.println("Course: Bachelor of Science in Elemetary Education - General (BSEE)-G");
               
           } else if(program2.equals("B")) {
               System.out.println("College of Teacher Education");
               System.out.println("Course: Bachelor of Science in Elemetary Education (BSEE)");
               
           } else if(program2.equals("C")) {
               System.out.println("College of Teacher Education");
               System.out.println("Course: Bachelor of Science in Secondary Education (BSSE)");
               
           } else {
               System.out.println("Unknown Program");
           }
            
        } else if (department.equals("CAS")) {
            
            System.out.println("Choose your academic programm in letter: ");
            System.out.println(" A) Bachelor of Arts in English");
            System.out.println(" B) Bachelor of Arts in Political Science");
            System.out.println(" C) Bachelor of Arts in Communication");
            System.out.println(" D) Bachelor of Science in Pyschology");
            String program2 = input.nextLine();
             
           if (program2.equals("A")) {
               System.out.println("College of Arts and Science");
               System.out.println("Course: Bachelor of Arts in English (BAE)");
               
           } else if(program2.equals("B")) {
               System.out.println("College of Arts and Science");
               System.out.println("Course: Bachelor of Arts in Political Science (BAPS)");
               
           } else if(program2.equals("C")) {
               System.out.println("College of Arts and Science");
               System.out.println("Course: Bachelor of Arts in Communication (BAC)");
               
           } else if(program2.equals("D")) {
               System.out.println("College of Arts and Science");
               System.out.println("Course: Bachelor of Science in Pyschology (BST)");
               
           } else {
               System.out.println("Unknown Program");
           }
            
        } else if (department.equals("CBA")) {
            
            System.out.println("Choose your academic programm in letter: ");
            System.out.println(" A) Bachelor of Science in Business Administration");
            System.out.println(" B) Bachelor of Science in Entrepreneurship");
            System.out.println(" C) Bachelor of Science in Office Administration");
            String program2 = input.nextLine();
             
           if (program2.equals("A")) {
               System.out.println("College of Business Administration");
               System.out.println("Course: Bachelor of Science in Business Administration (BSBA)");
               
           } else if(program2.equals("B")) {
               System.out.println("College of Business Administration");
               System.out.println("Course: Bachelor of Science in Entrepreneurship (BSE)");
               
           } else if(program2.equals("C")) {
               System.out.println("College of Business Administration");
               System.out.println("Course: Bachelor of Science in Office Administration (BSOA)");
               
               
           } else {
               System.out.println("Unknown Program");
           }
            
        } else {
            System.out.println("Unknown Deparment");
        }
    }
    
}
