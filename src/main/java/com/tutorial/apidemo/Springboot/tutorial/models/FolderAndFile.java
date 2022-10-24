package com.tutorial.apidemo.Springboot.tutorial.models;


import com.tutorial.apidemo.Springboot.tutorial.services.ListFolderAndFile;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FolderAndFile extends ListFolderAndFile {
    private String fileName;
    private String filePath;
    private Float size;

}
