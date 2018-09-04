package org.prezydium.herbatime.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class GameController {


    @RequestMapping(path = "game-controller", method = RequestMethod.POST)
    public ModelAndView log2(HttpServletRequest httpServletRequest){
        System.out.println("entering game view post");

        return new ModelAndView( "game.html");
    }

    @RequestMapping(path = "game-controller", method = RequestMethod.GET)
    public ModelAndView login(HttpServletRequest httpServletRequest){
        System.out.println("entering game view get");

        return new ModelAndView("game.html");
    }
}
