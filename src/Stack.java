public class Stack
{
    private int[] stack;
    private int   tos;

    public Stack()
    {
        stack = new int[100];
        tos   = -1;
    }

    public void push(int x)
    {
        if (tos < 99)
        {
            tos++;
            stack[tos] = x;
        }  
    }

    public void pop()
    {
        if (!empty()) tos--;
    }

    public int top()
    {
        if (!empty())
            return stack[tos];
        else
            return -1;
    }

    public boolean empty()
    {
        return (tos == -1);
    }
}
