package org.example.prac_19;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DirectoryToList {
    public static List<String> getFirstFiveFilesInDirectory(String directoryPath) throws IOException {
        List<String> fileList = new ArrayList<>();
        Path dir = Paths.get(directoryPath);

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
            for (Path file : stream) {
                fileList.add(file.getFileName().toString());
                if (fileList.size() >= 5) {
                    break;
                }
            }
        }

        return fileList;
    }

    public static void main(String[] args) throws IOException {
        String directoryPath = "/";
        List<String> firstFiveFiles = getFirstFiveFilesInDirectory(directoryPath);

        System.out.println("First five files in the directory:");
        for (String fileName : firstFiveFiles) {
            System.out.println(fileName);
        }
    }
}

