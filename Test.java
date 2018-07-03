
public class Test { 
	    int id;  
	    String name;  
	    Test(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	      
	    Test(Test s){  
	    id = s.id;  
	    name =s.name;  
	    }  
	    
	    Test(){    
	    }  
	    void display(){System.out.println(id+" "+name);}  
	   
	    public static void main(String args[]){  
	    Test s1 = new Test(111,"Karan");  
	    Test s2 = new Test();  
	    s2.id=s1.id; 
	    s2.name=s1.name; 
	    s2.display();
	   }  
	}  


