package org.prezydium.herbatime.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    @RequestMapping(path = "login", method = RequestMethod.POST)
    public RedirectView login(HttpServletRequest httpServletRequest) throws IllegalAccessException {
        String nick = (String) httpServletRequest.getParameter("nick");
        if (nick == null || nick.isEmpty()) {
            throw new IllegalAccessException("nick can't be empty");
        } else {
            return new RedirectView("game-controller");
        }
    }
}
