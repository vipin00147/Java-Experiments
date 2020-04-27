import java.util.*;
public class OwnException
{
    public static void main(String arg[])
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Two numbers : ");
        int n1 = obj.nextInt();
        int n2 = obj.nextInt();
        if(n1 > 0 && n2>0 ){
            System.out.println("Result is : "+n1/n2);
        }
        else{
         try{
           int num=n1/n2;
        }
        catch(Exception e)
        {
            System.out.println("Exception is : "+e);
        }   
        }
    }
}
