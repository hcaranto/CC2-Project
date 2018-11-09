//FINALS - Activity 1; CARANTO
package methods;

import java.util.Scanner;

public class Fibonnaci {

    
    public static void main(String[] args) {
        display();
    }//
    static int fibonacci(int i){
        
        switch (i) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return (fibonacci(i-1)) + (fibonacci(i-2));
                        }
    }//
    static void display(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        int input = sc.nextInt();
          
        for (int b = 0; b != (input+1); b++){
            System.out.print("f(" + b + ")\t");
        }
        
         System.out.print("\n");
        
        for (int row = 0; row != (input+1); row++){
              System.out.print("\n");
            for (int c = 0; c != (row+1); c++){
                System.out.print(fibonacci(c) + "\t");
            }
        }
        
    }
    
}
