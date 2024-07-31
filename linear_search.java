//liinear serach in array 
 class linear_search{
    public static int linear(int number[], int key){
        for(int i=0; i<=number.length;i++){     //main fuction.length 
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }
    
    
    public static void main(String args[]){
        int number[]={2,4,6,8,9,10,11,12};
        int key=10;
        int keyword=linear(number , key);
        if(keyword== -1){
            System.out.println("not the found : ");
        }
        else{
            System.out.println("the number is succefully find : ");
        }
    }
}

