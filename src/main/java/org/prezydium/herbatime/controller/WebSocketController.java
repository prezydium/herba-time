package org.prezydium.herbatime.controller;


import org.prezydium.herbatime.model.GameState;
import org.prezydium.herbatime.model.InputAction;
import org.prezydium.herbatime.model.Player;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;


@Controller
public class WebSocketController {

    private Logger logger = LoggerFactory.getLogger(WebSocketController.class);

    private final GameState gameState;

    @Autowired
    public WebSocketController(GameState gameState) {
        this.gameState = gameState;
    }


    @MessageMapping("/input")
    @SendTo("/topic/game-state")
    public GameState send(InputAction inputAction) throws Exception {
        Player player = gameState.getPlayers().get(inputAction.getId());


        return new GameState();
    }
}
