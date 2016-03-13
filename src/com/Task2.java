package com;

import java.util.*;

/**
 * Created by Siddharth on 3/8/2016.
 */
public class Task2 {
    public static void main(String[] args) {
        System.out.println(solution("dir1\n" +
                " dir11\n" +
                " a.jpeg\n" +
                " b.jpeg\n" +
                " dir12\n" +
                "  picture.jpeg\n" +
                "  dir121\n" +
                "  file1.txt\n" +
                "dir2\n" +
                " file2.gif"));
    }
    public static int solution(String S) {
        String ls[] = S.split("\n");
        int sum = 0; //--------------
        List<String> list = getListOfPaths(ls);
        for(String l : list){
            if(l.contains(".jpeg") ||l.contains(".png") || l.contains(".gif")) { //-------------
                System.out.println(l);
                String path = trimPath(l,0);
                System.out.println(path);
                sum+=path.length();
            }
        }
        return sum;
    }

    private static List<String> getListOfPaths(String[] ls) {
        List<String> list = new ArrayList<String>();
        int count = -1;  //------------
        String pathname = "";
        for (String l : ls) {
            int level = 0;
            for (; level < l.length(); level++) {
                if (!(l.charAt(level) == ' '))
                    break;
            }
            l = l.trim();

            if(count<level){
                pathname = pathname + "/" + l;
            }
            if(count>=level){
                list.add(pathname);
                pathname = trimPath(pathname, count-level); //-------
                pathname = pathname +"/"+ l;
            }
            count = level;

        }
        list.add(pathname);
        return list;
    }

    private static String trimPath(String pathname, int level) {
        for(int i=0;i<=level;i++){
            int pth = pathname.lastIndexOf("/");    //-----------
            pathname = pathname.substring(0,pth);
        }
        return pathname;
    }
}
