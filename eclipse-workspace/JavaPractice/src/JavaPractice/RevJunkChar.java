package JavaPractice;

public class RevJunkChar {

	public static void main(String[] args) {
		String s = "%$%& 12 njdn";
		 
	s = s.replaceAll("[^a-zA-Z0-9]", "");
	System.out.println(s);
				

	}

}
