package Java1Demo;

public class DemoStaticOL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is main Method");
		
		nine.add(10, 20);
		nine.add(10, 20, 30);
		nine.add(10, 30, "Whatisthemeaasage ");
		nine.bangalore();
	}

}

class nine{
	
		public static void add(int a , int b) {
			int c =a+b;
			System.out.println(c);
		}
		public static  void add(int a, int b, int c) {
			int d =a+b+c;
			System.out.println(d);
		}
		public static void add(int a, int b, String message) {
			int c= a+b;
			System.out.println(message +c);
		}
		public static void bangalore() {
			System.out.println("This is banglore");
		}

	}
