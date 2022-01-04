package Java1Demo;

public class DemoConstructorOL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is main Method");
		ten t1 = new ten(10,20);
		ten t2 = new ten(10,20,30);
		ten t3 = new ten(10,20," Messageisnothing ");
		t1.banglore();
		
	}

}

class ten{
	ten(int a , int b){
		int c = a+b;
		System.out.println(c);
	}
	ten(int a , int b,int c){
		int d = a+b+c;
		System.out.println(d);
	}
	ten(int a , int b,String message){
		int d = a+b;
		System.out.println(d + message);
}
	public void banglore() {
		System.out.println("This is banglore");
	}
}
