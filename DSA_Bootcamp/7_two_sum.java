static int[] solve(int n, int[] nums, int target){
    //CODE HERE 
    int res[]=new int[2];
    for(int i=0;i<n-1;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(nums[i]+nums[j]==target)
            {
                res[0]=i;
                res[1]=j;
            }
        }
    }
    return res;
    }