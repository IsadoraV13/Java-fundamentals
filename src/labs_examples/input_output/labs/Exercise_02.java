package labs_examples.input_output.labs;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Input/Output Exercise 2: File encryption
 *
 *      -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 *      -For example, change every 'a' to '-' and every 'e' to '~' .
 *      -Make sure you close the connections to both files.
 *
 *      Then, ead back the encrypted file using the BufferedReader and
 *      print out the unencrypted version. Does it match the original file?
 *
 */

class Exercise_02 {
    static String readFilePath = "/Users/isadora/Documents/CodingNomads/DailyWork/ClassCode/Day_1_Quiz/Day_1_Quiz.txt";
    static String writeFilePath = "/Users/isadora/Documents/CodingNomads/DailyWork/ClassCode/Day_1_Quiz/Day_1_Quiz_Rewrite.txt";
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        FileReader fr2 = null;

        //Reading Quiz.txt and writing to Quiz_Rewrite.txt (with 'encryption')
        try {
            fr = new FileReader(readFilePath);
            fw = new FileWriter(writeFilePath);
            int c;
            while((c = fr.read()) != -1) {
                if (c == 97) {
                    c = 45;
                } else if (c == 101) {
                    c = 126;
                }
                fw.write(c);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        } catch (IOException e) {
            System.out.println("IOException");
        } finally {
            try {
                fr.close();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //Reading Quiz_Rewrite.txt, 'decrypting' and printing to console
        try {
            fr2 = new FileReader(readFilePath);
            int c;
            while((c = fr2.read()) != -1) {
                if (c == 45) {
                    c = 97;
                } else if (c == 126) {
                    c = 101;
                }
                System.out.print((char)(c));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        } catch (IOException e) {
            System.out.println("IOException");
        } finally {
            try {
                fr2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}