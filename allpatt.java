public class allpatt {
    public static void main(String[] args) {
      
        int n=4;
        char ch='A';
        //star
        for(int line=1; line<=n; line++){
            //inner loop
            for(int star=1; star<=line; star++){
                System.out.print("*");
            }
            System.out.println();
        }


        for(int line=1; line<=n; line++)
        {
{
    for(int star=1; star<=4-line+1; star++){
        System.out.print("@");
    
    }
    System.out.println();
}
    }
//half pyramid
for(int line=1; line<=n; line++){
    for(int number=1; number<=line; number++){
        System.out.print(number);
    }
    System.out.println();
}

//char pattern
for(int line=1; line<=n; line++){
    for(int chars=1; chars<=line; chars++){
        System.out.print(ch);
        ch++;
    }
    System.out.println();
}





    }
}



