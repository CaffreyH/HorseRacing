package wordCount;

import sun.awt.datatransfer.DataTransferer;

import java.util.*;

/**
 * Created by Caffrey on 2017/8/10.
 */
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext())
        {
            String line = scanner.nextLine();
            String[] ch = line.split(" ");
       /* StringTokenizer token = new StringTokenizer(ip);
        Set<String> sortString = new TreeSet<String>();
        while (token.hasMoreElements()) {
            sortString.add("" + token.nextToken());
        }

        据说这样性能更好
        */
        Arrays.sort(ch);
/*        for(int i=0;i<ch.length;i++)
        {
            System.out.print(ch[i]+" ");
        }*/
            HashMap<String,Integer> a = new HashMap<String,Integer>();
            int ge = ch.length;
            for(int i=0;i<ch.length;i++)
            {
                if(a.containsKey(ch[i]))
                {
                }
                else
                {
                    a.putIfAbsent(ch[i],1);
                    for(int j=i+1;j<ch.length;j++)
                    {
                        if(ch[i].equals(ch[j]))
                        {
                            int gg = a.get(ch[i]);
                            a.put(ch[i],gg+1);
                        }
                    }
                }

            }
            int[] result = new int[a.size()];
            int i=0;
            for (Map.Entry<String, Integer> entry : a.entrySet()) {
                result[i]=entry.getValue();
                i++;
                //System.out.print(entry.getValue()+" ");
            }
            Arrays.sort(result);
            for(int k=0;k<result.length;k++)
            {
                System.out.print(result[k]+" ");
            }
/*          for (Map.Entry<String, Integer> entry : a.entrySet()) {
                System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
            }*/
/*

            ArrayList mappingList = new ArrayList<Map.Entry<String,Integer>>(a.entrySet());
            Collections.sort(mappingList, new Comparator<Map.Entry<String,Integer>>(){
                public int compare(Map.Entry<String,Integer> mapping1,Map.Entry<String,Integer> mapping2){
                    return mapping1.getValue().compareTo(mapping2.getValue());
                }
            });*/
            System.out.println();
        }

    }
}
