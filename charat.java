// find words in positions using the function 
public class charat {
public static void positions(String str){
    for(int i=0;i<str.length();i++){
        System.out.print(str.charAt(i)+ " ");
    }
System.out.println();
}



    public static void main(String[] args) {
        String firstname= "pruthvi";
        String lastName=" mudekar";
        String fullName = firstname + " "+ lastName;
        positions(fullName);


    }
}
