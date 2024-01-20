import java.util.*;

public class PriiorityQuueue {



    static  class Student  implements Comparable<Student> {
        String Name;
        int rank;


        public Student(String na, int r){
            Name= na;
            rank=r;
        }


        @Override
        public int compareTo(Student s2){
            return this.rank-s2.rank;
        }


    }

    public static void main(String[] args) {


        PriorityQueue<Student> pq = new PriorityQueue<>();
        
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(new Student("A", 5));
        pq.add(new Student("B", 2));
        pq.add(new Student("C", 1));
        

        System.out.println(pq.peek().Name);
        pq.remove();
        System.out.println(pq.peek().Name);
        
        


    }
}


