import java.io.Console;
import java.lang.reflect.Array;
import java.util.*;

import javax.xml.stream.events.StartDocument;

public class ssstckProblem {

    public static void pushAtBottom(Stack<Integer> s, int d) {

        if (s.empty()) {
            s.push(d);
            return;
        }

        int top = s.pop();

        pushAtBottom(s, d);

        s.push(top);

    }

    public static void reverse(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;
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

    public static void reverseStack(Stack<Integer> s) {
        if (s.empty()) {
            return;
        }

        int top = s.pop();

        reverseStack(s);

        pushAtBottom(s, top);

    }

    public static void StockSpan(int s[]) {

        Stack<Integer> lh = new Stack<>();

        int arr[] = new int[s.length];
        arr[0] = 1;
        lh.push(0);

        for (int i = 1; i < s.length; i++) {
            int curr = s[i];

            while (!lh.isEmpty() && curr >= s[lh.peek()]) {
                lh.pop();
            }

            if (lh.isEmpty()) {
                arr[i] = i + 1;
            } else {
                int ph = lh.peek();

                arr[i] = i - ph;

            }
            lh.push(i);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }

    }

    public static void NextGreater(int arr[]) {
        int ans[] = new int[arr.length];

        Stack<Integer> s = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {

            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = arr[s.peek()];
            }
            s.push(i);
        }

        for (int i = 0; i < ans.length; i++) {

            System.out.print(ans[i] + "  ");
        }

        System.out.println();
    }

    public static void ValdPanran(String str) {

        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.println(c);

            if (c == '[' || c == '{' || c == '(') {
                s.push(c);
            }

            else {

                if (!s.isEmpty() && s.peek() == '[' && c == ']') {
                    s.pop();
                } else if ((!s.isEmpty() && s.peek() == '{' && c == '}')) {
                    s.pop();

                } else if (!s.isEmpty() && (s.peek() == '(' && c == ')')) {
                    s.pop();
                } else {
                    System.out.println("false");
                    return;
                }

            }

        }

        if (s.isEmpty()) {
            System.out.println("true");
        } else {
            System.out.println("False");
        }

    }

    public static void Dupli(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ')') {
                int count = 0;

                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }

                if (count < 1) {
                    System.out.println("True");
                    return;
                } else {

                    s.pop();
                }
            } else {
                s.push(c);

            }
        }

        System.out.println("False");
        return;
    }

    public static void maxAreaHistogram(int arr[]) {

        int nsl[] = new int[arr.length];
        int nsr[] = new int[arr.length];

        Stack<Integer> s = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        s = new Stack<>();

        for (int i = 0; i < arr.length; i++) {

            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        // current area = j-i-1
        // nsr-nsl-1
        int maxArea = 0;

        for (int i = 0; i < arr.length; i++) {
            int h = arr[i];
            int wid = nsr[i] - nsl[i] - 1;
            int curr = h * wid;

            maxArea = Math.max(curr, maxArea);
        }

        System.out.println(maxArea);

    }

    public static void main(String[] args) {

        // Stack<Integer> s = new Stack<>();

        // s.push(1);
        // s.push(2);
        // s.push(3);

        // // pushAtBottom(s,4);

        // reverseStack(s);

        // System.out.println(s.pop());
        // System.out.println(s.pop());
        // System.out.println(s.pop());
        // System.out.println(s.pop());

        // String s= "Raman";

        // reverse(s);

        // int arr[]={100,80,60,70,60,85,100};

        // StockSpan(arr);

        // int arr[]={6,8,0,1,3};
        // NextGreater(arr);

        // String s="}";

        // ValdPanran(s);

        // String s ="((a+b))";

        // Dupli(s);

        int arr[] = { 2, 1, 5, 6, 2, 3 };

        maxAreaHistogram(arr);
    }
}