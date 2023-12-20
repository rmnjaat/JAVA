public class rough {


    public static int[] productExceptSelf(int[] nums) {

        int mul=1;

        int n=nums.length;

        int ans[]=new int[n];

        for(int i=0;i<n;i++){

            for(int j=0;j<n;j++){
                if(j==i){
                    continue;
                }
                else{
                    mul*=nums[i];
                }
            }
            ans[i]=mul;    
        }
        return ans;
        
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4};

        int ans[]=productExceptSelf(nums);

        for(int i: ans){
            System.out.print(i+" ");
        }

    }
}