static int[] solve(int n, int[] arr){
    //CODE HERE 
    int res[]=new int[arr.length];
    for(int i=0;i<arr.length;i++)
    {
        res[i]=arr[arr[i]];
    }
    return res;
    }