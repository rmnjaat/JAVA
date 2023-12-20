public class trap_rain_water{


    public static int trw(int height[]){

         //calc leftmax

         int leftmax[]=new int[height.length];
            leftmax[0]=height[0];
            for(int i=1;i<height.length;i++){
                leftmax[i]=Math.max(leftmax[i-1], height[i]);
            }
         //calc right max
         int rightmax[]=new int[7];

         rightmax[height.length-1]=height[height.length-1];

         for(int i= height.length-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],height[i]);
         }

         //loop
         //water level(min(leftmax,rghtmax));
         //treaped water =(water level- height

         int tw=0;
         for(int i=0;i<height.length;i++){
            int wl=Math.min(leftmax[i], rightmax[i]);

            tw+=wl-height[i];
         }
         return tw;

    }
    public static void main(String[] args){
        int arr[]={4,2,0,6,3,2,5};

        System.out.println(trw(arr));


    }

}