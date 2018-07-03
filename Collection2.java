import java.util.*;

class Book{
	String name;
	int price;
	String author;
	Book(String name,int price,String author)
	{
		this.name=name;
		this.price=price;
		this.author=author;
	}
}
public class Collection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1=new Book("Let Us C",899,"Yashwant C. Kanetkar");
		Book b2=new Book("Let Us Java",809,"Balaguruswamy");
		Book b3=new Book("Monk Who sold Ferrari",89,"Robin Sharma");
		ArrayList<Book> b =new ArrayList<Book>();
		b.add(b1);
		b.add(b2);
		b.add(b3);
		
		for(Book l:b)
		{
			System.out.println("Book Name: \t"+l.name+"Price: \t"+l.price+"Author: \t"+l.author);
		}
	}
}
