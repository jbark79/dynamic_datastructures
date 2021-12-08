

public class Main
{
    static void test_list()
    {
        Liste l1 = new Liste();
        Liste l2 = new Liste();

        for (int i=1; i<=50; ++i)
        {
            l1.append(i);
            l2.append(50+i);
        }

        l1.concat(l2);
        l1.toFirst();
        while (l1.hasAccess())
        {
            System.out.println(l1.getContent());
            l1.next();
        }
        l2.append(5);
        l1.concat(l2);
    }

    static void test_queue2()
    {
        Queue2 q = new Queue2();
        q.enqueue(5);
        q.enqueue("test");

        int elem = (int)q.front();
        q.dequeue();

        String elem2 = (String)q.front();
        q.dequeue();

        System.out.println(elem);
        System.out.println(elem2);
    }

    static void test_stack2()
    {
        Stack2 s = new Stack2();
        s.push(5);
        s.push("test");

        String elem = (String)s.top();
        s.pop();

        int elem2 = (int)s.top();
        s.pop();

        System.out.println(elem);
        System.out.println(elem2);
    }

    public static void main(String[] args)
    {
        test_queue2();
        test_stack2();
    }
}
