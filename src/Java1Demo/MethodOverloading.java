package Java1Demo;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("this is main method");
		eight e1 = new eight();
		e1.add(10, 20);
		e1.add(10, 20, 30);
		e1.add(100, 200, "howzzat ");
		e1.bangalore();
	}

}


class eight{
	
	public void add(int a , int b) {
		int c =a+b;
		System.out.println(c);
	}
	public void add(int a, int b, int c) {
		int d =a+b+c;
		System.out.println(d);
	}
	public void add(int a, int b, String message) {
		int c= a+b;
		System.out.println(message +c);
	}
	public void bangalore() {
		System.out.println("This is banglore");
	}

}