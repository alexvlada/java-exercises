public class OddEvenSort {
    public static String sortMyString(String s) {
        StringBuilder evenIndexed = new StringBuilder();
        StringBuilder oddIndexed = new StringBuilder();

        // Iterate over each character in the string
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                // Characters at even indices
                evenIndexed.append(s.charAt(i));
            } else {
                // Characters at odd indices
                oddIndexed.append(s.charAt(i));
            }
        }

        // Combine the two groups with a space in between
        return evenIndexed.toString() + " " + oddIndexed.toString();
    }

    public static void main(String[] args) {
        String s = "abcdefgh";
        // Now you need to pass the string 's' to the method
        System.out.println(sortMyString(s)); // Expected output: "aceg bdfh"
    }
}
