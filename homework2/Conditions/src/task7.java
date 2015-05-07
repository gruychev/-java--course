import java.util.Scanner;

public class task7{


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in,"UTF-8");

        Double a, b, c, d, x1 , x2,x3;
        System.out.println("Enter a ->");
        a = input.nextDouble();
        System.out.println("Enter b ->");
        b = input.nextDouble();
        System.out.println("Enter c ->");
        c = input.nextDouble();
        d = b*b - 4*a*c;
        if (d<0){
        System.out.println("There are no decisions");
        }
        else if (d==0){
        	x3 = ((-1)*b)/(2*a);
        		System.out.println("x1=x2" + x3);
        }
         else{
        	 x1=((-1)*(b) + Math.sqrt(d))/(2*a);
             x2=((-1)*(b) - Math.sqrt(d))/(2*a);
             System.out.println(x1);
             System.out.println(x2);
         }
             
      
        						
        }
     }


          
        
   