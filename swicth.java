import java.util.*;
public class swicth {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
 
        System.out.println("enter the case value : ");
        
        int number= sc.nextInt();
        switch (number) {
            case 1: System.out.println("I want burger");
                
                break;
                case 2 : System.out.println("i wan sandwitch");
                break;
        
            default: System.out.println("Not hungry bro");
                break;
        }


        
    }

    
}
