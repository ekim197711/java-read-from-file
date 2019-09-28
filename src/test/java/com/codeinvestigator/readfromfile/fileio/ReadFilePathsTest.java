package com.codeinvestigator.readfromfile.fileio;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadFilePathsTest {

    @Test
    public void testReadFilePaths() throws URISyntaxException, IOException {
        Path path = Paths.get(getClass()
                .getClassLoader().getResource("myfile.txt").toURI()
        );
        byte[] mybytes = Files.readAllBytes(path);
        String result = new String(mybytes);
        System.out.println(result);
    }

    @Test
    public void testReadFilePathsStreams() throws URISyntaxException, IOException {
        Path path = Paths.get(getClass()
                .getClassLoader().getResource("myfile.txt").toURI()
        );
        Stream<String> lines = Files.lines(path);
        String result = lines.collect(Collectors.joining("\n"));
        System.out.println(result);
    }

}
