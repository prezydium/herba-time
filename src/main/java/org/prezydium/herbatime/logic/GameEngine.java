package org.prezydium.herbatime.logic;

import org.prezydium.herbatime.model.GameState;
import org.prezydium.herbatime.model.InputAction;
import org.springframework.beans.factory.annotation.Autowired;

public class GameEngine {

    @Autowired
    private GameState gameState;

    public GameState processAction(InputAction inputAction){
        return null;


    }



}
