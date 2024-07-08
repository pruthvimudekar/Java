//half pyramid printing pattern 
public class Main{
    public  static void main(String args[]){
        int n=7;
        for(int line=1; line<=n; line++){
            for(int number=1; number <= line; number++){
                System.out.print(number);
            }
            System.out.println();
        }
    }
}
/* output 
1
12
123
1234
12345
123456
1234567
/* 
