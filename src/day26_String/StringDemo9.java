package day26_String;

import java.util.StringTokenizer;

public class StringDemo9 {

    public static void main(String[] args) {
        String info = "Hello,, I am Santosh Lal Karna,, I am from Nepal,, I am Java Developer,, I teach Java part time";

        String [] ss = info.split(",");
        System.out.println(ss.length);
        for(String s: ss){
            System.out.println(s);
        }


        StringTokenizer st = new StringTokenizer(info, ",");
        System.out.println(st.countTokens());
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
