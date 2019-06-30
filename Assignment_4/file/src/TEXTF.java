package textf;

import java.io.*;
import java.util.*;

public class TEXTF {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(new File("ttt.txt"))));
        PrintWriter output = null;
        output = new PrintWriter(new File("ttd.txt"));
        
        ArrayList<String> words = new ArrayList<>();
        ArrayList<Integer> count = new ArrayList<>();
        
        String str;
        
        str = in.readLine();
        String tmp = "" ;
        for(int i=0;i<str.length();i++)
        {
            
            if((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'))
            {
                tmp+=str.charAt(i);
            }
            else
            {
                if(words.contains(tmp))
                {
                    int index = words.indexOf(tmp);
                    count.set(index, count.get(index)+1);
                }
                else
                {
                    words.add(tmp);
                    count.add(1);
                }
                tmp = "";
            }
        }
        
        for(int i=0;i<words.size();i++)
        {
            System.out.println(words.get(i) + " Occured " + count.get(i));
            output.println(words.get(i) + " Occured " + count.get(i));
         
        }
        int tot=0;
        for(int i = 0 ; i<count.size();i++)
            tot=tot+count.get(i);
        
        System.out.println("Total Unique Char " + count.size());
        output.println("Total Unique Char " + count.size());
        System.out.println("Total Character " + tot);
        output.println("Total Character "+ tot);
        
        output.close();
    }
    
}
