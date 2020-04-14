
package javaapplication19;
import java.util.Scanner;

public class JavaApplication19 {
    
    static Scanner s = new Scanner(System.in);
       
    public void fiboSeries(){
    int a=0, b=1;
        System.out.println("FIBONACCI SERIES");
        System.out.print("Enter the number of terms to be generated: ");
        int n = s.nextInt();
        System.out.print(a + " " + b + " ");
        for(int i=1; i<n; i++){
            int c = a+b; a=b; b=c;
            System.out.print(c + " ");
        }
}
    static int factorial(int n){
      if (n == 0){
          return 1; 
      }else{
          return (n* factorial (n-1));
      }
      }
    
      static int fact(){
      System.out.println("\nEnter number of elements");
      
      int x = s.nextInt();
      int [] arr = new int [x];
      int r; 
      
        System.out.println("enter element");
        for (int a =0 ; a< arr.length; a++){
            arr[a] = s.nextInt();
        }
        
        for (int b = 0; b <arr.length; b++){
            System.out.print("f( "+arr[b]+")\t");
        }
        System.out.println("");
        for (int c =0; c< arr.length; c++){
            r = factorial(arr[c]);
            System.out.print(r + "\t");
        }      
        return x;
    }
    public static void main(String[] args) {
        
         System.out.print("Factorial or Fibonacci: \n");
         String fibofact = s.nextLine();
       
         if  (fibofact.equals("Factorial")) {
             
         } else if(fibofact.equals("Fibonacci")){

         }
   
        JavaApplication19 ob = new JavaApplication19();
        ob.fiboSeries();
        ob.fact();
        
    }
    
    
}
