
// Qst. Multiplication of 2 arrays 

public class Problem5 {
    public static void main(String[] args) {
        int[][] A = {{3,5,9},{7,6,2},{4,3,5}};
        int[][] B = {{1,0,0},{0,1,0},{0,0,1}};
        int[][] C = new int[3][3];

        for(int i = 0; i < A.length; i++){
            for (int j = 0; j <A[0].length ; j++) {

                C[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    C[i][j] = C[i][j] + A[i][k]*B[k][j];
                }
            }   
        }
        
        for (int[] X : C) {
            for (int Y : X) {
                System.out.print(Y + " ");
            }
            System.out.println(" ");
        }
        
    }
}

