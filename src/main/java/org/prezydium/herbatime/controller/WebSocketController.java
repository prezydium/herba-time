package org.prezydium.herbatime.controller;


import org.prezydium.herbatime.logic.GameEngine;
import org.prezydium.herbatime.model.GameState;
import org.prezydium.herbatime.model.InputAction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;


@Controller
public class WebSocketController {

    private final static Logger log = LoggerFactory.getLogger(WebSocketController.class);

    private final GameEngine gameState;

    @Autowired
    public WebSocketController(GameEngine gameState) {
        this.gameState = gameState;
    }


    @MessageMapping("/input")
    @SendTo("/topic/game-state")
    public GameState send(InputAction inputAction) throws Exception {
        log.info(inputAction.getKeyCode() + "  " + inputAction.getId());
        return gameState.processAction(inputAction);
    }
}
