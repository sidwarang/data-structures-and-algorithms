package Sorting;

/**
 * Created by Siddharth on 4/28/2015.
 */
public class Bubble {
    public void Sort(int D[], int n) {
        int temp, i, pass;
        for (pass = n - 1; pass >= 0; pass--)
            for (i = 1; i < D.length-1; i++)
                if (D[i ] > D[i+1]) {
                    temp = D[i];
                    D[i] = D[i+1];
                    D[i+1] = temp;
                }
        for(int x : D)
        System.out.print(x+" ");
    }
}
