import java.util.*;
import java.util.Set;
import java.util.TreeSet;

public class treeSetpg
{
    public static void main(String args[])
    {
        Set<String>t=new TreeSet<String>();
        t.add("Red");
        t.add("Blue");
        t.add("Purple");
        t.add("Yellow");
        t.add("cyan");
        
        System.out.println("-----Colors You Added-----");
        Iterator<String>itr=t.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}