/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paridhi
 */import java.util.regex.*; 
import java.io.*;
import java.util.*;
public class NewClass {
    public static void main(String args[])
    {
        String k="";
Scanner in = new Scanner(System. in);
System. out. println("Enter a string");
k = in. nextLine();int flag=0;
String x[]=k.split(",");String msg="";
for(int i=0;i<x.length;i++)
{flag=0;msg="";
        System.out.print(x[i]);
  if(x[i].length()<6)
  {
      System. out. println(": Failure Password must be at least 6 characters long.");
      flag=1;
      
  }
  if(x[i].length()>12)
  {
      System. out. println(": Failure Password must be max 12 characters long.");
         flag=1;
      
  }
 if(x[i].contains("%")||x[i].contains("!")||x[i].contains("(")||x[i].contains(")"))
  {
      System. out. println(" :Failure Password cannot contain %!)(");
         flag=1;
      
  }int small= 0,big=0;
        int numCount = 0;
        int s=0;
 for(int j=0;j<x[i].length();j++)
 { char ch = x[i].charAt(j);

            if (ch >= '0' && ch <= '9')
                numCount++;
            else if (ch >= 'a' && ch <= 'z') 
                small++;
              else if (ch >= 'A' && ch <= 'Z') 
                big++;
            else if (ch == '*' || ch == '$'||ch == '#' || ch == '='||ch=='@') 
                s++;
            
               
            
     
 }
 if(numCount<1){
      System. out. println(" :Failure Password must contain at least one letter from [0-9]");
    flag=1;
 }
  
   if(small<1){
      System. out. println(" :Failure Password must contain at least one letter from [a-z]");
          flag=1; 
  } if(big<1){
      System. out. println(" :Failure Password must contain at least one letter from [A-Z]");
      flag=1;
  }
   if(s<1){
      System. out. println(" :Failure Password must contain at least one letter from [[*$_#=@]]");
      flag=1;
   }
   if(flag==0)
    System.out.println( ": Success");
  
   
  
  
   
       
   
}


    }   
}
