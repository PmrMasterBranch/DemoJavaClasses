package Java1Demo;

public class JavaDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("This is the main method");
		
		three t2 = new three();
		t2.add(10, 20);
		t2.add(300, 200);
		
		
		four f1 = new four();
		f1.city("hyderbad");
	}

}


class three{
	public void add(int a , int b) {
		int c = a+b;
		System.out.println(c);
	}
}

class four{
	public void city(String CityName) {
		System.out.println("this is " + CityName);
	}
}