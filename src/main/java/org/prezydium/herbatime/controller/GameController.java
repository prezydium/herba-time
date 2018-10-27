package org.prezydium.herbatime.controller;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GameController {

    @GetMapping("game-view")
    public ModelAndView loadGame(@NonNull String nick, @NonNull Integer playerId){
        System.out.println(nick);
        ModelAndView modelAndView =  new ModelAndView("game");
        modelAndView.addObject("playerNick", nick);
        modelAndView.addObject("playerId", playerId);
        return modelAndView;
    }

}
