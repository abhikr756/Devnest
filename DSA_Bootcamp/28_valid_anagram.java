static int solve(String s1, String s2){
    //CODE HERE 
    char []p=s1.toCharArray();
    char []q=s2.toCharArray();
    Arrays.sort(p);
    Arrays.sort(q);
    if(Arrays.equals(p,q))
    {
        return 1;
    }
    return 0;
    }