package javaapplication1;

public class JavaApplication1 {

    public static void main(String[] args) {

        int[] myArray = {3,9,15,20,65,11,18,4,2,21,98,};
        System.out.println("Elements of Array: ");
        System.out.println(myArray);
          
        int [] odd = new int[myArray.length];
        int [] even = new int[myArray.length];
                int o = 0;
                int e = 0;

        System.out.println(" ODD "+"\t "+ " EVEN " );
        for (int i=0; i<myArray.length; i++){
          if (myArray [i]%2 != 0){
           odd [o] = myArray[i];
           o++;

          } 
            if (myArray [i]%2 == 0){
              even [e] = myArray[i];
              e++;
             
          }     
                
        }
        System.out.println(odd[0] + "\t" + even[0]);
        System.out.println(odd[1] + "\t" + even[1]);
        System.out.println(odd[2] + "\t" + even[2] );
        System.out.println(odd[3] + "\t" + even[3]);
        System.out.println(odd[4]+ "\t" + even[4]);
        System.out.println(odd[5]);
        
    }
    
}
