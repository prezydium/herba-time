package org.prezydium.herbatime.controller;


import org.prezydium.herbatime.model.InputAction;
import org.prezydium.herbatime.model.OutputAction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;


@Controller
public class WebSocketController {

    private Logger logger = LoggerFactory.getLogger(WebSocketController.class);


    @MessageMapping("/chatsoc")
    @SendTo("/topic/messages")
    public OutputAction send(InputAction inputAction) throws Exception {


        return new OutputAction();
    }
}
