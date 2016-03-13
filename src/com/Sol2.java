package com;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Siddharth on 3/8/2016.
 */
public class Sol2 {
    public static void main(String[] args) {
        String s = "dir1\n dir11\n a.jpeg\n b.jpeg\n dir12\n  picture.jpeg\n  dir121\n  file1.txt\ndir2\n file2.gif";
        String ls[] = s.split("\n");
        int sum = 0;
        List<String> list = getListOfPaths(ls);
        for(String str : list){
            if(str.contains(".jpeg") ||str.contains(".png") || str.contains(".gif")) {
                System.out.println(str);
                String path = trimPath(str,0);
                System.out.println(path);
                sum+=path.length();
            }
        }
        System.out.println(sum);
    }

    private static List<String> getListOfPaths(String[] ls) {
        List<String> s = new ArrayList<String>();
        int count = -1;
        String pathname = "";
        for (String l : ls) {
            int level = 0;
            for (int j = 0; j < l.length(); j++) {
                if (l.charAt(j) == ' ')
                    level++;
                else
                    break;
            }
            l = l.trim();

            if(count<level){
                pathname += pathname + "/" + l;
            }
            if(count>=level){
                s.add(pathname);
                pathname = trimPath(pathname, count-level);
                pathname = pathname +"/"+ l;
            }
            count = level;

        }
        s.add(pathname);
        return s;
    }

    private static String trimPath(String pathname, int level) {
        for(int i=0;i<=level;i++){
            int pth = pathname.lastIndexOf("/");
            pathname = pathname.substring(0,pth);
        }
        return pathname;
    }


}
