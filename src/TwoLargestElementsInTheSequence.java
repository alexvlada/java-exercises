import javax.swing.*;

public class TwoLargestElementsInTheSequence {

    public static void main(String[] args) {

        String ulazniString = JOptionPane.showInputDialog("Unesite elemente niza odvojene zarezom:");

        // Razdvajamo uneti string na osnovu zareza
        String[] elementiStringa = ulazniString.split(",");

        // Konvertujemo string niz u niz integera
        int[] niz = new int[elementiStringa.length];
        for (int i = 0; i < elementiStringa.length; i++) {
            niz[i] = Integer.parseInt(elementiStringa[i].trim()); // trim() uklanja bele prostore
        }

        // Opciono: Ispisujemo unete elemente niza
        StringBuilder sb = new StringBuilder("Uneli ste sledeće elemente: ");
        for (int element : niz) {
            sb.append(element).append(" ");
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
