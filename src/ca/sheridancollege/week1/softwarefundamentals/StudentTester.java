/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 * * A class that creates an Array of Students and populates it
 * with 3 students from the current section and then iterates over the
 * list to print each name.

 * @author mehta
 */
public class StudentTester {
    public static void main(String[] args)
    {
        //char[] pillbox=new char[7];
        //array of StudentDemo objects
        StudentDemo[] StudentLst=new StudentDemo[3];
        
        StudentDemo s1=new StudentDemo("Sheetal Thakar");
        StudentLst[0]=s1;
        
        StudentLst[1]=new StudentDemo("amrit kaur");
        StudentLst[2]=new StudentDemo("Malav Jani");
        
        for(int i=0;i<StudentLst.length;i++)
        {
            System.out.println(StudentLst[i].getName());
        }
        
        }
        
    }
   

