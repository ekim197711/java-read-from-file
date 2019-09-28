package com.codeinvestigator.readfromfile.fileio;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.hamcrest.StringDescription;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class ReadFileApacheCommonsTest {

    @Test
    public void testReadFileFileUtils() throws IOException {
        File file = new File(getClass().getClassLoader().getResource("myfile.txt").getFile());
        String result = FileUtils.readFileToString(file, "UTF-8");
        System.out.println(result);
    }

    @Test
    public void testReadFileIOUtils() throws IOException {
        InputStream stream = getClass().getClassLoader().getResourceAsStream("myfile.txt");
        String result = IOUtils.toString(stream, "UTF-8");
        System.out.println(result);
    }

    @Test
    public void testReadFileIOUtilsFromOtherJar() throws IOException {
        InputStream stream = StringDescription.class.getResourceAsStream("/LICENSE.txt");
        String result = IOUtils.toString(stream, "UTF-8");
        System.out.println(result);
    }
}
