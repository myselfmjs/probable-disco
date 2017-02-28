package test;

import java.sql.Date;

/**
 * Created by majunsheng on 2017/2/28.
 */
public class DateDemo {
    public static void main(String[] args) {

        StringToDate();
    }
    public static void StringToDate(){
        String dateStr = "2017-02-28";
        Date date = Date.valueOf(dateStr);
        System.out.println(date);
        System.out.println(dateStr.substring(1));

    }
}
