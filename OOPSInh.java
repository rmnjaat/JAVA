// Parent class
class Parent {
    public void commonMethod() {
        System.out.println("This is a common method in Parent class.");
    }
    
    public void differenParent() {
        System.out.println("This is a different method in Parent class.");
    }
}

// Child class
class Child extends Parent {
    @Override
    public void commonMethod() {
        System.out.println("This is a common method in Child class.");
    }

    public void differenChild() {
        System.out.println("This is a different method in Parent class.");
    }
}
public  class OOPSInh{
    public static void main(String[] args) {
        // Parent parent = new Parent();
        
        Parent parent = new Child();
        // parent.commonMethod();
        // parent.differenParent();
        //this willl raise an errror;  -> 
        // parent.differenChild();
        
        // Child child = new Parent();

        System.out.print(parent.getClass());

        
        // child.differenParent();
        // child.differenParent();

    }
}
