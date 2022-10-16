import java.util.Scanner;

public class MyClass {
    
    int num;
    
    public static int CheckOddEven(int num){
        
        if(num % 2 == 0){
            
            System.out.println(num + " is an even number");
            
            return num;
            
        } else{
            
            System.out.println(num + " is an odd number");
            
            return num;
            
        }
     
    }
    
    public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter a number: ");
      int i = input.nextInt();
      
      CheckOddEven(i);
      
    }
}