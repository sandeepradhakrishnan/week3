package week3.day1;

public class Desktop extends computer {
public void desktopSize(int Value) {
	System.out.println("desktopSize"  +Value);
}
	public static void main(String[] args) {
		Desktop pc=new Desktop();
		pc.computerModel("acer");
		pc.desktopSize(14);

	}

}
