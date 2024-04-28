import javax.swing.*;
import java.util.Arrays;
import java.util.Collections;

public class EnterArrayThenOrderElements {

    private static void checkNumber(String str, Integer checkOrder) {
        try {
            int number = Integer.parseInt(str);
            if (checkOrder == 1)
            {
                System.out.println(str + " is a valid integer value for number of array elements.");
            }
            else
            {
                System.out.println(str + " is a valid integer value for an element.");
            }

        } catch (NumberFormatException e) {
            if (checkOrder == 1)
            {
                System.out.println(str + " is NOT a valid integer value for number of array elements.");
            }
            else
            {
                System.out.println(str + " is NOT a valid integer value for an element.");
            }
        }
    }

    public static void main(String[] args) {
        // Tražimo od korisnika da unese veličinu niza
        String velicinaNizaStr = JOptionPane.showInputDialog("Unesite veličinu niza:");
        checkNumber(velicinaNizaStr,1);
        int velicinaNiza = Integer.parseInt(velicinaNizaStr);

        // Kreiramo niz integera date veličine
        int[] niz = new int[velicinaNiza];


        // Unosimo elemente niza preko dijaloga
        for (int i = 0; i < niz.length; i++) {
            String elementStr = JOptionPane.showInputDialog("Unesite element " + (i + 1) + ":");
            checkNumber(elementStr,2);
            niz[i] = Integer.parseInt(elementStr); // Konvertujemo uneti string u integer
        }

        // Opciono: Ispisujemo unete elemente niza
        StringBuilder sb = new StringBuilder("Uneli ste sledeće elemente: ");
        for (int i = 0; i < niz.length; i++) {
            sb.append(niz[i]);
            if (i < niz.length - 1) {
                sb.append(", ");
            }
        }
        JOptionPane.showMessageDialog(null, sb.toString());
        // sortiramo niz
        Arrays.sort(niz);

       // System.out.println("Sortirani niz u rastućem redosledu: " + Arrays.toString(niz));
        JOptionPane.showMessageDialog(null, "Sortirani niz u rastućem redosledu: " + Arrays.toString(niz));

    }
}
