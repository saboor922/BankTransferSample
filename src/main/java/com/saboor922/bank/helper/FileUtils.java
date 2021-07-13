package com.saboor922.bank.helper;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FileUtils {

    /**
     * Helper method to read the File into a List
     *
     * @param fileName Path to the file
     * @return A List of String Objects
     */
    private List<String> readFile(String fileName) {
        try (BufferedReader bufferedReader = Files.newBufferedReader(Paths.get(fileName))) {

            //bufferedReader returns as stream and convert it into a List
            return bufferedReader.lines().collect(Collectors.toList());
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
        return null;
    }

    /**
     * Helper method to write to the File using a contents List
     *
     * @param fileName    Path to the file
     * @param contentList The List collection of Strings
     */
    private void writeFile(String fileName, List<String> contentList) {
        // If the file exists, append to it
        try (FileWriter fileWriter = new FileWriter(fileName, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.newLine();
            contentList.forEach(line -> {
                try {
                    bufferedWriter.write(line);
                } catch (IOException e) {
                    System.err.format("IOException: %s%n", e);
                }
            });

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
    }
}
