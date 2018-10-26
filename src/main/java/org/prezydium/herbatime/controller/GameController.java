package org.prezydium.herbatime.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GameController {

    @GetMapping("game-view")
    public ModelAndView loadGame(){
        ModelAndView modelAndView =  new ModelAndView("game");
        return modelAndView;
    }

}
