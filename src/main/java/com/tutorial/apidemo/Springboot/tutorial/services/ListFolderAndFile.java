package com.tutorial.apidemo.Springboot.tutorial.services;

import com.tutorial.apidemo.Springboot.tutorial.models.FolderAndFile;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;


@Service
public class ListFolderAndFile {

    public ArrayList<FolderAndFile> listAll(String url) {

        //Creating a File object for directory
        File directoryPath = new File(url);
        //List of all files and directories
        File[] filesList = directoryPath.listFiles();
        ArrayList<FolderAndFile> listAll = new ArrayList<>();

        assert filesList != null;
        for (File file : filesList) {
            FolderAndFile folderAndFile = new FolderAndFile(file.getName(), file.getAbsolutePath(), (float) file.length());
            listAll.add(folderAndFile);
        }
        return listAll;
    }


    //get list all file
    public ArrayList<FolderAndFile> listAllFile(String url){
        //Creating a File object for directory
        File directoryPath = new File(url);
        FileFilter textFilefilter = File::isFile;
        //List of all the text files
        File[] filesList = directoryPath.listFiles(textFilefilter);
        ArrayList<FolderAndFile> listFile = new ArrayList<>();


        assert filesList != null;
        for (File file : filesList) {
            FolderAndFile folderAndFile = new FolderAndFile(file.getName(), file.getAbsolutePath(), (float) file.length());
            listFile.add(folderAndFile);
        }

        return listFile;

    }

    //get list all folder
    public ArrayList<FolderAndFile> listAllFolder(String url){
        //Creating a File object for directory
        File directoryPath = new File(url);
        FileFilter textFilefilter = File::isDirectory;
        //List of all the text files
        File[] filesList = directoryPath.listFiles(textFilefilter);
        ArrayList<FolderAndFile> listFile = new ArrayList<>();


        assert filesList != null;
        for (File file : filesList) {
            FolderAndFile folderAndFile = new FolderAndFile(file.getName(), file.getAbsolutePath(), (float) file.length());
            listFile.add(folderAndFile);

        }

        return listFile;

    }
}
