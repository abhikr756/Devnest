static int[] solve(int m, int n, int[] arr1, int[] arr2){
    //CODE HERE
    for(int i=0;i<n;i++)
    {
        arr1[i+m]=arr2[i];
    }
    Arrays.sort(arr1);
    return arr1;
    }