import java.util.*;
import java.lang.*;
import java.io.*;
 
class ball
{
    int rollno;
    String name, address;

    public ball(int rollno, String name,
                               String address)
    {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }
    public String toString()
    {
        return this.rollno + " " + this.name +
                           " " + this.address;
    }
}
 
class Sortbyroll implements Comparator<ball>
{
    public int compare(ball a, ball b)
    {
        return a.rollno - b.rollno;
    }
}
 
class Sortbyname implements Comparator<ball>
{
    public int compare(ball a, ball b)
    {
        return a.name.compareTo(b.name);
    }
}
 
class comparator
{
    public static void main (String[] args)
    {
        ArrayList<ball> ar = new ArrayList<ball>();
        ar.add(new ball(111, "bbbb", "london"));
        ar.add(new ball(131, "aaaa", "nyc"));
        ar.add(new ball(121, "cccc", "jaipur"));
 
        System.out.println("Unsorted");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));
 
        Collections.sort(ar, new Sortbyroll());
 
        System.out.println("\nSorted by rollno");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));
 
        Collections.sort(ar, new Sortbyname());
 
        System.out.println("\nSorted by name");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));
    }
}