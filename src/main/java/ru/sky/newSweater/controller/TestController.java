package ru.sky.newSweater.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.nio.file.Files;

@RestController
public class TestController {

    @Value("${upload.path}")
    private String path;

    @GetMapping("/userdir")
    public String getUserDir() {
        return String.format("%s%s%s", System.getProperty("user.dir"), File.separatorChar, path);
    }
    @GetMapping("/tets")
    public String testController() {
        return "Ok, it's working";
    }

    @GetMapping("/tets2")
    public String testController2() {
        return "Ok, it's working";
    }
}
