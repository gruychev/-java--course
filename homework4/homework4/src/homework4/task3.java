package homework4;


public class task3 {
	public static void main(String[] args) {
		int n=10;
		int k=1;
	     int[] array = new int[10];
	     for (int i = 0; i < array.length; i++) {
	    	 array[i] = k++; 
	    	 array[i] =array[i]*10 ;
	     }
	 	 	    	 
	 	     
	     for(int i = 0; i < array.length; i++){
	            System.out.print(array[i]+" ");
	     }


}
}