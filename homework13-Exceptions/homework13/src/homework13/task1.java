package homework13;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;


public class task1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in,"UTF-8");
	    System.out.print("Please enter file:");
		String xx = input.nextLine();
		

		
		readAllLines("..\\files\\"+xx);

	}
	
	public static void readAllLines(String file){
		
		try {
			
			Path path = Paths.get(file);
			
			List<String> lines = Files.readAllLines(path);
			
			for (String line : lines) {
				 System.out.println(line);
			}
			
			
		} catch (IOException e) {
			System.out.println("Error while reading a file.");
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}

}




