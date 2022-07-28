static String solve(String s){
    //CODE HERE 
    Stack <Character> stk= new Stack<>();
    for(int i=0;i<s.length();i++)
    {
        if(stk.isEmpty())
        {
            stk.push(s.charAt(i));
        }
        else if(stk.peek()==s.charAt(i))
        {
            stk.pop();
        }
        else{
            stk.push(s.charAt(i));
        }
    }
    String res="";
    while(!stk.isEmpty())
    {
        res+=stk.pop();
    }
    StringBuilder sb =new StringBuilder(res);
    sb.reverse();
    return sb.toString();
    }