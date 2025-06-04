package JavaPractice;

public class RevString {

	public static void main(String[] args) {
	String s = "selenium";
//	int len = s.length();
String rev = "s";
	//for(int i=len-1;i>=0;i--)
//	{
	//	rev = rev + s.charAt(i);
	//}
//System.out.println(rev);
	//}

//}

//Using String BufferClass

//StringBuffer sb = new StringBuffer(s);
	

//System.out.println(sb.reverse());
	
	char a[] = s.toCharArray();
	int len = a.length;
	for (int i=len-1;i>=1;i--)
	{
		rev = rev+a[i];
	}
	System.err.println(rev);
}	
}

