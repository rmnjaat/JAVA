interface A {

    default void printHello() {
        System.out.println("Hello");
    }

}

interface A2 {

    default void printHello() {
        System.out.println("Hello A2");
    }

}

class B implements A, A2 {
    // public void printHello(){
    // System.out.println("Hello World");
    // }
    public void printHello(){
         A.super.printHello();
         A2.super.printHello();
    }

    public void hii(){
        System.out.println("Hii");
    }
}

class C implements A {
    // public void printHello(){
    // System.out.println("Hello World C");
    // }

    public void hii() {
        System.out.println("Hii C");
    }
}

public class OOPS {

    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        // b.printHello();
        // c.printHello();
        // b.hii();

    }
}