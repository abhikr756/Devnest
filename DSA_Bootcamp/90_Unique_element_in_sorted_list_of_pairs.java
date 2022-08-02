static int solve(int n, int[] nums){
    //CODE HERE
    int c=0;
    for(int a : nums)
    {
        c=c^a;
    }
    return c;
    }