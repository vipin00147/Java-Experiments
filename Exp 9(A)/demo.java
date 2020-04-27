abstract class one{
    one(){
        System.out.println("One Constructor");
    }
    abstract void get();
 }
class two extends one {//abstract class doesn't support multiple inheritance.
   
    void get(){
        System.out.println("Get is Called");
    }
}
class demo{
    public static void main(String arg[])
    {
        one a=new two();
        two b=new two();
        a.get();
        b.get();
    }
}
