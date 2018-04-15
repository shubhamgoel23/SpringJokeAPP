package com.example.joke.controllers;

import com.example.joke.services.JokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private JokesService jokesService;

    @Autowired
    public JokeController(JokesService jokesService){
        this.jokesService = jokesService;
    }

    @RequestMapping({"/",""}) // tp map the context root
    public String showJoke(Model model){
        model.addAttribute("joke", jokesService.getJoke());

        return "chucknorris";
    }
}
