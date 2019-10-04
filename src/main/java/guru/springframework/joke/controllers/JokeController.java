package guru.springframework.joke.controllers;

import guru.springframework.joke.services.JokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * Created by arunabhamidipati on 04/10/2019
 */
@Controller
public class JokeController {
    private JokesService jokesService;

    @Autowired
    public JokeController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping({"", "/"} )
    public String showJoke(Model model){

        model.addAttribute("joke", jokesService.getJoke());
        return ("chucknorris");
    }
}
