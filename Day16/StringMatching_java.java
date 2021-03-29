import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringMatching {

    public static int[] SM(String[] strings,String[] queries)
    {
        int[] counts = new int[queries.length];
        Map<String,Integer> map = new HashMap<>();

        for(int i=0;i<strings.length;i++)
        {
            if (!map.containsKey(strings[i]))
            {
                map.put(strings[i],1);
            }
            else
            {
                map.put(strings[i],map.get(strings[i])+1);
            }
        }

        for(int i=0;i< queries.length;i++){
            if(map.containsKey(queries[i])){
                counts[i] = map.get(queries[i]);
            }
            else {
                counts[i] = 0;
            }
            System.out.println(counts[i]);
        }
        return counts;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int s = Integer.parseInt(scn.nextLine());
        String[] strings = new String[s];
        for(int i=0;i<s;i++){
            strings[i] = scn.nextLine();
        }
        int q = Integer.parseInt(scn.nextLine());
        String[] queries = new String[q];
        for(int i=0;i<q;i++){
            queries[i] = scn.nextLine();
        }

        int[] res = SM(strings,queries);
    }


    }
