
// public class eexceptionHandling {

//     public static void main(String[] args) {
//         try {
//             int a = Integer.parseInt("12");
//             // int b = a/0;
//             // return;
         

//         }   
//         // } catch (NumberFormatException e) {
//         //     System.out.println("Catch e");
//         // }
//         // catch(Exception f){
//         //     System.out.println("Catch f");

//         // }
        
//         finally{
//         System.out.println("Inside Final Block");
//         }
//     System.out.println("PROGRAM ENDS HERE");

//     }
// }


//if only try and catch block then code will run smoothly and  also print "PROGRAM ENDS HERE"
//if you chage hierarchy 






//own excecption code  store in file same as exception name

// public class ownException extends Exception{
//     public ownException();
//     public ownException(String s){
//         super(s);
//     }
//     public ownException(Throwable cause){
//         super(cause);
//     }
// }

// throw new ownException();
// throw new ownException("String");
// throw new ownException(new RuntimeException());





public class eexceptionHandling {

    public void  oddChecker(int n){
        if(n%2==0){
            System.out.println("Nummber is even");
        }
        else{
            throw new ArithmeticException("Number id odd");
        }
    }
    public static void main(String[] args) {
        
        
    }
}