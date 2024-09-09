public class arrayPair {
    public static void subarray(int arr[]) {
        int n = arr.length;
        int currsum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int start = i;
            for (int j = i; j < n; j++) {
                int end = j;
                currsum = 0;
                for (int k = start; k <= end; k++) {
                    currsum += arr[k]; // sub array sum
                }
                System.out.println("Current sum " + currsum);
                if (currsum > maxSum) {
                    maxSum = currsum;
                }

            }
        }
        System.out.println("Total sub array " + maxSum);
    }

    public static int maxSumPrefix(int arr[]) { // prefix array method
        int n = arr.length;
        int sum = 0;
        int prefixarr[] = new int[n];
        int currsum;
        int maxSum = Integer.MIN_VALUE;
        prefixarr[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixarr[i] = prefixarr[i - 1] + arr[i];
        }

        for (int i = 0; i < n; i++) {
            int start = i;
            for (int j = i; j < n; j++) {
                int end = j;
                currsum = start == 0 ? prefixarr[end] : prefixarr[end] - prefixarr[start - 1];

                if (currsum > maxSum) {
                    maxSum = currsum;
                }

            }
        }
        return maxSum;
    }

    public static int maxSumKadanes(int arr[]) {
        if (arr.length == 1) {
            return arr[0];
        }
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            maxSum = Math.max(currSum, maxSum);
            if (currSum < 0) {
                currSum = 0;
            }

        }
        return maxSum;
    }

    public static boolean twise(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static int maxProfit(int prices[]){
        int minBuy=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
           minBuy=Math.min(minBuy,prices[i]);
            maxProfit=Math.max(prices[i]-minBuy,maxProfit);
        }
       return maxProfit;
    }

    public static int rainwater(int arr[]) {
        int maxleft[]=new int[arr.length];
        int maxright[]=new int [arr.length];
         maxleft[0]=arr[0];
         
        for(int i=1;i<arr.length;i++){ // putting value in max left aux array
           
            maxleft[i]=Math.max(maxleft[i-1],arr[i]);
        }

        maxright[maxright.length-1]=arr[arr.length-1]; // putting elemet in right max aux array
    
        for(int j=arr.length-2;j>=0;j--){
            
            maxright[j]=Math.max(maxright[j+1],arr[j]);
        }

       int trapwater=0;
       for(int i=0;i<arr.length;i++){
            int waterlevel=Math.min(maxleft[i],maxright[i]);
            trapwater+=waterlevel-arr[i];
       }
       return trapwater;
    }
    public static int search_help(int arr[],int start,int end,int target){
       if(start>end)return -1;
       int mid=start+(end-start)/2;
       if(arr[mid]==target){
        return mid;
       }

       if(arr[start]<=arr[mid]){ // in this condition we are hopping that our target lies in left part of the array

            if(arr[start]<=target&&target<=arr[mid]){ // that why we first searching for left part then right
                return search_help(arr, start, mid-1, target); // left part search
            }
            else{
                return search_help(arr, mid+1, end, target); // search right part
            }
       }
       else{ // if the "if" condition false then we are searching the left part first
            if(target>=arr[mid]&&target<=arr[end]){
                return search_help(arr, mid+1, end, target);// right part search
            }
            else{
                return search_help(arr, start, mid-1, target);// right part search
            }
       }
    }
    public static int search_in_roated_sorted_array(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        return search_help(arr, start, end, target);
    
    }

    public static void main(String args[]) {

        int arr[] = {4,5,6,7,0,1,2};
        int n=search_in_roated_sorted_array(arr, 0);
        System.out.println(n);

    }
}
