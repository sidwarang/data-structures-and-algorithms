package com;

import java.util.*;

/**
 * Created by Siddharth on 3/8/2016.
 */
public class MathSol2 {
    public static void main(String[] args) {
        System.out.print(getMap(223336226));
    }

    public static int getMap(int number) {
        List<Integer> list = new ArrayList<Integer>();
        String num = String.valueOf(number);
        String first = num.substring(0,1);
        for(int i=1;i<num.length();i++){
            String nextNum = num.substring(i,i+1);
            if(first.contains(nextNum)){
                first = first + nextNum;
            }
            else {
                if(first.length()>1)
                    list.add(Integer.parseInt(num.substring(0,i-1)+num.substring(i)));
                first = nextNum;
            }
        }
        Collections.sort(list);
        Collections.reverse(list);
        return list.get(0);
    }
}
