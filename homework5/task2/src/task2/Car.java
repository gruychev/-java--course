package task2;

public class Car {
	int age;
	
	public Car(){
		
		this.age = 0;
	}
	
	public Car(int age){
		
		this.age = age;
		
		int[] car = { 4000,2000,5000,6000,8000,9000,3000,5000,6000,7000};
		
		int temp;
	      for(int j = 0; j < car.length-1; j++){  
        for(int i = 0; i < car.length-1; i++){
           if(car[i] > car[i+1]){
                
                  temp = car[i];
                  car[i] =car[i+1];
                  car[i+1] = temp;
                 
            }
          }
	        }

		
}
}

