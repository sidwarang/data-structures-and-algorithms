package Stack;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Siddharth on 3/10/2015.
 */
public class Balancing {
    LLStack stack = null;
    Map<Character, Character> map = null;

    public Balancing() {
        stack = new LLStack();
        map = new HashMap<Character, Character>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
    }

    public Character doBalance(Character in)
    {
        if (map.containsValue(in))
        {
            Character c = stack.pop();
            if (in == map.get(c)) {
                System.out.println("popped : " + map.get(c));
                return 0;
            }
            else
            {
                System.out.println("Error 1");
                return 1;
            }
        }
        else
            if (map.containsKey(in))
                stack.push(in);
                System.out.println("pushed : "+in);
                return 0;
    }

}
