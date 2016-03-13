package com;

/**
 * Created by Siddharth on 3/9/2016.
 */
public class Sol15 {
    public static void main(String[] args) {
        System.out.print(compress("aabcccccaaa"));
    }

    private static String compress(String str) {
        char[] a = str.toCharArray();
        String result = "";
        int count = 0;
        Character ch = a[0];
        for(Character c : a){
            if(ch==c){
                count++;
            }
            else {
                result = result+ch+count;
                ch = c;
                count=1;
            }
        }
        result = result+ch+count;
        return result;
    }
}
