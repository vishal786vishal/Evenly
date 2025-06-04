package JavaPractice;

import java.util.HashSet;
import java.util.Set;

public class MissingNumber {

	public static void main(String[] args) {

	/**	int sum = 0;
		int a[] = {1,2,4,5};
		for(int i=0;i<a.length;i++)
		{
			sum = sum+a[i];
	}
			System.out.println(sum);
		
		
		int sum1 = 0;
		for(int j=1;j<=5;j++)
		{
			sum1= sum1+j;
		
		}
			System.out.println(sum1);
		
		System.out.println((sum1-sum));*/
		String names[] = {"java","Python","C","Javascript","java"};
		 Set<String> store = new HashSet<String>();
		 for (String name : names)
		 {
			 if(store.add(name) == false)
			 {
				 System.out.println(name);
			 }
		 }
		
		
	}

}
