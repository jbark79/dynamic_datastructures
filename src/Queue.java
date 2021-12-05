public class Queue
{
    private int[] queue;
    private int   end;

    public Queue()
    {
        queue = new int[100];
        end   = -1;
    }

    public void enqueue(int x)
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

    public int front()
    {
        if (!empty())
            return queue[0];
        else
            return -1;
    }

    public boolean empty()
    {
        return (end == -1);
    }
}
