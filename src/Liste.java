public class Liste
{
    private int[] data;
    private int cur;
    private int end;

    public Liste()
    {
        data = new int[100];
        cur = -1;
        end = -1;
    }

    boolean isEmpty()
    {
        return end == -1;
    }

    boolean hasAccess()
    {
        return cur != -1;
    }

    void next()
    {
        if (!isEmpty() && hasAccess() && cur < end)
            ++cur;
        else
            cur = -1;
    }

    void toFirst()
    {
        if (!isEmpty())
            cur = 0;
    }

    void toLast()
    {
        if (!isEmpty())
            cur = end;
    }

    int getContent()
    {
        if (hasAccess())
            return data[cur];
        else
            return -1;
    }

    void setContent(int pContent)
    {
        if (hasAccess() && pContent != -1)
            data[cur] = pContent;
    }

    void append(int pContent)
    {
        if (end != 99 && pContent != -1)
            data[++end] = pContent;
        else
        {
            if (end == 99)
                System.out.println("list is full!");
            else
                System.out.println("not appending -1");
        }
    }

    void insert(int pContent)
    {
        if (pContent == -1)
            return;
        if (hasAccess())
        {
            if (end == 99)
                System.out.println("list is fulL!");
            else
            {
                for (int i=end; i>cur; --i)
                    data[i] = data[i-1];
                data[cur++] = pContent;
            }
        }
        else
        {
            if (isEmpty())
                append(pContent);
        }
    }

    void remove()
    {
        if (hasAccess())
        {
            if (cur == end)
            {
                --end;
                cur = -1;
            }
            else
            {
                for (int i=cur; i<end; ++i)
                    data[i] = data[i+1];
                --end;
            }
        }
    }

    void concat(Liste pList)
    {
        if (this != pList && !pList.isEmpty())
        {
            pList.toFirst();
            while (pList.hasAccess())
            {
                append(pList.getContent());
                pList.remove();
            }
        }
    }
}
