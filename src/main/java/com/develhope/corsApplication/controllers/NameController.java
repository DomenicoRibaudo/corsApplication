package com.develhope.corsApplication.controllers;

import com.develhope.corsApplication.services.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {
    @Autowired
    private NameService nameService;

    @GetMapping("/return")
    public ResponseEntity<String> getName(){
        return ResponseEntity.ok().body("Ciao");
    }

    @PostMapping("/reverse")
    public ResponseEntity<StringBuilder> reverseName(@RequestParam String name){
        return ResponseEntity.ok().body(nameService.reverseName(name));
    }

}
