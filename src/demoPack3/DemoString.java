package demoPack3;

public class DemoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = new String("madhu Sudhan reddy");
		System.out.println(s);
		 String SplitedSting[] = s.split("Sudhan");
		 System.out.println(SplitedSting[0]);
		 System.out.println(SplitedSting[1]);
		String SplitedtrimeString = SplitedSting[0].trim();
		 System.out.println(SplitedtrimeString);
		 
		 
		 String s3 =  "Madhu";
		 System.out.println(s3.length());
		 
		 for(int i=s3.length()-1;i>=0;i--) {
			 System.out.println(s3.charAt(i));
		 }
	}

}
