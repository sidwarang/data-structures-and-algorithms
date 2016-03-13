package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Siddharth on 3/6/2016.
 */
public class Solution {
    public static void main(String[] args) {
        //String s = "dir1\n dir11\n a.jpeg\n b.jpeg\n dir12\n  picture.jpeg\n  dir121\n  file1.txt\ndir2\n file2.gif";
        String s="c.png\ndirec1\n d2\n  a.txt\n  b.fpg\n d3\n  d5\ndirec2\n a.jpeg\n d5\n  d8\n  d9\n   cal.png\ncde.png\nklm.png";
        int sumCount = 0;
        String s1[] = s.split("\n");
        System.out.println(s);
        List<String> list = listPaths(s1);
        for (Iterator iterator = list.iterator(); iterator.hasNext();) {
            String string = (String) iterator.next();
            System.out.println(string);
            if(string.contains(".jpeg") ||string.contains(".png") || string.contains(".gif") ){
                String path= trimPathByCountDiff(string, 0);
                System.out.println("Trimmed path is "+path);
                sumCount=sumCount+path.length();
                System.out.println(sumCount);
            }
        }

        System.out.println("Sum Count is "+sumCount);

    }

    public static List<String> listPaths(String[] s1){
        String path = "";
        int prevCount = -1;
        List<String> list =  new ArrayList<String>();
        for (int i = 0; i < s1.length; i++) {
            String currString = s1[i];
            int currCount = 0;
            for (int j = 0; j < currString.length(); j++) {
                if (currString.charAt(j) == ' ')
                    currCount++;
                else
                    break;
            }
            currString=currString.trim();

            if(prevCount<currCount){
                path = path+"/"+currString;
            }

            if(prevCount>=currCount){
                System.out.println(path);
                list.add(path);
                int countDiff = prevCount-currCount;
                path = trimPathByCountDiff(path, countDiff);
                path = path+"/"+currString;

            }
            if(i==s1.length-1){
                System.out.println(path);
                list.add(path);
            }
            prevCount=currCount;
        }

        return list;
    }

    public static String trimPathByCountDiff(String path, int countDiff){
        String str[] = path.split("/");
        String newPath =  "";
        for (int i = 0; i < (str.length)-countDiff-1; i++) {
            newPath = newPath+"/"+str[i];
        }

        return newPath.substring(1);
    }
}
