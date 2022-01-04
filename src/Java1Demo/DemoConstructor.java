package Java1Demo;

public class DemoConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Seven s2 = new Seven();
		s2.banglore();
	}

}

class Seven{
	 Seven(){
		System.out.println("This is Constructor");
	}
	 public void banglore(){
		 System.out.println("This is banglore");
	 }


}

//constructor name is same as class name 
//constructor will be called by default when a object is created
//constructor will not have any return type
