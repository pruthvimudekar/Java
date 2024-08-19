public class substring {
public static String substringgg(String str, int si, int ei)// si means starting index and ei is the ending index
{
    String substr="";
    for(int i=si; i<ei; i++){
        substr+= str.charAt(i);
    }
    return substr;
}



    public static void main(String[] args) {
        String str="Hello World";
      //  System.out.println(substringgg(str,0 ,5));  or

      
      System.out.println(str.substring(0,5));
}
}