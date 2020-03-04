package labs_examples.input_output.labs;


import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a text file 5 bytes at a time and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 */

class Example {
    static String filePath = "/Users/isadora/Documents/CodingNomads/DailyWork/ClassCode/Day_1_Quiz/Day_1_Quiz.txt";
    public static void main(String[] args) {
        BufferedInputStream bin = null;

        try {
            bin = new BufferedInputStream(new FileInputStream(filePath));
            byte[] buffer = new byte[5];
            int c;
            while((c = bin.read(buffer)) != -1) {
                for(byte b : buffer) {
                    System.out.print((char)b);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        } catch (IOException e) {
            System.out.println("IOException");
        } finally {
            try {
                bin.close(); // does this automatically also close the File input stream?
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}