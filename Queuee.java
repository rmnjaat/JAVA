import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Queuee {

    // static class queue{
    // static int arr[];
    // static int size;
    // static int rear;

    // queue(int n){
    // arr= new int[n];
    // size=n;
    // rear = -1;
    // }

    // public static boolean Isempty(){
    // return rear == -1;
    // }

    // //adding element
    // public static void add(int data){
    // if(rear==size-1){
    // System.out.println("Queue is full");

    // }
    // rear++;
    // arr[rear]=data;
    // }

    // public static int remove(){
    // if(Isempty()){
    // return -1;
    // }

    // int front = arr[0];

    // for(int i=0;i<rear;i++){
    // arr[i]=arr[i+1];
    // }

    // rear--;

    // return front;
    // }

    // public static int peek(){

    // if(Isempty()){
    // return -1;
    // }
    // return arr[0];
    // }
    // }

    // circular Queue
    // static class queue{
    // static int arr[];
    // static int size;
    // static int rear;
    // static int front;
    // queue(int n){
    // arr= new int[n];
    // size=n;
    // rear = -1;
    // front = -1;
    // }

    // public static boolean Isempty(){
    // return rear == -1 && front == -1;
    // }

    // public static boolean isfull(){
    // return (rear+1)%size ==front ;
    // }

    // //adding element
    // public static void add(int data){
    // if(isfull()){
    // System.out.println("Queue is full");

    // }
    // //adding first element
    // if(front == -1){
    // front =0;
    // }
    // rear=(rear+1)%size;
    // arr[rear]=data;
    // }

    // public static int remove(){
    // if(Isempty()){
    // return -1;
    // }

    // int result = arr[front];

    // /// laast element delete
    // if(rear==front){
    // rear=front=-1;
    // }
    // else{
    // front=(front+1)% size;
    // }

    // return result;
    // }

    // public static int peek(){

    // if(Isempty()){
    // return -1;
    // }
    // return arr[0];
    // }
    // }

    // Queue using linked llIst

    // static class Node {
    // int data;
    // Node next;

    // Node(int d){
    // this.data = d;
    // next =null;
    // }
    // }

    // public static Node HEAD=null;
    // public static Node TAIL=null;

    // static class queue{

    // public static void Add(int d){

    // Node temp = new Node(d);

    // if(TAIL==null){
    // HEAD = TAIL= temp;
    // }
    // else{
    // TAIL.next=temp;
    // TAIL= temp;
    // }

    // }

    // public static boolean Isempty(){
    // return HEAD==null;
    // }

    // public static int remove(){
    // if(Isempty()){
    // return -1;
    // }
    // else{

    // int n= HEAD.data;

    // HEAD=HEAD.next;
    // return n;
    // }
    // }

    // public static int peek(){
    // return HEAD.data;
    // }

    // }


    static class queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();



        public static boolean isempty(){
            return s1.isEmpty();
        }

        public static void add(int data){

            while (!s1.isEmpty()) {
                s2.push(s1.pop());                
            }

            s1.push(data);


            while (!s2.isEmpty()) {
                s1.push(s2.pop());                
            }
        }


        // check empty condiiton in  below both function
        public static int remove(){
            return s1.pop();
        }

        public static int peek(){
            return s1.peek();
        }
    }



   

    public static void main(String[] args) {

        // queue q = new queue(3);

        // q.add(1);
        // q.add(2);
        // q.add(3);

        // System.out.println(q.remove());
        // q.add(4);
        // System.out.println(q.remove());
        // q.add(5);
        // System.out.println(q.remove());

        // System.out.println(q.remove());
        // System.out.println(q.remove());
        // System.out.println(q.remove());

        // list
        // queue q = new queue();

        // q.Add(1);
        // q.Add(2);
        // q.Add(3);

        // System.out.println(q.peek());
        // System.out.println(q.remove());
        // System.out.println(q.peek());

        // Queue<Integer> q = new LinkedList<>();
        // q.add(1);
        // q.add(2);
        // q.add(3);

        // System.out.println(q.remove());
        // q.add(4);
        // System.out.println(q.remove());
        // q.add(5);
        // System.out.println(q.remove());

        // System.out.println(q.remove());
        // System.out.println(q.remove());
        // System.out.println(q.remove());





        //2stack problem
        queue q=new queue();

        q.add(1);
        q.add(2);
        q.add(3);



        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }

}