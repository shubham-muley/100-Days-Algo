import java.util.HashMap;
import java.util.Map;
public class RepeatedChar {

    public char findfirstRepeatedChar_Map(String str){
        Map<Character,Integer> m = new HashMap<>();
        char[] ch_str = str.toCharArray();

        for(char x:ch_str){
            if(m.containsKey(x)){
                int val = m.get(x);
                m.put(x,++val);
            }
            else{
                m.put(x,1);
            }
        }

        for(char ch:ch_str){
            if(m.get(ch)!=1)
                return ch;
        }

        return Character.MIN_VALUE;
    }
}
