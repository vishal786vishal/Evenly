package JavaPractice;

public class ReverseInteger {

	public static void main(String[] args) {
	/**	int num = 123454321;
		int rev = 0;
		 
		while(num!=0) 
		{
			rev = rev*10 + num%10;
			num = num/10;
			
		}	
System.out.println(rev);
	}
     
*/

long num1 = 123454321;
System.out.println(new StringBuffer(String.valueOf(num1)).reverse());


}
}