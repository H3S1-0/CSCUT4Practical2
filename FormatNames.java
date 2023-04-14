import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
// we import the date formater to help us the organisation of the date format
import static sun.tools.jconsole.Formatter.formatDate;

public class FormatNames {
    public static void main(String[] args) {

        // Initialize variables
        boolean isUpperCase = false; // set a boolean variable to see if the output should be in upper case
        String input_F = "input.txt"; // set a default value for the input file name
        String Out_F = "formatted.txt"; // set a default value for the output file name

        // now we Check for arguments in command lines

        if (args.length > 0) {
            // going through the arguments
            for (String arg : args) {

                // cnow we check if our argument is using -u flag
                if (arg.equals("-u")) {
                    // if it is, set the isUpperCase variable to true
                    isUpperCase = true;
                } else {
                    // Otherwise, use the argument as the input file name
                    // if it is not "-u", set the input file name to the argument value
                    input_F = arg;
                }
            }
        }


        // scanner for the input file
        try (Scanner File_Check = new Scanner(new File(input_F));
             // create an object to store the output
             PrintWriter outFile = new PrintWriter(Out_F)) {

            // going through the input files
            while (File_Check .hasNextLine()) {
                //.nextline helps us to move to the next line

                String line = File_Check .nextLine();
                // converting the array into parts
                String[] parts = line.split(" ");

                StringBuilder construc_Builder = new StringBuilder();

                // going through the each part of the names
                for (int i = 0; i < parts.length - 1; i++) {
                    // make the first letter into uppercase
                    // by finding the first letter of the words
                    String Names = parts[i];

                    // uppercasing the first letter and soring it int the construc_Builder  by using append
                    construc_Builder.append(Character.toUpperCase(Names.charAt(0)))
                            .append(Names.substring(1))
                            .append("  ");
                }

                // finding the last element of the names
                String Last_Names = parts[parts.length - 1];
                // formatting the date format
                String Date_Of_Birth = Formatter(parts[parts.length - 1]);
                // adding the last letter to the construc_Builder

                // adding the formated date to the construc_Builder
                construc_Builder.append(Character.toUpperCase(Last_Names.charAt(0)))
                        .append(Last_Names.substring(1))
                        .append(" ")
                        .append(Date_Of_Birth);

