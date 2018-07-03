package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		Email em1=new Email("John","Smith");
		em1.setalternateEmail("nk2242696@gmail.com");
		System.out.println(em1.getalternateEmail());
		System.out.println(em1.showInfo());
	}

}
