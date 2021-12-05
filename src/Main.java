class Main
{
    public static void main(String[] args)
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
}
