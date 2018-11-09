// Activity 6, CARANTO
package mdarray;

import java.util.Scanner;

public class MultidimensionalArray {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int row, column;
        int a = 0; //row number
        int b = 0; //column number
        
        System.out.print("Input number of rows: ");
        row = sc.nextInt();
        
        if (row > 0) {
        
            int []columnarray = new int [row];
            System.out.println("\nInput number of columns for the following rows."); 

                while (a != row) {
                    System.out.print("Row " + a + ": ");
                    column = sc.nextInt();
                    columnarray[a] = column;
                    a++;
                }

            int [][] mdarray = new int [row][];
            a = 0;

                while (a != row) {
                    mdarray[a] = new int [columnarray[a]];
                    a++;
                } 

            System.out.println("\nInput values for the following elements of the multidimensional array. ");

                for (a = 0; a != row; a++){

                    while (b != columnarray[a]) {
                        System.out.print("Row " + a + " Column " + b + ": ");
                        mdarray[a][b] = sc.nextInt();
                        b++;
                    }
                    b = 0;
                }

            b = 0;
            a = 0;
            
            System.out.println("\nELEMENTS OF MULTIDIMENSIONAL ARRAY"); 

                while (a != row) {

                    while (b != columnarray[a]){
                    System.out.print(mdarray[a][b] + "\t");
                    b++;
                    }
                  System.out.print("\n");  
                  a++;
                  b = 0;
                }
        }else if (row==0) {
            System.out.println("");
        }else {
            System.out.println("Anong ginagawa mo?");
        }

    }
    
}
