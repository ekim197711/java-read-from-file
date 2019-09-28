package com.codeinvestigator.readfromfile.fileio;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadFileBasicTest {

    @Test
    public void readFileBasic() throws IOException {
        InputStream stream = getClass().getClassLoader().getResourceAsStream("myfile.txt");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(stream));
        String line="";
        String result="";
        while ((line = bufferedReader.readLine()) != null){
            result += line + "\n";
        }
        System.out.println(result);
    }

    @Test
    public void readFileBasicFromClassLevel() throws IOException {
        InputStream stream = getClass().getResourceAsStream("myfile_placed_in_subfolder.txt");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(stream));
        String line="";
        String result="";
        while ((line = bufferedReader.readLine()) != null){
            result += line + "\n";
        }
        System.out.println(result);
    }

}
