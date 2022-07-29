static int solve(String str){
    //CODE HERE
    Stack <Character> stk=new Stack<Character>();
        for(char c : str.toCharArray())
        {
            if(c=='(' || c=='[' || c=='{')
            {
                stk.push(c);
            }
            else if(c==')'&& !stk.isEmpty() && stk.peek()=='(')
            {
                stk.pop();
            }
            else if(c=='}'&& !stk.isEmpty() && stk.peek()=='{')
            {
                stk.pop();
            }
            else if(c==']'&& !stk.isEmpty() && stk.peek()=='[')
            {
                stk.pop();
            }
            else return 0;
        }
        if(stk.isEmpty())
        {
            return 1;
        }
        return 0;
    }