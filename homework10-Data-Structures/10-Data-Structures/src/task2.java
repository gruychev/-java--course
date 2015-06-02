
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

import java.util.Scanner;
public class task2 {
	
	public static void main(String[] args) {
		
		 ArrayList<String> people = new ArrayList<String>();
		Scanner input = new Scanner(System.in,"UTF-8");
		System.out.println("Please enter text:");
		String ss = input.nextLine();
		String[] parts = ss.split(" ");
		
		HashMap<String, Integer> wordsCount = new HashMap<String, Integer>();

		for (String word : parts) {
			Integer count = wordsCount.get(word);
			if (count == null) {
				count = 0; 
			}
			wordsCount.put(word, count + 1);
		}
		
		Set<String> wordKeys = wordsCount.keySet();
			
		for (String word : wordKeys) {
			int count = wordsCount.get(word);
			if(count < 2){
				System.out.printf("%s -> %d times\n", word, count);
			}
			
			
		}
		
		
	}
}