
import java.util.*;
public class agefromin{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       
   System.out.println("Enter the age : " );
    int age=sc.nextInt();
    
    if(age>=18){
        System.out.println("The adult bhai hai tuuu");
    }
    
    else if(age>=13 && age<=18)
    {
        System.out.println("their teenage hai bhai tuu");
        
    }
    else{
        System.out.println("no adults");
    }
    
        }
}