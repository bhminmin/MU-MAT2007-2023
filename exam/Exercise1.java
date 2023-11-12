// package exam;

public class Exercise1{
    public static boolean isSkewsymmetric(int[][] matrix){ 

        // check if the matrix in input is null
        if(matrix==null){
            System.out.println("The imput matrix is null.");
            return false;
        }

        // check if the matrix in input is valid (a square matrix)
        if(!checkMatrix(matrix)){
            System.out.println("The imput matrix is not a square matrix.");
            return false; 
        }

        // check for symmetry
        int rows = matrix.length;
        for(int i=0; i<rows; i++){
            for(int j=i+1; j<rows; j++){ // optimizing the inner cycle to avoid cycling on the whole matrix
                if(matrix[i][j]!=-matrix[j][i]){
                    // if we find a cell which doesn't verify the property we return false
                    return false;
                }
            }
        }

        // if we finish the loop the symmetry is verified, hence we return true
        return true;


    }

    private static boolean checkMatrix(int[][] matrix) {
        int rows = matrix.length;
        for(int i=0; i<rows; i++){
            if(matrix[i].length != rows){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] matrix1 = null;
        int[][] matrix2 = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] matrix3 = { { 0, 2, 3 }, { -2, 0, 6 }, { -3, -6, 0 } };
        int[][] matrix4 = { { 0, -2, -3 }, { 2, 0, -8 }, { 3, 8, 0 } };
        int[][] matrix5 = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
        int[][] matrix6 = { { 1, 2, 3 }, { 8, 9, 8 }, { 3, 2 } };
        System.out.println(isSkewsymmetric(matrix1));
        System.out.println(isSkewsymmetric(matrix2));
        System.out.println(isSkewsymmetric(matrix3));
        System.out.println(isSkewsymmetric(matrix4));
        System.out.println(isSkewsymmetric(matrix5));
        System.out.println(isSkewsymmetric(matrix6));
    }
}
