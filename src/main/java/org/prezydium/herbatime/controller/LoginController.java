package org.prezydium.herbatime.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;


@Controller
public class LoginController {

    private static Logger log = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping(path = "login", method = RequestMethod.GET)
    public RedirectView login(@RequestParam String nick,
                              @RequestParam Integer playerId,
                              RedirectAttributes redirectAttributes) {
        if (nick == null || nick.isEmpty() || playerId == null) {
            return new RedirectView("/");
        } else {
            System.out.println(nick + " " + playerId);
            log.info("Player logged. nick: " + nick + " id: " + playerId);
            redirectAttributes.addAttribute("nick", nick);
            redirectAttributes.addAttribute("playerId", playerId);
            return new RedirectView("game-view");
        }
    }
}
