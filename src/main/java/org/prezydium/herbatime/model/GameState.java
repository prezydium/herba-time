package org.prezydium.herbatime.model;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class GameState {

    private Map<Integer, Player> players;

    public GameState() {
        this.players = new HashMap<>();
    }

    public Map<Integer, Player> getPlayers() {
        return players;
    }

    public void setPlayers(Map<Integer, Player> players) {
        this.players = players;
    }
}
