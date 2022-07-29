static Node solve(Node head){
    //CODE HERE 
    Node fast=head,slow=head;
    while(fast!=null && fast.next!=null)
    {
        fast=fast.next.next;
        slow=slow.next;
    }
    return slow;
    }