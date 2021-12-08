public class Queue2
{
    private Object[] queue;
    private int end;

    public Queue2()
    {
        queue = new Object[100];
        end   = -1;
    }

    public void enqueue(Object x)
    {
        if (end < 99)
        {
            end++;
            queue[end] = x;
        }  
    }

    public void dequeue()
    {
        if (!empty())
        {
            for (int i=0; i<end; ++i)
            {
                queue[i]=queue[i+1];

            }
            --end;
        }
    }

    public Object front()
    {
        if (!empty())
            return queue[0];
        else
            return null;
    }

    public boolean empty()
    {
        return (end == -1);
    }
}

