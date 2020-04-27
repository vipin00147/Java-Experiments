interface two
{
   int a=10;
   int b=10;
   void  get();
   void display();
}
interface three{
    int x=1;
}

class one implements two,three //support multiple inheritance
{
    int a=5,b=5;
    public void get()
    {
        a=two.a+a;
        b=two.b+b;
    }
    public void display()
    {
        System.out.println("A : "+a+" B : "+b);
        System.out.println("Value of X of interface Three : "+three.x);
    }
    public static void main(String arg[])
    {
        one obj=new one();
        obj.get();
        obj.display();
    }
}
