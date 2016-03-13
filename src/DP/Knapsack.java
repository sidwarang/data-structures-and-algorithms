package DP;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Siddharth on 3/13/2015.
 */
public class Knapsack {
    private static int Capacity;
    private static int items;
    private static int[] v ;
    private static int[] w ;
    private static int values[][];

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Knapsack Capacity :");
        Capacity = sc.nextInt();
        System.out.println("Enter number of items :");
        items = sc.nextInt();
        System.out.println("Enter values of items :");
        v = new int[items+1];
        w = new int[items+1];

        for (int i=1;i<=items; i++)
        {
            v[i] = sc.nextInt();
        }
        System.out.println("Enter weights of items :");
        for (int i=1;i<=items; i++)
        {
            w[i] = sc.nextInt();
        }

        values = new int[items+1][Capacity+1];
        for (int i=0;i<=items;i++)
            values[i][0] = 0;
        for (int i=0;i<=Capacity;i++)
            values[0][i] = 0;
        for (int j=1;j<=items;j++)
        {
            for (int i=1;i<=Capacity;i++)
            {
                if(w[j]<=i-w[j-1])//error : how to determine if w[j-1] or w[j-2]... etc.
                    values[j][i] = values[j-1][i-w[j]] + v[j];
                else if (w[j]<=i)
                    values[j][i] = Math.max(v[j]+values[j-1][i-w[j]], values[j-1][i]);
                else
                    values[j][i] = values[j-1][i];
            }
        }

        for (int j=1;j<=items;j++)
        {
            System.out.println();
            for (int i=1;i<=Capacity;i++)
            {
                System.out.print(values[j][i]+" ");
            }
        }
    }

}
