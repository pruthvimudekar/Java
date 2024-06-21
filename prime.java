// check if a number is prime or not 
import java.util.*;
public class prime 
{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
           
           System.out.println("Enter the number : ");
        int n= sc.nextInt();
        if(n == 2){
            System.out.println("n is prime ");
        }
        else {
            boolean isPrime= true;
        for(int i= 2; i<=n-1; i++){

            if(n % i == 0){ //n is mulitple of i(i not equal to  1)
                isPrime = false;

            }
        }

        if(isPrime == true){
            System.out.println("N is prime no ");
        }
        else{
            System.out.println("n is not prime ");
        }
    }
        }

        
    
}