package Stack;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Siddharth on 3/11/2015.
 */
public class InfixPostfix {
    LLStack stack = new LLStack();
    Map<Character, Character> map = new HashMap<Character, Character>();

    public InfixPostfix() {
        map.put('*','1');
        map.put('/','1');
        map.put('+','0');
        map.put('-','0');
    }

    public void doPostfix(String input)
    {
        Character s;
        for (int i=0; i<input.length();i++)
        {
            s = input.charAt(i);
            if (Character.isDigit(s))
                System.out.print(s);
            else if (s==')')
            {
                while (stack.top()!='(')
                    System.out.print(stack.pop());
                stack.pop();
            }
            else
            {
                if(!stack.isEmpty())
                {
                    switch (Priority(s))
                    {
                        case 1:
                            stack.push(s);
                            break;
                        case -1:
                        case 0:
                            System.out.print(stack.pop());
                            stack.push(s);
                            break;
                        default:
                            stack.push(s);
                            break;
                    }
                }
                else
                    stack.push(s);
            }
        }
        if (!stack.isEmpty())
            while(!stack.isEmpty())
                System.out.print(stack.pop());
    }

    private int Priority(char c) {
        if(map.containsKey(c)&& map.containsKey(stack.top()))
            return map.get(c)-map.get(stack.top());
        return c;
    }
}
