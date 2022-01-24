package week3.day1;

public class Calculatorpoly {
public void multiply(int num1,int num2) {
	System.out.println(num1*num2);
}
public void multiply(int num1,double num2) {
	System.out.println(num1*num2);
}
public void sub(int num1,int num2) {
	System.out.println(num1-num2);
	
}
public void sub(double num1,double num2) {
	System.out.println(num1-num2);
}
public void div(int num1,int num2) {
	System.out.println(num1/num2);
}
public void div(int num1,double num2) {
	System.out.println(num1/num2);
}
	public static void main(String[] args) {
	Calculatorpoly calc=new Calculatorpoly();
	calc.div(0, 0);
	

	}
	Calculatorpoly cal=new Calculatorpoly();
	
}
