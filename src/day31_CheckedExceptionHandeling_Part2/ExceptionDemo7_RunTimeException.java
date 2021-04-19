package day31_CheckedExceptionHandeling_Part2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo7_RunTimeException {

    public static void main(String[] args) {
        parseDateToString();
        System.out.println("===============");
        try {
            convertStringToDate();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static void convertStringToDate() throws ParseException {
        String date = "2011-01-11";
        System.out.println(date);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf.parse(date);
        System.out.println(d);
    }
    public static void parseDateToString () {
        Date currentDate = new Date();
        System.out.println(currentDate);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:ss a dd/MM/yyyy");
        String formattedDate = sdf.format(currentDate);
        System.out.println(formattedDate);
    }

}
