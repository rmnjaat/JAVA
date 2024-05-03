import java.util.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;

public class Dateex {

    public static void main(String[] args) {
        

        // //ex1
        Calendar c = Calendar.getInstance();

        // System.out.print(c);
        // Date d = new Date();
        // d = c.getTime();
        // System.out.print(d);



        // // ex2
        // Calendar c1 = Calendar.getInstance();
        // System.out.print(c1.getTime());

        // // ex3

        Calendar c3 = Calendar.getInstance();
        // System.out.println(c3.getActualMaximum(Calendar.DATE));
        // System.out.println(c3.getActualMaximum(Calendar.MONTH));
        // System.out.println(c3.getActualMaximum(Calendar.YEAR));
        
        
        // //ex4

        // Calendar c4 = Calendar.getInstance();
        // System.out.println(c4.getActualMinimum(Calendar.DATE));
        // System.out.println(c4.getActualMinimum(Calendar.MONTH));
        // System.out.println(c4.getActualMinimum(Calendar.YEAR));



        // LocalDate date  = LocalDate.now();
        // LocalDate date1  = LocalDate.parse("2017-04-02");
        // System.out.println(date);
        // System.out.println(date.plusDays(17));
        


        Calendar c1 = Calendar.getInstance();

        c1.add(Calendar.DATE, 1);
        System.out.println(c1.getTime());
        // System.out.println(c1.get(Calendar.SECOND));
        System.out.println(c1.getActualMaximum(Calendar.HOUR));
            c1.set(Calendar.DATE,12);
            System.out.print(c1.getTime());

    }
}