package tola.springframework.jokeapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import tola.springframework.jokeapp.services.JokeService;

/**
 * Created by Adetola on 18/06/2019
 */
@Controller
public class JokeController {

    private JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }
    @RequestMapping({"/", ""})
    public String displayJoke(Model model) {

        model.addAttribute("joke", jokeService.getJoke());

        return "chucknorris";
    }
}
