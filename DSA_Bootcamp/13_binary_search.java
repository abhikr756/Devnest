static int solve(int n, int[] nums, int target){
    //CODE HERE 
    int left=0;
    int right=nums.length-1;
    while(left<=right)
    {
        int mid=left+(right-left)/2;
        if(nums[mid]==target)
        {
            return mid;
        }
        else if(nums[mid]>target)
        {
            right=mid-1;
        }
        else
        {
            left=mid+1;
        }
    }
    return -1;
    }