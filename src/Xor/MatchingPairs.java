package Xor;

import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by Siddharth on 3/14/2015.
 */
public class MatchingPairs {
    public static void main(String []args)throws IOException
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringTokenizer strToken = new StringTokenizer(input);
        int count = strToken.countTokens();
        int[] arr = new int[count];

        for(int x = 0;x < count;x++){
            arr[x] = Integer.parseInt((String)strToken.nextElement());
        }

        match(arr);
    }

    private static void match(int[] arr) {
        int[] a = arr;
        int sum=0;
        for (int i=0;i<a.length;i++)
            sum = sum^a[i];
        System.out.println(sum);
    }
}
