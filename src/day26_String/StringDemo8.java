package day26;

import java.util.StringTokenizer;

public class StringDemo8 {

    public static void main(String[] args) {
        String info = "Hello, I am Santosh Lal Karna, I am from Nepal, I am Java Developer, I teach Java part time";

        StringTokenizer st = new StringTokenizer(info, ",");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
