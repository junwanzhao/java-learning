package top.hyzhu.java.tool.time;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeTools {
        public static String formatTime(Date date){
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:MM:SS");
            return df.format(date);
        }

    public static void main(String[] args) {
        System.out.println(DateTimeTools.formatTime(new Date()));
    }
}

