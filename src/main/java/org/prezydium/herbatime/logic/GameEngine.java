package org.prezydium.herbatime.logic;

import org.prezydium.herbatime.model.GameState;
import org.prezydium.herbatime.model.InputAction;
import org.prezydium.herbatime.model.Player;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameEngine {

    private final static Logger log = LoggerFactory.getLogger(GameEngine.class);

    private final GameState gameState;

    @Autowired
    public GameEngine(GameState gameState) {
        this.gameState = gameState;
    }


    public GameState processAction(InputAction inputAction) {
        PlayerMover.movePlayer(gameState.getPlayers().get(inputAction.getId()), inputAction.getKeyCode());
        return gameState;
    }

    public void addNewPlayer(int id, String nick){
        Player newPlayer = new Player(0, 0, nick, "test");
        gameState.getPlayers().put(id, newPlayer);
    }
}
