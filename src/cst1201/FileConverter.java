/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cst1201;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author rkhatchadourian
 */
public class FileConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        System.out.print("Please enter the path of the input file: ");

        //connect a scanner to standard input.
        Scanner keyboard = new Scanner(System.in);

        //get the next line from stadnard input.
        String inputFilePath = keyboard.nextLine();

        System.out.print("Please enter the path of the output file: ");

        //get the path of the output file.
        String outputFilePath = keyboard.nextLine();

        PrintWriter outputWriter = new PrintWriter(outputFilePath);

        //the input file.
        File inputFile = new File(inputFilePath);

        //a scanner that reads the input file.
        Scanner inputFileScanner = new Scanner(inputFile);

        //while there are more lines.
        while (inputFileScanner.hasNextLine()) {
            //get the next one.
            String line = inputFileScanner.nextLine();

            //convert to upper case.
            String upperCaseLine = line.toUpperCase();

            //print the line to the output file.
            outputWriter.println(upperCaseLine);
        }

        //close both file connections.
        inputFileScanner.close();
        outputWriter.close();
    }

}
