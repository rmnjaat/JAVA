@FunctionalInterface
interface Cab{
    int bookCab( String source ,String dest );
}


//_____No need use lambda expression__________________
// class ola implements Cab{
//     public void bookCab(){
//         System.out.print("Ola cab booked");
//     }
// }


public class Lambda {

    public static void main(String[] args) {

        // Cab a = new Cab();
        
        
        //used lambda expression here
        // Cab a = ( s, d)->{ System.out.println("Ola cab is booked from "+s +" to "+d); };
        Cab a = ( s, d)->{ System.out.println("Ola cab is booked from "+s +" to "+d);  return 5000; };
       
       System.out.println(a.bookCab("PGW " , "HSR"));
    }
}