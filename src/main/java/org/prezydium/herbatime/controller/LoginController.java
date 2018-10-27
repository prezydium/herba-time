package org.prezydium.herbatime.controller;


import org.prezydium.herbatime.logic.GameEngine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;


@Controller
public class LoginController {

    private static Logger log = LoggerFactory.getLogger(LoginController.class);

    private final GameEngine gameEngine;

    @Autowired
    public LoginController(GameEngine gameEngine) {
        this.gameEngine = gameEngine;
    }

    @RequestMapping(path = "login", method = RequestMethod.GET)
    public RedirectView login(@RequestParam String nick,
                              @RequestParam Integer playerId,
                              RedirectAttributes redirectAttributes) {
        if (nick == null || nick.isEmpty() || playerId == null) {
            log.info("Missing login or id: " + nick + " " + playerId);
            return new RedirectView("/");
        } else {
            log.info("Player logged. id: " + playerId + " nick: " + nick);
            gameEngine.addNewPlayer(playerId, nick);
            redirectAttributes.addAttribute("nick", nick);
            redirectAttributes.addAttribute("playerId", playerId);
            return new RedirectView("game-view");
        }
    }
}
