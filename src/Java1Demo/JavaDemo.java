package Java1Demo;

public class JavaDemo {
	
	public static void main(String[] args) {
		
		System.out.println("This is main class");
		
		one o1 = new one();
		o1.banglore();
		o1.chennai();
		
		two t1 = new two();
		t1.delhi();
		t1.agra();
	}

}


class one{
	
	public void banglore() {
		System.out.println("this is baglore");
	}
	public void chennai() {
		System.out.println("this is chennai");
		
	}
}
	
class two{
	public void delhi() {
		System.out.println("this is delhi");
	}
    public void agra() {
    	System.out.println("this is agra");
    }
}

	


