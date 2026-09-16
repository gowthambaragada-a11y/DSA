class MinStack {
    int arr[]=new int[500000];
    int top=-1;
    public MinStack() {
        
    }
    
    public void push(int val) {
        arr[++top]=val;
    }
    
    public void pop() {
        if(top==-1);
        else top--;
    }
    
    public int top() {
        return arr[top];
    }
    
    public int getMin() {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<=top;i++)min=Math.min(arr[i],min);
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */