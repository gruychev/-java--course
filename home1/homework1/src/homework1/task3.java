package homework1;

import java.util.Scanner;

public class task3 {
	
	public static void main(String[] args) {

        Scanner input = new Scanner(System.in, "UTF-8");

        System.out.println("Name: ");
        String Name = input.nextLine();
        
        System.out.println("Surname: ");
        String Surname = input.nextLine();
        
        System.out.println("year: ");
        byte year = input.nextByte();
        
        System.out.println("sex:");
        char sex = (char)input.nextInt();
        
     
        
        System.out.println("EGN: ");
        long egn1 = input.nextLong();
        
        System.out.println("tel: ");
        long tel = input.nextLong();
        
    
    
        System.out.println("Entered name: " + Name);
        System.out.println("Entered Surname: " + Surname);
        System.out.println("Entered year: " + year);
        System.out.println("Entered sex: " + sex);
        System.out.println("Entered EGN: " + egn1);
        System.out.println("Entered tel: " + tel);
	}

}
