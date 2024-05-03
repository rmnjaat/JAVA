import java.util.Calendar;
import java.util.Date;
import java.time.*;
import java.lang.Thread;

public class Datee {

    public static void main(String[] args) {

        Date d1 = new Date();
        

        System.out.println(d1);
       
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            Date d2 = new Date();
       
        System.out.println(d2);
        // System.out.println(d1.equals(d2));
        // System.out.println(d1.compareTo(d2));
        // System.out.println(d2.after(d1));
        // System.out.println(d2.getTime());

       

        //local date 
        LocalDate d = d1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        System.out.println(d);


    }
}