public class reversewhile {
    public static void main(String args[]){

        int n = 15442;

        while(n>0){
            int reverse = n %10 ;
            System.out.print(reverse);
        n= n/10;
        }
        System.out.print(" ");
    }
}
