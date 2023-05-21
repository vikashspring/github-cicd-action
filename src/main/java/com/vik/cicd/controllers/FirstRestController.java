package com.vik.cicd.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {

    @GetMapping("/welcome")
    public String welcome(){

        return "Welcome to first controller";
    }

   /* git init
    git add README.md
    git commit -m "first commit"
    git branch -M main
    git remote add origin https://github.com/vikashspring/github-cicd-action.git
    git push -u origin main*/
}
