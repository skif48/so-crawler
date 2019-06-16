package soCrawler.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @RequestMapping("/")
    public String helloWorld() {
        return "Hello World!";
    }
}
