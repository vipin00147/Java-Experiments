package details;
import java.util.*;
public class Details
{
    static int id;
    static String name,branch;
    public static void Id(int id)
    {
     Details.id=id;
    }
    public static void Name(int id,String name)
    {
        Details.name=name;
        Id(id);
    }
    public static void Branch(int id,String name,String branch)
    {
        Details.branch=branch;
        Name(id,name);
    }
    public static String output()
    {
        return "Id : "+id+"\nName : "+name+"\nBranch : "+branch;
    }
}
