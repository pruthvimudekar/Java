//inverted number using number

public class invertednumber {
 public static void invertedfun(int n){

    //outer 
    for(int i=1; i<=n; i++){

        //innear

        for(int j=1; j<=n-i+1; j++){
            System.out.print(j);
        }
        System.out.println("");
    }
 }
 public static void main(String[] args) {

 invertedfun(5);

 }
    


}
