package Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Siddharth on 3/10/2015.
 */
public class MatchingTags {
    Map<String,String> map;
    LLStack stack = new LLStack();
    public MatchingTags()
    {
        map = new HashMap<String, String>();
        map.put("<head>","</head>");
        map.put("<table>","</table>");
        map.put("<tr>","</tr>");
        map.put("<th>","</th>");
        map.put("<td>","</td>");
        map.put("<body>","</body>");
        map.put("<form>","</form>");
    }
    /*uncomment
    public String getOutput(String input)
    {
        String in = input;
        String str= "";
        String out= "";
        while(in.length()>0)
        {
            str = "";
            int i = 0;

            while (in.length()-i>0 && in.charAt(i)!='<') {
                str = str + in.charAt(i);
                i++;
            }

            if (str!="")
            {
                stack.push(str);
                in = in.substring(i);
            }

            if (in.length()-i==0)
            {
                stack.push(in);
                return stackOut();
            }
            int j=i;

            while (in.length()-j>0 && in.charAt(j)!='>')
                j++;

            if (in.length()>0 && in.charAt(j)=='>'){
                if (in.length()-j>0)
                    out = in.substring(i,j+1);//stack.push(in.substring(i,j+1));
                else
                    stack.push(in.substring(i));
            }


            if (in==null || in.length()==0)
                return stackOut();
            str = in.substring(i,++j);

            if (map.containsKey(str))
            {
                 add code to push text if no '<' tag found in adjacent index AND recursively call this method to push
                 more tags if a tag is found after this.

                stack.push(map.get(str));
                stack.push(out);
            }

            else
                i++;
            in = in.substring(j,in.length());
        }
        return stackOut();
    }

    private String stackOut() {
        String out ="";
        while(!stack.isEmpty())
            out = out + stack.pop();
        return out;
    }
        */
}
