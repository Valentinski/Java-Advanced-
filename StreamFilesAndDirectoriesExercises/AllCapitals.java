package StreamFilesAndDirectoriesExercises;

import java.io.*;

public class AllCapitals {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(
                new FileWriter("Resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/output.txt"));
        BufferedReader br = new BufferedReader(
                new FileReader("Resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/input.txt"));
        br.lines().forEach(line -> pw.println(line.toUpperCase()));
        br.close();
        pw.close();
    }
}
