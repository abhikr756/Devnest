static int solve(int n, int[] arr, int key){
    //CODE HERE 
    for(int i =0;i<arr.length;i++)
    {
        if(arr[i]>=key)
        {
            return i;
        }
    }
    return arr.length;
    }