// to find sum of diagonals 
public class diagonalsum {
    public static int diagooonal(int matrix [][]){
        int sum =0;
        
        for(int i=0; i<matrix.length;i++){                // main second 
            for(int j=0; j<matrix[0].length; j++){
                // primary diagonal
                if(i==j){
                    sum+= matrix[i][j];
                }
                // secondary diagonal
                else if(i+j == matrix.length-1){
                    sum+= matrix[i][j];
                }


            }
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        System.out.println(diagooonal(matrix));
    }
}

/*
 * for(int i=0; i<matrix.length; i++){
 *pd
 sum+= matrix[i][j];
 //sd
 if(i!= matrix.length-1-i)
 sum+= matrix[i][matrix.length-i-1];
 }
 return sum;
}
 */
