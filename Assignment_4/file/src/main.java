import java.util.Scanner;
import java.io.*;
import java.lang.*;


public class main {
    public static void main(String[] args) {

        File file=new File("C:\\Users\\Emon\\Desktop\\input.txt");

        Scanner input = null;
        try {
            input = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String str;
        String[] out;

        out = new String[1000];

        int word=0,unique=0,k,l,m;

        boolean go = true;

        str = input.nextLine();
        String[] line = str.split("[ \".,;:'?!{}()=]" );

        for(String temp:line)
        {
            go = true;
            for(int i=0;i<unique;i++)
            {
                if(temp.length()>0) {
                    if (temp.equals(out[i]) && ((temp.charAt(0) >= '0' && temp.charAt(0) <= '9' )|| ( (temp.charAt(0) >= 'A' && temp.charAt(0) <= 'Z' )||( temp.charAt(0) >='a' && temp.charAt(0) <= 'z')))) {
                        word++;
                        go = false;
                        break;
                    }
                }
            }
            if(go && temp.length()>0)
            {
                if((temp.charAt(0) >= '0' && temp.charAt(0) <= '9')||(temp.charAt(0) >= 'A' && temp.charAt(0) <= 'Z' )||( temp.charAt(0) >='a' && temp.charAt(0) <= 'z')) {
                    out[unique] = temp;
                    word++;
                    unique++;
                }
            }
        }
        System.out.println("Total word " + word);
        System.out.println("Total unique word " + unique);
        for(k=0;k<unique;k++)
        {
            String temp = out[k];
            int time = 0;
            for(String tem:line)
            {
                if(temp.length() > 0 && tem.length() > 0)
                {
                    if(temp.equals(tem))
                         time++;
                }
            }
            System.out.println("\"" + temp + "\"" + " occured " + time + " times.");
        }
    }
}