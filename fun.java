//function used for addition; Synthx with parameter.
import java.util.*;
public class fun {
    public static int calculateSum(int a, int b){ //he 3  lines foramal Parametrs zale ahe
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int sum= calculateSum(a, b);   // ane a &b he apple arguments for calling sathi
        System.out.println("Total value is : " + sum);
    }
    
}
