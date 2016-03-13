package Xor;

/**
 * Created by Siddharth on 5/1/2015.
 */
public class StringRemover {
    int indices[];
    int ind = 0;
    void removeChars(String str, String rmv)
    {
        indices = new int[str.length()];
        for (int i=0;i<str.length();i++)
        {

            Character r = str.charAt(i);
            removeChars(str, r);
        }
    }

    void removeChars(String str, Character r)
    {
        int index = str.indexOf(r);
        indices[ind]=index;
        index = str.indexOf(r, index + 1);
    }
}
