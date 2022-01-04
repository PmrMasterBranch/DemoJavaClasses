package demoPack3;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] NyNum = {1,2,3,4,5,6,7,9,10,100,111};
				
		for(int i=0;i<NyNum.length;i++)
		{
			if(NyNum[i] % 2 == 0)
				
			{
				System.out.println(NyNum[i]);
			
			}
			else {
				System.out.println(NyNum[i]+ " is even Number");
			}
		
		
		}
		
	}

}
