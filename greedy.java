import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.*;

public class greedy {

    // meeting maxa ctivity

    // public static void main(String[] arg){
    // int s[]={1,3,0,5,8,5};
    // int e[]={2,4,6,7,9,9};

    // int maxaact;
    // ArrayList<Integer> ans = new ArrayList<>();

    // maxaact=1;
    // ans.add(0);

    // int lastend=e[0];
    // for(int i=1;i<e.length;i++){
    // if(s[i] >= lastend){
    // maxaact++;
    // ans.add(i);
    // lastend=e[i];
    // }

    // }

    // System.out.println(maxaact);
    // for(int i=0;i<ans.size();i++){
    // System.out.print(ans.get(i)+ " ");
    // }
    // }

    // fraction knapsack

    // public static void main(String[] args) {
    // int val[]={60,100,120};
    // int weight[]={10,20,30};

    // int w=50;

    // double rat[][]= new double[val.length][2];
    // for(int i=0;i<val.length;i++){
    // rat[i][0]=i;
    // rat[i][1]=val[i]/(double)weight[i];
    // }

    // Arrays.sort(rat,Comparator.comparingDouble(o->(o[1])));

    // int mc=0;
    // for(int i=rat.length-1;i>=0;i--){

    // int idx = (int)rat[i][0];

    // if(w>=weight[idx]){
    // mc+=val[idx];
    // w=w-weight[idx];
    // }
    // else{
    // mc+=rat[i][1]*w;
    // w=0;
    // break;
    // }

    // }

    // System.out.println(mc);

    // }

    // //currency notes
    // public static void main(String[] args) {
    // Integer n[]={1,2,5,10,20,50,100,500,2000};

    // Arrays.sort(n,Comparator.reverseOrder());

    // int count =0;

    // int am=590;

    // ArrayList<Integer> ans = new ArrayList<>();

    // for(int i=0;i<n.length;i++){
    // if(n[i]<=am){
    // while (n[i]<=am) {
    // count++;
    // ans.add(n[i]);
    // am-=n[i];
    // }

    // }
    // }

    // System.out.println(count+" "+ans);
    // }

    // Job sequence

    // static class Job{
    // int deadline;
    // int profit;
    // int id;

    // public Job(int d,int p, int i){
    // deadline=d;
    // profit=p;
    // id=i;
    // }
    // }

    // public static void main(String[] args) {
    // int jobarr[][]={{4,20},{1,10},{1,40},{1,10}};

    // ArrayList<Job> jobs = new ArrayList<>();

    // for(int i=0;i<jobarr.length;i++){
    // jobs.add( new Job(jobarr[i][0],jobarr[i][1],i));
    // }

    // //soting objects

    // // Collections.sort(jobs,(a,b)-> a.profit-b.profit); // ascending order
    // Collections.sort(jobs,(a,b)-> b.profit-a.profit); // desc order

    // ArrayList<Integer> seq = new ArrayList<>();

    // int time =0;

    // for(int i=0;i<jobs.size();i++){
    // Job curr = jobs.get(i);

    // if(curr.deadline > time){
    // seq.add(curr.id);
    // time++;
    // }
    // }

    // // System.out.println(seq);

    // for(int i=0;i<seq.size();i++){
    // System.out.print(seq.get(i) +" ");
    // }
    // }




    // chocolate Problem cutting min cost

    // public static void main(String[] args) {

    //     int n = 4, m = 6;

    //     Integer costVer[] = { 2, 1, 3, 1, 4 };
    //     Integer costHor[] = { 4, 1, 2 };

    //     // Collection.sort(costVer,(a,b)->a-b);
    //     Arrays.sort(costVer, Comparator.reverseOrder());
    //     Arrays.sort(costHor, Comparator.reverseOrder());

    //     int h = 0, v = 0; // pointers

    //     int hp = 1, vp = 1; // peices

    //     int cost = 0;
    //     while (h < costHor.length && v < costVer.length) {
    //         if (costVer[v] <= costHor[h]) {
    //             cost += (costHor[h] * vp);
    //             hp++;
    //             h++;
    //         } else {
    //             cost += (costVer[v] * hp);
    //             vp++;
    //             v++;
    //         }
    //     }

    //     while (h < costHor.length) {

    //         cost += (costHor[h] * vp);
    //         hp++;
    //         h++;
    //     }

    //     while (v < costVer.length) {

    //         cost += (costVer[v] * hp);
    //         vp++;
    //         v++;
    //     }


    //     System.out.println(cost);

    // }



    public static void main(String[] args) {
        int price[]={7,1,5,3,6,4};

        int buy = price[0];

        int profit =0;

        for(int i=1;i<price.length;i++){

            if(buy > price[i]){
                buy=price[i];
            }

            else if(price[i] - buy > profit){
                profit =  price[i] - buy;
            }
        }

        System.out.println(profit);

    }

}