package com;

/**
 * Created by Siddharth on 3/9/2016.
 */
public class Sol16 {
    public static void main(String[] args) {
        int[][] matrix = {{12,2,13,6},{2,6,9,0},{9,1,14,12},{3,12,5,1}};
        printMatrix(matrix);
//        matrix = rotate(matrix,4);
//        printMatrix(matrix);
        matrix = detectZeros(matrix,4,4);
        printMatrix(matrix);
    }

    private static int[][] detectZeros(int[][] matrix, int M, int N) {
        int result[][] = new int[M][N];
        boolean rows[] = new boolean[M];
        boolean cols[] = new boolean[N];
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                    result[i][j]= -1;
            }
        }
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                if(matrix[i][j]!=0&&result[i][j]!=0){
                    result[i][j]=matrix[i][j];
                }
                else {
                    if(matrix[i][j]==0){
                        rows[i] = true;
                        cols[j] = true;
                    }
                }
            }
        }

        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                if(rows[i]||cols[j]){
                    result[i][j]=0;
                }
            }
        }
        return result;
    }

    private static void printMatrix(int[][] matrix) {
        for(int[] arr : matrix){
            for(int i : arr){
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static int[][] rotate(int[][] matrix, int n) {
        for(int layer=0;layer<n/2;layer++){
            int first = layer;
            int last = n-1-layer;
            for(int i=first;i<last;i++){
                int offset = i-first;
                int top = matrix[first][i];

                matrix[first][i] = matrix[last-offset][first];

                matrix[last-offset][first] = matrix[last][last-offset];

                matrix[last][last-offset] = matrix[i][last];

                matrix[i][last] = top;
            }
        }
        return matrix;
    }
}
