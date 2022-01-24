package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		List<String>input=new ArrayList<String>();
		input.add("TCS");
		input.add("Wipro");
		input.add("Aspire system");
		input.add("cts");
		Collections.sort(input);
		System.out.println(input);
		Collections.reverse(input);
		System.out.println(input);
	}

}
