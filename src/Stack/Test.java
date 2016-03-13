package Stack;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Siddharth on 3/10/2015.
 */
public class Test {
    public static void main(String[] args) throws IOException{

        Scanner sc;
        String in = "";
        in = (new Scanner(System.in)).next();
        InfixWOPostfix inp = new InfixWOPostfix();
        inp.Calculate(in);
    }
}
