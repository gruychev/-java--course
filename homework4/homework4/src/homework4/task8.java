package homework4;

public class task8 {
	public static void main(String[] args) {
	int[] array = {3 ,1,10,7,8,7,10};
	      int temp;
	      for(int j = 0; j < array.length-1; j++){  
          for(int i = 0; i < array.length-1; i++){
             if(array[i] > array[i+1]){
                  
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                   
              }
            }
	        }
            
            for(int i = 0; i < array.length; i++){
            	  System.out.print(array[i]+" ");
            }
        
}
}
