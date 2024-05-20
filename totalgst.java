import java.util.*;
public class square {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
    
       float pen= sc.nextFloat();
       float pencil= sc.nextFloat();
       float eraser =sc.nextFloat();
       float total=(pen+pencil+eraser);
       
       System.out.println("Total : "+ total);
       
       float newtotal= total + (0.18f * total);
       
       System.out.println("gst total : " + newtotal);
       

        
    }
    
}