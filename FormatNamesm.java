import java.io.*;
import java.util.*;

public class FormatNamesm {

    public static void main(String[] args) {

        boolean isUpperCase = false;
        // assigning the directories to the variables
        String inputm_F = "inputm.txt";
        String out_F = "formattedm.txt";


        // Parseing the arguments of the lines

        // checking for the -u element
        if (args.length > 0 && args[0].equals("-u")) {

            isUpperCase = true;
            // moving to the second argument
            inputm_F = args[1];

            //moving to the third argument
            out_F = args[2];

        } else {
            // if no -u in the elements
            inputm_F = args[0];
            out_F = args[1];
        }


        // creating an scanner
        Scanner inFile = null;


        // moving to the try and catch blocks
        try {

            // creating a new
            File input_new_file = new File(inputm_F);

            inFile = new Scanner(input_new_file);
        } catch (IOException ae) {

            // parsing the error message
            System.err.println("IOException: " + ae.getMessage() + " not found");
            System.exit(1);
        }

//        PrintWriter outFile = null;
//        try {
//
//            outFile = new PrintWriter(out_F);
//
//        } catch (FileNotFoundException ae) {
//
//            System.err.println("FileNotFoundException: " + ae.getMessage());
//        }

        // The remaining code would likely read lines from the input file, format them according to some set of rules (possibly including converting names to uppercase if "toUpper" is "true"), and write the formatted lines to the output file using the PrintWriter object.
    }
}
