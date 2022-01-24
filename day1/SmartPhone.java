package week3.day1;

public class SmartPhone extends AndroidPhone {
public void connectWhatsApp() {
	System.out.println("WhatsApp connect");
}
public void takevideo() {
	System.out.println("video taken");
}
	public static void main(String[] args) {
		SmartPhone ved=new SmartPhone();
		ved.takevideo();
	}
}

