public class Stack2
{
    private Object[] stack;
    private int   tos;

    public Stack2()
    {
        stack = new Object[100];
        tos   = -1;
    }

    public void push(Object x)
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

    public Object top()
    {
        if (!empty())
            return stack[tos];
        else
            return null;
    }

    public boolean empty()
    {
        return (tos == -1);
    }
}
