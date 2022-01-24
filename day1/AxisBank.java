package week3.day1;

public class AxisBank extends Bankinfo {
public void deposit(int value) {
	System.out.println("deposit amount"  +value);
}
	public static void main(String[] args) {
		AxisBank bank=new AxisBank();
		bank.saving();
		bank.fixed();
		bank.deposit(50000);
	}

}