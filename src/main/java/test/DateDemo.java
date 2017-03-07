package test;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by majunsheng on 2017/2/28.
 */
public class DateDemo {
    public static void main(String[] args) throws ParseException {

        //StringToDate();
        ComporeDate();

    }
    public static void StringToDate(){
        String dateStr = "2017-02-28";
       // Date date = Date.valueOf(dateStr);
       // System.out.println(date);
        System.out.println(dateStr.substring(1));

    }

    //比较两日期的大小
    public static void ComporeDate() throws ParseException {
        Date date1 = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String dateStr = "2017-02-01";
        Date date2 = dateFormat.parse(dateStr);

        int i = date1.compareTo(date2); //两日期比较大小，大于返回1，小于返回-1，等于返回0

        //比较两日期相差多少天
        Calendar aCalendar = Calendar.getInstance();
        aCalendar.setTime(date1);
        int i1 = aCalendar.get(Calendar.DAY_OF_YEAR); //当前日期为该年的第？天
        aCalendar.setTime(date2);
        int i2 = aCalendar.get(Calendar.DAY_OF_YEAR);

        System.out.println(i);
        System.out.println(i1+"------"+i2);
        System.out.println(i1-i2);


    }
}
