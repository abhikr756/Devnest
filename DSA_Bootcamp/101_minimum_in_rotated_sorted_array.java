static int solve(int n, int[] nums){
    //CODE HERE 
    int l=0,h=n-1;
        while(l<=h){
            int mid = (l+h)/2;
            if(nums[mid]<nums[h]){
                h=mid;
            }else l=mid+1;
        }
        return nums[h]; 
    }