package com.codeinvestigator.readfromfile.fileio;

import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ReadFileFromWebTest {

    @Test
    public void testReadFromWeb() throws IOException {
        URL myurl = new URL("https://www.codeinvestigator.com");
        URLConnection connection = myurl.openConnection();
        InputStream inputStream = connection.getInputStream();
        String result = IOUtils.toString(inputStream, "UTF-8");
        System.out.println(result);
    }
}
