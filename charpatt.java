// print the characterstics pattern.........
public class charpatt {
    public static void main(String args[]){
        int n=4;
        char ch='A';

        //outer loop
        for(int line=1; line<=n; line++ ){
            //inner loop
            for(int chars=1; chars <=line ; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        
        }
    }
}
/* output
A
BC
DEF
GHIJ
 * 
 */