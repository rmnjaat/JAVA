import java.io.Console;
import java.util.*;

public class ssstckProblem {



    public static void pushAtBottom(Stack<Integer> s,int d){

        if(s.empty()){
            s.push(d);
            return;
        }

        int top = s.pop();

        pushAtBottom(s, d);

        s.push(top);


    }


    public static void reverse(String str){
        Stack<Character> s  = new Stack<>();
        int idx=0;
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder res = new StringBuilder();

        while (!s.empty()) {
            res.append(s.pop());
        }

        System.out.println(res);

    
    }


    public static void reverseStack(Stack<Integer> s){
        if(s.empty()){
            return;
        }


        int top= s.pop();

        reverseStack(s);

        pushAtBottom(s, top);

    }

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        // pushAtBottom(s,4);

        reverseStack(s);

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        // System.out.println(s.pop());


        // String s= "Raman";

        // reverse(s);
        
    }
}