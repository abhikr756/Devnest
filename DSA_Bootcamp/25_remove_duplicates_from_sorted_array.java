static int[] solve(int n, int[] arr){
    //CODE HERE 
    HashSet<Integer>hset=new HashSet<>();
    for(int i=0;i<arr.length;i++)
    {
        if(!hset.contains(arr[i]))
        {
            hset.add(arr[i]);
        }
    }
    int i=0;
    int res[]=new int[hset.size()];
    for(int a: hset)
    {
        res[i++]=a;
    }
    Arrays.sort(res);
    return res;
    }