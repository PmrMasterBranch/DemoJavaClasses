package demoPack3;

import java.util.ArrayList;

public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a = new ArrayList<String>();
		a.add("madhu");
		a.add("sudhan");
		a.add("Reddy");
		a.add("java");
		
		
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		
	}

}
