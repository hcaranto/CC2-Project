//Activity 5, CARANTO
package array;

public class OddEvenTable {
 
    public static void main(String[] args) {
             
        int []array = {3,9,15,20,65,23,18,4,2,14,21};
        int index = 0;
        int []evenarray = new int[array.length];
        int []oddarray = new int[array.length];
        
        System.out.println("Elements of Array");
        
        do {
             System.out.print(array[index] + ", ");
             index++;
            } while (index !=array.length-1);
                
                System.out.println(array[index]);

            int a = 0, b = 0;
                
        for (index = 0; index != array.length; index++){
            
            int modulo = array[index]%2;

            if (modulo == 0){
                evenarray[a] = array[index];
                a++;
            } else {
                oddarray[b] = array[index];           
                b++;
            }
        }
        
        a = 0;
        b = 0;
        
        System.out.println("\nEven\t\tOdd");
        do {   
            
            if (evenarray[a] != 0 && oddarray[b] !=0) {
                System.out.println((evenarray[a]) + "\t\t" + (oddarray[b]));
                    a++;
                    b++;
            }
            else if (evenarray[a] == 0 && oddarray[b] !=0){       
             System.out.println((" ") + "\t\t" + (oddarray[b]));
             b++;
            }
            else if (evenarray[a] != 0 && oddarray[b] ==0){       
             System.out.println((evenarray[a]) + "\t\t" + (""));
             a++;
            }
        } while ((a+b)<array.length);
    }
}
   

