/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangle;
   import java.util.Scanner;
/**
 *
 * @author cc2_1d-9
 */
public class Triangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // TODO Auto-generated method stub
        Area triangle = new Area();
        double a,b,c;

        // input triangle lengths a, b, c 
        Scanner inputTriangle = new Scanner(System.in);
        System.out.println("Please enter triangle side a");
        a = inputTriangle.nextDouble();
        System.out.println("Please enter triangle side b");
        b = inputTriangle.nextDouble();
        System.out.println("Please enter triangle side c");
        c = inputTriangle.nextDouble();
        triangle.findArea(a, b, c);
    }
}
    
    
