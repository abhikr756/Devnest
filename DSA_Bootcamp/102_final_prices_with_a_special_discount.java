static int[] solve(int n, int[] prices){
    //CODE HERE 
    for(int i=0;i<prices.length-1;i++)
    {
        for(int j=i+1;j<prices.length;j++)
        {
            if(prices[j]<=prices[i] && j>i)
            {
                prices[i]=prices[i]-prices[j];
                break;
            }
        }
    }
    return prices;
    }