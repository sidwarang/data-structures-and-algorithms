package com;

/**
 * Created by Siddharth on 3/9/2016.
 */
public class Sol18 {
    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";
        if(s1.length()==s2.length()){
            s2 = s2 + s2;
            System.out.print(isSubstring(s2,s1));
        }
        else {
            System.out.print(false);
        }
    }

    private static boolean isSubstring(String s2, String s1) {
        return s2.contains(s1);
    }
}
