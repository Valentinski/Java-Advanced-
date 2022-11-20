package StreamFilesAndDirectoriesExercises;

import java.io.*;

public class LineNumbers {
    public static void main(String[] args) throws IOException {

        PrintWriter pw =
                new PrintWriter("Resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/output.txt");

        BufferedReader br =
              new BufferedReader( new FileReader("Resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/inputLineNumbers.txt"));

        String line = br.readLine();
        int counter = 1;
        while (line != null){
            System.out.println(counter + ". "+ line);

            counter++;
            line = br.readLine();
        }
        br.close();
        pw.close();

    }
}
