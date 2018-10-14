package org.prezydium.herbatime.logic;

import org.prezydium.herbatime.model.GameState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class GenerateId {

    private final GameState gameState;

    @Autowired
    public GenerateId(GameState gameState) {
        this.gameState = gameState;
    }

    public Integer bestowID() {
        List<Integer> listOfId = new ArrayList<>(gameState.getPlayers().keySet());
        if (listOfId.isEmpty()) return 0;
        Collections.sort(listOfId);
        return listOfId.get(listOfId.size() - 1) + 1;
    }
}
