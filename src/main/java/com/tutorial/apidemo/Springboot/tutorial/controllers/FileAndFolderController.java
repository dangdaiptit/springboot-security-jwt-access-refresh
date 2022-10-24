package com.tutorial.apidemo.Springboot.tutorial.controllers;

import com.tutorial.apidemo.Springboot.tutorial.models.FolderAndFile;
import com.tutorial.apidemo.Springboot.tutorial.services.ListFolderAndFile;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

@RestController
@RequestMapping(path = "/api/v1/FileFolder")
public class FileAndFolderController {


    @GetMapping("")
    public ArrayList<FolderAndFile> getAll(@RequestParam("url") String url) {
//        url = "C:\\Users\\dangd\\Desktop\\TOIEC";
        String result = java.net.URLDecoder.decode(url, StandardCharsets.UTF_8);
        //list object file and folder
        ListFolderAndFile folderAndFile = new ListFolderAndFile();
        return folderAndFile.listAll(result);
    }


    @GetMapping("/1")
    public ArrayList<FolderAndFile> getAllFile(@RequestParam("url") String url) {
//        url = "C:\\Users\\dangd\\Desktop\\TOIEC";
        String result = java.net.URLDecoder.decode(url, StandardCharsets.UTF_8);
        //list object file and folder

        ListFolderAndFile listFolderAndFile = new ListFolderAndFile();
        return listFolderAndFile.listAllFile(result);
    }


    @GetMapping("/2")
    public ArrayList<FolderAndFile> getAllFolder(@RequestParam("url") String url) {
//        url = "C:\\Users\\dangd\\Desktop\\TOIEC";
        String result = java.net.URLDecoder.decode(url, StandardCharsets.UTF_8);
        //list object file and folder

        ListFolderAndFile listFolderAndFile = new ListFolderAndFile();
        return listFolderAndFile.listAllFolder(result);
    }




//    @GetMapping("/get-list/{url}")
//    public ArrayList<FolderAndFile> getAll(@PathVariable("url") String url) {
////        url = "C:\\Users\\dangd\\Desktop\\TOIEC";
//        // encoder: C%3A%5CUsers%5Cdangd%5CDesktop%5CTOIEC
//        String result = java.net.URLDecoder.decode(url, StandardCharsets.UTF_8);
//        //list object file and folder
//        ListFolderAndFile folderAndFile = new ListFolderAndFile();
//        return folderAndFile.listAll(result);
//    }





}
