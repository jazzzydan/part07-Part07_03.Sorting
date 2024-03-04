import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array){
        int smallest = array[0]; // Initialize smallest to the first element of the array
        for (int iterate : array) {
            if (smallest > iterate) {
                smallest = iterate;
            }
        }
        return smallest;
    }
    public static int indexOfSmallest(int[] array){
//        int smallest = MainProgram.smallest(array);
//        int index = 0;
//        for (int i = 0; i < array.length; i++) {
//            int iterate = array[i];
//            if (iterate == smallest) {
//                index = i;
//            }
//        }
//        return index;
//
//        or

        int smallest = array[0]; // Initialize smallest to the first element of the array
        int smallestIndex = 0; // Initialize the index of the smallest element

        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                smallestIndex = i; // Update the index of the smallest element
            }
        }

        return smallestIndex;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {

        if (startIndex < 0 || startIndex >= array.length) {
            throw new IllegalArgumentException("Start index is out of bounds.");
        }

        int smallest = array[startIndex]; // Initialize smallest to the first element of the array
        int smallestIndex = startIndex; // Initialize the index of the smallest element

        for (int i = startIndex + 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                smallestIndex = i; // Update the index of the smallest element
            }
        }

        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int toSwap = array[index1];
        array[index1] = array[index2];
        array[index2] = toSwap;
    }

    public static void sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int indexOfSmallest = MainProgram.indexOfSmallestFrom(array, i);
            MainProgram.swap(array, i, indexOfSmallest);
            System.out.println(Arrays.toString(array));
        }
    }
}
