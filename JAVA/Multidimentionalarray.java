
package multidimentionalarray;
import java.util.Scanner;

public class Multidimentionalarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   
        System.out.println("Enter Row: ");
        int x = sc.nextInt();
        
        System.out.println("Enter Column: ");
        int y = sc.nextInt();
        
        int[][] a = new int[x][y];
        
        for (int i = 0; i<x; i++){
            for(int j = 0; j<y; j++){
                System.out.println("Row"+i+";"+" "+"Column"+j+";");
                
                a[i][j] = sc.nextInt();
                
                
            }
        }
        
        System.out.println("Elements: ");
        for (int[]t:a){
            for (int i:t ){
                System.out.print(i+"\t");
                
            }
            System.out.println("\n");
        }  
    }
  } 

