static String[] solve(int n){
    //CODE HERE 
    String[] str=new String[n];
    String s="";
    String t="";
    for(int i=1;i<=n;i++){
    StringBuilder sb=new StringBuilder(t);
    s=t+i+sb.reverse();
    str[i-1]=s;
    t=t+i;
    }
    return str;
    }