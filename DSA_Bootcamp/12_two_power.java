static int solve(int n){
    //CODE HERE 
    for(int i=0;i<=30;i++)
    {
        int ans=(int)Math.pow(2,i);
        if(ans==n)
        {
            return 1;
        }
    }
    return 0;
    }