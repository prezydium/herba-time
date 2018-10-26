package org.prezydium.herbatime.controller;


import org.prezydium.herbatime.logic.GameEngine;
import org.prezydium.herbatime.logic.GenerateId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    @Autowired
    private GenerateId generateId;
    @Autowired
    private GameEngine gameEngine;


    @RequestMapping(path = "login", method = RequestMethod.GET )
    public RedirectView login(@RequestParam String nick) throws IllegalAccessException {
        if (nick == null || nick.isEmpty()) {
            throw new IllegalAccessException("nick can't be empty");
        } else {
            generateId.bestowID();

            return new RedirectView("game-view");
        }
    }
}
