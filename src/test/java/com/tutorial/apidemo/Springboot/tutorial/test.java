package com.tutorial.apidemo.Springboot.tutorial;


import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class test {

    public static void main(String[] args) {
        //Creating a File object for directory
        File directoryPath = new File("C:\\Users\\dangd\\Desktop\\TOIEC");
        FileFilter textFilefilter = new FileFilter(){
            public boolean accept(File file) {
                boolean isFile = file.isDirectory();
                if (isFile) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        //List of all the text files
        File filesList[] = directoryPath.listFiles(textFilefilter);
        System.out.println("List of the text files in the specified directory:");
        for(File file : filesList) {
            System.out.println("File name: "+file.getName());
            System.out.println("File path: "+file.getAbsolutePath());
            double a = file.getUsableSpace()/ file.getTotalSpace();
            System.out.println("Size :"+a);
            System.out.println(" ");
        }




    }


    public Set<String> listFilesUsingFileWalk(String dir, int depth) throws IOException {
        try (Stream<Path> stream = Files.walk(Paths.get(dir), depth)) {
            return stream
                    .filter(file -> !Files.isDirectory(file))
                    .map(Path::getFileName)
                    .map(Path::toString)
                    .collect(Collectors.toSet());
        }
    }
}
