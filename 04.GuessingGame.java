// Activity 4, CARANTO
package guessing.game;

import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        
        int number, guess, space = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input number to be guessed between 1 - 1000: ");
        number = sc.nextInt();
        
        if (number>1000){
            System.out.println("Invalid number. Try again!");
            
        }
        else if (number<0){
            System.out.println("Invalid number. Try again!");  
         
        }
        else{
        
            do {
                System.out.println(" ");
                space++;
            } while (space!=15);
            
            int modulo = number%2;
            
            if (modulo==0){
                System.out.println("Hint: The number is even!");
            } else {
                System.out.println("Hint: The number is odd!");
            }
            
            System.out.println("Guess the number: ");
            guess = sc.nextInt();
            
            while (guess!=number){
                     
                if (guess>number){
                    System.out.println("Wrong! Hint: Guess a lower number. Guess again.");
                    guess = sc.nextInt();
                }
                else if (guess<number){
                    System.out.println("Wrong! Hint: Guess a higher number. Guess again.");
                    guess = sc.nextInt();
                }
            }
            System.out.println("Correct!");
            }
        }
    }
}
