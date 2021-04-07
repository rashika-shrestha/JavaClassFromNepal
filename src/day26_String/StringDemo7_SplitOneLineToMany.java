package day26_String;

public class StringDemo7_SplitOneLineToMany {

    public static void main(String[] args) {
        String info = "Hello, I am Santosh Lal Karna, I am from Nepal, I am Java Developer, I teach Java part time";
        String [] ss = info.split(",");
        for(String s: ss){
            System.out.println(s);
        }
    }
}
