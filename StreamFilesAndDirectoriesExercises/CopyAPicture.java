package StreamFilesAndDirectoriesExercises;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyAPicture {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("Resources/_NZ_5997.jpg");

        FileOutputStream fos = new FileOutputStream("Resources/_NZ_5997Copy.jpg");

        byte [] buffer = new byte[1024];

        while (fis.read(buffer) >=  0){

            fos.write(buffer);
        }
        fis.close();
        fos.close();
    }
}
