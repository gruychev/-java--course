package homework13;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;
import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in,"UTF-8");
		
		System.out.print("Please enter file:");
		String xx = input.nextLine();
		System.out.print("Please enter text:");
		String text = input.nextLine();
					
		readAllLines("../output/"+xx,text);
	}
		
		public static void readAllLines(String file,String text1){

		try {
						
			FileWriter fileStream = new FileWriter(file, true);
			
			BufferedWriter writer = new BufferedWriter(fileStream);
			
			writer.write(text1);
							
			System.out.print((int)'a');
			writer.close();
			
		} catch (Exception e) {
			System.out.println("Error while writing a file.");
			System.out.println(e.getMessage());
			System.exit(0);
		}
		
		System.out.println("The file is succes.");
	
	}

}