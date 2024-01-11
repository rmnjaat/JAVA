
import java.util.LinkedList;
import java.util.Queue;

public  class quuueueQuestionss {

    public static void printNonRepeating(String str){
        int freq[] = new int[26];

        Queue<Character> q = new LinkedList<>();

        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);

            q.add(ch);
            freq[ch-'a']++;

            
            
            while ( !q.isEmpty() && freq[ q.peek() - 'a'] > 1) {
                q.remove();
            }

            if(q.isEmpty()){
                System.out.print(" -1 ");
            }else{
                System.out.print(" "+q.peek()+" " );
            }
        }
    }



    public static void interleaved(Queue<Integer> q){

        Queue<Integer> q2 = new LinkedList<>();
        for(int i=0;i<q.size();i++){
            q2.add(q.remove());
        }

        while (!q2.isEmpty()) {
            q.add(q2.remove());
            q.add(q.remove());
            
        }

        for(int i =0;i<10;i++){
            System.out.print(q.remove() + " ");
        }

    }



    public static void queuereversal(Queue<Integer> q){
        
    }

    public static void main(String[] args){



        // String s="aabccxb";

        // printNonRepeating(s);


        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        interleaved(q);

    }
}