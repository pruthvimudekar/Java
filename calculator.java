//+ - % * /
import java.util.*;
public class calculator {
    public static void main(String args []){
        Scanner sc= new Scanner(System.in);

     System.out.println("enter the a");
     int a= sc.nextInt();

     System.out.println("enter the b");
     int b= sc.nextInt();

     System.out.println("enter opertor");
     char opertor = sc.next().charAt(0);

     switch (opertor) {
         
        case '+': System.out.println(a+b);
        break;
        case '-': System.out.println(a-b);
        break;
        case '*': System.out.println(a*b);
        break;
        case '/': System.out.println(a/b);
        break;
        case '%': System.out.println(a%b);
        break;




     
        default: System.out.println("no one wrong opearand");
            break;
     }

   
    }
    
}
