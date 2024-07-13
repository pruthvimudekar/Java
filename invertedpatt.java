public class invertedpatt {
    public static void invertedd(int n){
     // outer 

     for(int i=1; i<=n;i++){

        //innear

        for(int j=1; j<=n-i; j++){
            System.out.print(" ");
        }


        //star print
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }

         System.out.println();
     }

   
    }
public static void main(String[] args) {
    
    invertedd(4);
}

}
