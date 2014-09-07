import java.util.Arrays;
import java.util.Scanner;


public class SortArrayStrings {


	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println("Enter n:");
		int n = in.nextInt();
		
		String[] words = new String[n];
		in.nextLine();
		for (int i = 0; i < n; i++) {
			words[i] = in.nextLine();
		}
		
		Arrays.sort(words);
		System.out.println("Sort:");
		for (int i = 0; i < n; i++) {
			System.out.println(words[i]);
		}
		
		

	}

}

