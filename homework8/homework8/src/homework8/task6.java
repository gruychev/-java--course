package homework8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;


public class task6 {

	public static void main(String[] args) {
		readFile("../files/java.txt");
//		readFile("..\\files\\java.txt");
	
	}
	
	public static void readFile(String path){
		try {
			
			FileReader fileReader = new FileReader(path);
			
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while (bufferedReader.ready()) {
					String line = bufferedReader.readLine();
					System.out.println(line);
			}
			
			bufferedReader.close();
			
			 //String modified = line.replace(" , ", " ");
			
		} catch (Exception e) {
			System.out.println("Error while reading a file.");
			System.out.println(e.getMessage());
			System.exit(0);
		}
		
		//String filePath = "../output/randomNumbers.txt";
		//FileWriter fileStream = new FileWriter(filePath);
         //FileWriter fileStream = new FileWriter(filePath, true);	
		  //BufferedWriter writer = new BufferedWriter(fileStream);
		//writer.close();

	
	
			
		
		
	}


}
