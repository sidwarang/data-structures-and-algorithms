package DP;

import java.util.Stack;

/**
 * Created by Siddharth on 3/14/2015.
 */
public class TSP {
    private int cost, nodelength;
    private int[][] matrix;
    int[] visited, nodes;
    public TSP(int matrix[][])
    {
        this.matrix = matrix;
        nodelength = matrix.length;
        visited = new int[nodelength+1];
        visited[1] = 1;
    }

    public int cost(int i, int j)
    {
        if(visited[j]!=1) {
            visited[j] = 1;
            if (i != j) {
                return Math.min(matrix[i][j], cost(i,j));
            }
        }
        else
        {
            return Math.min(matrix[i][j+1], cost(i,j+1));
        }
        return 0;
    }
}
