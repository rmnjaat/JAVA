import java.util.*;

public class sstack {



    //using arraylist
    // static class stck {
    //     static ArrayList<Integer> list = new ArrayList<>();
    //     public static boolean isEmpty() {
    //         return list.size() == 0;
    //     }
    //     public static void push(int data) {
    //         list.add(data);
    //     }

    //     public static int pop() {

    //         if (isEmpty()) {
    //             return -1;
    //         }

    //         int top = list.get(list.size() - 1);
    //         list.remove(list.size() - 1);
    //         return top;
    //     }
    //     public static int peek() {
    //         int top = list.get(list.size() - 1);
    //         return top;
    //     }
    // }



    //using linked list

    // static class Node{
    //     int data;
    //     Node next;

    //     Node(int d){
    //         this.data=d;
    //         this.next=null;
    //     }
    // }

    // static class Lstck{
    //     static Node head = null;

    //     public static boolean isEmpty(){
    //         return head==null;
    //     }

    //     public static void push(int d){

    //         Node temp=new Node(d);
    //         if(head==null){
    //             head=temp;
    //             return;
    //         }
    //         temp.next=head;
    //         head=temp;
    //     }

    //     public static int pop(){

    //         int d= head.data;
    //         Node temp = head.next;

    //         head=temp;

    //         return(d);
    //     }

    //     public static int peek(){
    //         Node temp = head;
    //         return(temp.data);

    //     }
         
    // }






    public static void main(String[] args) {

        // stck s = new stck();
        // stck.push(1);
        // stck.push(2);
        // stck.push(3);

        // System.out.println(stck.peek());
        // System.out.println(stck.pop());
        // System.out.println(stck.peek());
        
        // Lstck s = new Lstck();
        // s.push(1);
        // s.push(12);
        // s.push(123);
        // s.push(1234);
        // System.out.println(s.pop()); 
        // System.out.println(s.peek());




        //using java collection framwork


        Stack<Integer> s = new Stack<>();
         s.push(1);
        s.push(12);
        s.push(123);
        s.push(1234);
        System.out.println(s.pop()); 
        System.out.println(s.peek());

        
        


    }
}