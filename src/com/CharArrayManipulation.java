package com;

/**
 * Created by Siddharth on 3/9/2016.
 */
public class CharArrayManipulation {
    public static void main(String[] args) {
        Character a[] = {'M','r',' ','J','o','h','n',' ','S','m','i','t','h',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '};
        a = addPercentTwenty(a,13);
        for(Character c : a){
            System.out.print(c);
        }
    }

    private static Character[] addPercentTwenty(Character[] a, int length) {
        int spaces = countSpaces(a,a.length);
        int loc = length+(spaces*2);
        for(int i=length-1;i>=0;i--){
            if(!(a[i]==' ')) {
                a[--loc] = a[i];
            }
            else {
                a[--loc] = '0';
                a[--loc] = '2';
                a[--loc] = '%';
            }
        }
        return a;
    }

    private static int countSpaces(Character[] a, int length) {
        int count=0;
        boolean flag = false;
        for(int i=length-1;i>=0;i--){
            if(a[i]==' ') {
                if (flag)
                    count++;
            }
            else
                flag = true;
        }
        return count;
    }
}
