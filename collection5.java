import java.util.HashSet;
import java.util.Iterator;

public class collection5 {  
public static void main(String[] args) {  
    HashSet<String> set=new HashSet<String>();  
    //Creating Book1s  
    set.add("Let us C"+"Yashwant Kanetkar"+"BPB");  
    set.add("Data Communications & Networking"+"Forouzan"+"Mc Graw Hill");  
    set.add("Operating System"+"Galvin"+"Wiley");  
    Iterator it=set.iterator();
    //Traversing HashSet  
    while(it.hasNext()){  
    System.out.println(it.next());  
    }  
}  
}
