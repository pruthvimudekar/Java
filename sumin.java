import java.util.*;
public class circle {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);

        float r=sc.nextFloat();
        
        float area =3.14f*r*r;   //. point madhe ahe compiler double and single ahe smaaja ta nhi mahuna f(float lavale)
        System.out.println("area of the circle : " +area);
    
    }
    
}
