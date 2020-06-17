package day_01.demo_01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        Date date = null;
        try {
             date = sdf.parse("1999-1201");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);
        System.out.println("123");

        int arr[] = {1,2,3};
        try {
            System.out.println(arr[3]);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("==========================");
    }
}
