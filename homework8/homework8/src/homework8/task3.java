package homework8;

public class task3 {
	  public static void main(String[] args) {
	   String text = "This is Java for Java Java Java";
 
	   int index = text.indexOf("Java");
       int t=0;

while(index != -1) {
	index = text.indexOf("Java", index + 1);
    t=t+1;
	}
System.out.println(t);

  }
}