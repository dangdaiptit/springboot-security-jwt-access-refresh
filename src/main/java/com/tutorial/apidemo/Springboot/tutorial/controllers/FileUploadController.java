package com.tutorial.apidemo.Springboot.tutorial.controllers;

import com.tutorial.apidemo.Springboot.tutorial.models.ResponseObject;
import com.tutorial.apidemo.Springboot.tutorial.services.IStorageService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping(path = "/api/v1/FileUpload")
public class FileUploadController {
    //this controller receive file/image form client
    //Inject Storage Service here
    private final IStorageService storageService;

    public FileUploadController(IStorageService storageService) {
        this.storageService = storageService;
    }

    @PostMapping("")
    public ResponseEntity<ResponseObject> uploadFile(@RequestParam("file") MultipartFile file) {
        try {
            //save file to a folder => use a service
            String generatedFileName = storageService.storeFile(file);
            return ResponseEntity.status(HttpStatus.OK).body(
                    new ResponseObject("ok", "upload file successfully", generatedFileName)
            );
            //1445d14410aa4288951584a0d4a95b61.jpg => how to open this file in web browser?

        } catch (Exception exception) {
            return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(
                    new ResponseObject("ok", exception.getMessage(), "")
            );

        }
    }

    //get image's url
    @GetMapping("/files/{fileName:.+}")
    // /file/1445d14410aa4288951584a0d4a95b61.jpg
    public ResponseEntity<byte[]> readDetailFile(@PathVariable String fileName) {
        try {
            byte[] bytes = storageService.readFileContent(fileName);
            return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(bytes);
        } catch (Exception exception) {
            return ResponseEntity.noContent().build();
        }

    }

    //How to load all upload files ?
    @GetMapping("")
    public ResponseEntity<ResponseObject> getUpLoadFiles() {
        try {
            List<String> urls = storageService.loadAll().map(path -> {
                //convert fileName to url (send request "readDetailFile")
                return MvcUriComponentsBuilder.fromMethodName(FileUploadController.class, "readDetailFile",
                        path.getFileName().toString()).build().toUri().toString();
            }).collect(Collectors.toList());
            return ResponseEntity.ok(new ResponseObject("ok", "list files successfully", urls));
        } catch (Exception exception) {
            return ResponseEntity.ok(new ResponseObject("failed", "List files failed", new String[]{}));
        }

    }

}
