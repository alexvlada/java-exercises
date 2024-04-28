import javax.swing.*;
import java.util.Arrays;
import java.util.Collections;


public class EnterArrayThenOrderElementsAscendingDescending {

    public static void sortAscThenDesc(Integer[] array) {
        // Sort in ascending order
        Arrays.sort(array);
        System.out.println("Sorted in ascending order: " + Arrays.toString(array));

        // Sort in descending order
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("Sorted in descending order: " + Arrays.toString(array));
    }

    public static void main(String[] args) {
        Integer[] myArray = {5, 3, 8, 4, 2, 7, 1, 6};
        sortAscThenDesc(myArray);
    }

}
