package academy.devdojo.javaoneforall.javacore.Sformatting.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        DateFormat[] dfa = new DateFormat[7];
        dfa[0] = DateFormat.getInstance();
        dfa[1] = DateFormat.getDateInstance();
        dfa[2] = DateFormat.getDateTimeInstance();
        dfa[3] = DateFormat.getDateInstance(DateFormat.SHORT);
        dfa[4] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        dfa[5] = DateFormat.getDateInstance(DateFormat.LONG);
        dfa[6] = DateFormat.getDateInstance(DateFormat.FULL);
        Date date = new Date();
        for(DateFormat dateFormat: dfa){
            System.out.println(dateFormat.format(date));
        }
    }
}
