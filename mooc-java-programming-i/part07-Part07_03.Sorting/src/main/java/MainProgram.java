import java.util.Arrays;
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        sort(numbers);
        

    }
    
    public static int smallest(int[] array) {
        int smallest = array[0];
        for (Integer n : array) {
            if (smallest > n) {
                smallest = n;
            }
        }
        return smallest;
    }
    
    public static int indexOf(int[] array) {
        int smallest = array[0];
        int index = 0;
        for (int n = 0; n < array.length; n++) {
            if (smallest > array[n]) {
                smallest = array[n];
                index = n;
            }
        }
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] array, int start) {
        int smallest = array[start];
        int index = start;
        for (int n = start; n < array.length; n++) {
            if (smallest > array[n]) {
                smallest = array[n];
                index = n;
            }
        }
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int index = array[index1];
        array[index1] = array[index2];
        array[index2] = index;
    }
    
    public static void sort(int[] array) {
        for (int n = 0; n < array.length; n++) {
            swap(array, indexOfSmallestFrom(array, n), n);
            System.out.println(Arrays.toString(array));
        }
    }
}    