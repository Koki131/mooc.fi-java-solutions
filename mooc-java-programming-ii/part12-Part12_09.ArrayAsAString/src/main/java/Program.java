import java.util.*;
public class Program {

    public static void main(String[] args) {
        // Test your method here
   int[][] matrix = {
  {1},
  {2, 2},
  {3, 3, 3},
  {4, 4, 4, 4}
};
System.out.println(arrayAsString(matrix));
    }
    
    public static String arrayAsString(int[][] array) {
        StringBuilder sb = new StringBuilder();
        for (int n = 0; n < array.length; n++) {
            // int count = 0;           
            for (int i = 0; i < array[n].length; i++) {                
                sb.append(array[n][i]);
                // count++;
               //  if (count == array[n].length) {
                    // sb.append("\n");
                //}                
            }
            sb.append("\n");
            
        }
        return sb.toString();
    }

}
