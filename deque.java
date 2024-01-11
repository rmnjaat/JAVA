import java.util.Deque;
import java.util.LinkedList;

public  class deque {




    public static void main(String[] args) {
            Deque<Integer> dq= new LinkedList<>();
            dq.addFirst(1);
            dq.addLast(2);
            dq.getFirst();
            dq.getLast();
            dq.removeFirst();
            dq.removeLast(); 

            

    }
}