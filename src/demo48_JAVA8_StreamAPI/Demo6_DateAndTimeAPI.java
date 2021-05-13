package demo48_JAVA8_StreamAPI;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Demo6_DateAndTimeAPI {

    public static void main(String[] args) {
        Date currentDate = new Date();
        System.out.println(currentDate);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(currentDate));
        System.out.println(LocalDate.now());
        System.out.println(LocalDateTime.now());
        System.out.println(Instant.now());

        LocalDate l = LocalDate.of(2011, 01, 11);
        System.out.println(l);
        LocalDateTime ld = LocalDateTime.of(2001, 03, 12, 12, 34);
        System.out.println(ld);
        DateTimeFormatter dft = DateTimeFormatter.ofPattern("YYYY/MM/DD");
        System.out.println(dft.format(l));
    }
}