//to using the function value for product used. 
public class producfun {
    public static int productt(int a, int b){
        int pro= a*b;
        return pro;
    }
    public static void main(String args[]){
        int a= 5;
        int b=5;
        int pro= productt(a,b);
        System.out.println("Total value : "+ pro);

        // we can do this also 
        pro=productt(15,25);
          System.out.println("2nd no. : "+ pro);
    }
}
