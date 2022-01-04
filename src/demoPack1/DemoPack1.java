package demoPack1;

import demoPack3.*;

public class DemoPack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is main Method");
		one o1 = new one();
		o1.bangalore();
		o1.chennai();
		
		DemoPack2 t1 = new DemoPack2();
		t1.delhi();
		t1.mumbai();
		
		DemoPack3 t2 = new DemoPack3();
		t2.agra();
		t2.Nodia();
		
		
	}

}


class one{
	public void bangalore() {
		System.out.println("this is banglore");
	}
	
	public void chennai() {
		System.out.println("this is chennai");
	}
}