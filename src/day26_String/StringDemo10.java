package day26_String;

public class StringDemo10 {

    public static void main(String[] args) {
        System.out.println(isYes("Yes"));
        System.out.println(isYes("yes"));
        System.out.println(isYesOrNo("Yes"));
        System.out.println(isYesOrNo("no"));
        System.out.println(isNumber("4"));
        System.out.println(isNumber("u"));
    }

    public static boolean isYes(String s) {
        return s.matches("[Y|y]es");
    }

    public static boolean isYesOrNo(String s) {
        return s.matches("[Y|y]es|[N|n]o");
    }

    public static boolean isNumber(String s) {
        return s.matches("[0-9]");
    }

    //    ^                 # start-of-string
//            (?=.*[0-9])       # a digit must occur at least once
//            (?=.*[a-z])       # a lower case letter must occur at least once
//            (?=.*[A-Z])       # an upper case letter must occur at least once
//            (?=.*[@#$%^&+=])  # a special character must occur at least once
//            (?=\S+$)          # no whitespace allowed in the entire string
//            .{8,}             # anything, at least eight places though
//    $                 # end-of-string
    public static boolean isValidPassword(String s) {
        String pass = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
        return s.matches(pass);
    }
}
