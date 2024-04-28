import java.util.Scanner;
import javax.swing.*;

    public class TwoLargestElementsInTheSequenceInputOneByOne {

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

            int[] array = niz;

            // Pretpostavljamo da su prva dva elementa niza najveća
            int max1 = Integer.MIN_VALUE;
            int max2 = Integer.MIN_VALUE;

            // Prolazimo kroz niz da pronađemo dva najveća elementa
            for (int broj : array) {
                if (broj > max1) {
                    max2 = max1; // prethodni max1 postaje max2
                    max1 = broj; // ažuriramo max1 sa trenutnom najvećom vrednošću
                } else if (broj > max2) {
                    max2 = broj; // ažuriramo max2 ako je trenutna vrednost veća od max2, ali manja od max1
                }
            }
            // Ispisujemo dva najveća elementa
            System.out.println("Prva dva člana sa najvećim vrednostima su: " + max1 + " i " + max2);

        }
    }
