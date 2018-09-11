package problems;
import java.util.Scanner;
public class problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner in = new Scanner(System.in);
		
		
		String word = in.nextLine();
		
		int k = word.length();
		
		char w =word.charAt(0);
		
		if( Character.isUpperCase(w) )
		{
			System.out.println(word );
			
		}
		else
		{
			char m =Character.toUpperCase(w);
			String modified = m+ word.substring(1,k);
			System.out.println(modified);

			
		}
	
		
	}

}
