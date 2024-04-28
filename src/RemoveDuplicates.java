import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Test primer
        Integer[] originalArray = {1, 2, 2, 3, 4, 4, 5};
        Integer[] uniqueArray = removeDuplicates(originalArray);

        System.out.println("Originalni niz: " + Arrays.toString(originalArray));
        System.out.println("Niz bez duplikata: " + Arrays.toString(uniqueArray));
    }

    public static <T> T[] removeDuplicates(T[] originalArray) {
        // Kreiranje seta za uklanjanje duplikata
        Set<T> set = new HashSet<>(Arrays.asList(originalArray));

        // Konvertovanje seta nazad u niz
        // Obratite pažnju da je tip vraćenog niza Object[], pa ga konvertujemo
        @SuppressWarnings("unchecked")
        T[] uniqueArray = (T[]) set.toArray((T[]) java.lang.reflect.Array.newInstance(originalArray.getClass().getComponentType(), 0));

        return uniqueArray;
    }
}