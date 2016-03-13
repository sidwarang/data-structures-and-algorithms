package Sorting;

/**
 * Created by Siddharth on 4/28/2015.
 */
public class Selection {
    public void Sort(int D[], int n)
    {
        int i, j, min, temp;
        for (i = 0; i<n-1; i++) {
            min = i;
            for (j = i + 1; j < n; j++)
                if (D[j] < D[min])
                    min = j;


            temp = D[min];
            D[min] = D[i];
            D[i] = temp;
        }
        for(int x : D)
            System.out.print(x+" ");
    }
}
