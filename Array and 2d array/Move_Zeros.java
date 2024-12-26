public class Move_Zeros {
    public static void move(int nums[],int n){
        int j=-1;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                j=i;// j is now on first zero
                break;
            }
        }
        if(j==-1)return ;
        System.out.println(j);
        for(int i=j+1;i<n;i++){
            
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }

        }
    }
    public static void main(String args[]){
        int arr[]={1,0,2,3,2,0,0,4,5,1};
            move(arr,10);
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
    }
}
