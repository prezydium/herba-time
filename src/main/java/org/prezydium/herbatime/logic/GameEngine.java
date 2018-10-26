package org.prezydium.herbatime.logic;

import org.prezydium.herbatime.model.GameState;
import org.prezydium.herbatime.model.InputAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameEngine {

    private final GameState gameState;

    @Autowired
    public GameEngine(GameState gameState) {
        this.gameState = gameState;
    }

    public GameState processAction(InputAction inputAction) {
        PlayerMover.movePlayeer(gameState.getPlayers().get(inputAction.getId()), inputAction.getAction());
        return gameState;
    }
}
