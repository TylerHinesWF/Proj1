import java.io.*;
import java.util.Scanner;

public class Parser {

    //Create a BST tree of Integer type
    private Node<Integer> mybst = new Node<>();

    public Parser(String filename) throws FileNotFoundException {
        process(new File(filename));
    }

    // Implement the process method
    // Remove redundant spaces for each input command
    public void process(File input) throws FileNotFoundException {
        Scanner scanner = new Scanner(input);
        int numLines = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            if (!line.trim().isEmpty()) {
                line.replaceAll("//s+", " ");
                numLines++;
            }
        }

        //call operate_BST method;

    }

    // Implement the operate_BST method
    // Determine the incoming command and operate on the BST
    public void operate_BST(String[] command) {
        switch (command[0]) {
            // add your cases here
            // call writeToFile

            // default case for Invalid Command
            default -> writeToFile("Invalid Command", "./result.txt");
        }
    }

    // Implement the writeToFile method
    // Generate the result file
    public void writeToFile(String content, String filePath) {

    }
}
