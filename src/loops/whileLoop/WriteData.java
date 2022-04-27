package loops.whileLoop;

import java.io.File;
import java.io.IOException;

public class WriteData {
    public static void main(String[] args) throws IOException, InterruptedException {


    File file = new File("studentList.txt");

     file.createNewFile();
        Thread.sleep(5000);
        file.delete();
}}