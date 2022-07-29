static int solve(int n, int[] arr){
    //CODE HERE 
    int maxSum=Integer.MIN_VALUE,currSum=0;
    for(int i=0;i<arr.length;i++)
    {
        currSum+=arr[i];
        if(currSum>maxSum)
        {
            maxSum=Math.max(maxSum,currSum);
        }
        if(currSum<0)
        {
            currSum=0;
        }
    }
    return maxSum;
    }