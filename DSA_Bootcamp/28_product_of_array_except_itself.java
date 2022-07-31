static int[] solve(int n, int[] arr){
    //CODE HERE 
    int res[]=new int[arr.length];
    int prod1=1,prod2=1;
    for(int i=0;i<arr.length;i++)
    {
        res[i]=prod1;
        prod1*=arr[i];
    }
    for(int i=n-1;i>=0;i--)
    {
        res[i]*=prod2;
        prod2*=arr[i];
    }
    return res;
    }