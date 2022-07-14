static int solve(int n, int[] arr){
    //CODE HERE 
    Arrays.sort(arr);
    HashSet <Integer> hset=new HashSet<>();
    for(int i=0;i<arr.length;i++)
    {
        if(!hset.add(arr[i]))
        {
            return 1;
        }
    }
    return 0;
    }