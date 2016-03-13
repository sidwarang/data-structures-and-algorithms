package Stack;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Siddharth on 3/11/2015.
 */
public class InfixWOPostfix {
    LLStack oprnd = new LLStack();
    LLStack oprtr = new LLStack();

    Map<Character, Character> map = new HashMap<Character, Character>();

    public InfixWOPostfix() {
        map.put('*','1');
        map.put('/','1');
        map.put('+','0');
        map.put('-','0');
    }

    public void Calculate(String input)
    {
        for (int i=0; i<input.length(); i++)
        {
            System.out.println("Oprnd :"+oprnd.top()+"\nOprtr :"+oprtr.top());
            Character c;
            c =input.charAt(i);
            if(Character.isDigit(c))
            {
                oprnd.push(c);
            }
            else if (c.equals(')'))
            {

            }
            else
            {
                int out;
                if(!oprtr.isEmpty())
                {
                    switch (Priority(c))
                    {
                        case 1:
                            oprtr.push(c);
                            break;
                        case -1:
                        case 0:
                            out = Character.getNumericValue(oprnd.pop())+oprtr.pop()+Character.getNumericValue(oprnd.pop());
                            System.out.print(out);
                            oprnd.push((char) out);
                            oprtr.push(c);
                            break;
                        default:
                            oprtr.push(c);
                            break;
                    }
                }
                else
                    oprtr.push(c);
            }
        }

        while (!oprtr.isEmpty())
        {
            int out = Character.getNumericValue(oprnd.pop())+oprtr.pop()+Character.getNumericValue(oprnd.pop());
            System.out.print(out);
            oprnd.push((char) out);
        }
        if (!oprnd.isEmpty())
            System.out.print(oprnd.pop());
    }

    private int Priority(Character c) {
        if(map.containsKey(c)&& map.containsKey(oprtr.top()))
            return map.get(c)-map.get(oprtr.top());
        return c;
    }
}
