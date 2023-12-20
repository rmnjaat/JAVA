public class best_t_sell_stock{

    public static int bys(int pr[]){
        int buy_pr=Integer.MAX_VALUE;
        int maxprofit=0;

        for(int i=0;i<pr.length;i++){
            if(buy_pr<pr[i]){
               int profit=pr[i]-buy_pr;

               maxprofit=Math.max(maxprofit,profit);
            }

            else{
                buy_pr=pr[i]; 
            }
        }
        return maxprofit;
    }

    public static void main(String[] args){
        int pr[]={7,1,5,3,6,4};
        System.out.println(bys(pr));
    }
}