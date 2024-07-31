//largest value find out in array 
public class largest_no {

public static int largestget(int number[]){
    int largestt=Integer.MIN_VALUE;   
         //infinity
    for(int i=0; i<number.length; i++){

        if(largestt<number[i]){
            largestt= number[i];
        }
    }
    return largestt;

}

    public static void main(String args[]){
    int number[]={1,5,4,3,8,6};
    System.out.println("larges value is : "+ largestget(number));
}
}