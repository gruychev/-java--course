package homework5;

public class ClassesBasic {
public static void main(String[] args) {
	
	String[] names = { "Rex1", "Rex2", "Rex3", "Rex4","Rex5","Rex6","Rex7","Rex8","Rex9","Rex10"};
	int[] years = { 1,2,4,5,8,9,2,5,6,7};	
	
		
		for (int i = 0; i < names.length; i++) {
			Cat rex1 = new Cat(names[i],years[i] );
			rex1.Say();
		
		}
			
		
	
		
		
	}



}
