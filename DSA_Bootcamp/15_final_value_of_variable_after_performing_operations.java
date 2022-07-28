static int solve(int n, String[] arr){
    //CODE HERE
    int res=0;
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i].equals("++X") || arr[i].equals("X++"))
        {
            res++;
        }
        else res--;
    } 
    return res;
    }