package Sorting;

/**
 * Created by Siddharth on 4/28/2015.
 */
public class Insertion {
    public void Sort(int D[], int n)
    {
        int i, j=0, v;
        for (i=2;i<n-1;i++)
        {
            v = D[j];
            j=i;

            while (D[j-1]>v && j>=1 )
            {
                D[j]=D[j-1];
                j--;
            }
            D[j] = v;
        }
    }
}
