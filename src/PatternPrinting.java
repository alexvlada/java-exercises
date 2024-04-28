import javax.swing.JOptionPane;

public class PatternPrinting {


    private static void checkNumber(String str) {
        try {
            int number = Integer.parseInt(str);
            System.out.println(str + " is a valid integer.");
        } catch (NumberFormatException e) {
            System.out.println(str + " is not a valid integer.");
        }
    }

    public static void main(String[] args) {

        String linesChar = JOptionPane.showInputDialog("Enter number of lines:");

        checkNumber(linesChar);

        int lines = Integer.parseInt(linesChar);
        // Logic to print the desired output
        for (int i = lines; i >= 1; i--) {
        //for (int i = 1; i <= lines; i++) {

            int repeat = (lines+1) - i;
            int lengthOfI = String.valueOf(i).length();

            if (lengthOfI > 1)
              {
                repeat = lengthOfI - (lengthOfI-1);
                String line = "X".repeat(lines - repeat - (lengthOfI-1)) + String.valueOf(i).repeat(repeat);
                System.out.println(line);
              }
            else
              {
                String line = "X".repeat(lines - repeat) + String.valueOf(i).repeat(repeat);
                System.out.println(line);
              }
        }
    }
}

