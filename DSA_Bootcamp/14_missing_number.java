static int solve(int n, int[] arr){
    //CODE HERE 
    int sum=0,total=0;
    for(int i=0;i<arr.length;i++)
    {
        sum+=arr[i];
    }
    total=(n*(n+1))/2;
    return total-sum;
    }