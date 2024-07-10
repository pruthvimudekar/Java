//swap using function.
public class swap {
    public static void swapp(int a,  int b){
        int temp= a;
        a= b;
        b=temp;
        System.out.println("a = "+a);
        System.out.println("b= "+b);
        
    }
    public static void main(String[] args) {
        int a=10;
        int b=15;
        swapp(a,b);
    }
    
}
