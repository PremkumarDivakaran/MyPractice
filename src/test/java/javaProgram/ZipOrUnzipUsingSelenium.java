package javaProgram;

import org.openqa.selenium.io.Zip;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ZipOrUnzipUsingSelenium {

    @Test
    public void zipFile(){
        try {
            Zip.zip(new File("./data/fileToBeZipped/Untitled.rtf"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void unzipFile(){
        try {
            Zip.unzip(new FileInputStream(new File("./data/fileToBeUnzipped.zip")),
                    new File("./file"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
