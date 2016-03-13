package Stack;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Siddharth on 3/10/2015.
 */
public class SimpleMatchTags {
    private static Map<String,String> map;
    LLStack stack = new LLStack();
    public SimpleMatchTags()
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

    public String getOutput(String input)
    {
        String in = input;
        String str= "";
        String out= "";
        while(in.length()>0)
        {
            str = "";
            int j, i = 0;

            while (in.length()-i>0 && in.charAt(i)!='<')
                i++;
            j=i+1;
            while (in.length()-j>0 && in.charAt(j)!='>')
                j++;

            if (in.length()>0 && in.charAt(j)=='>'){
                if (in.length()-j>0)
                    out = in.substring(i,j+1);
                /*uncomment
                else
                    stack.push(in.substring(i));
                */
            }

            str = in.substring(i,++j);
            /*uncomment
            if (map.containsKey(str))
            {
                stack.push(map.get(str));
                stack.push(out);
            }

            else
                i++;
            */
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
}
