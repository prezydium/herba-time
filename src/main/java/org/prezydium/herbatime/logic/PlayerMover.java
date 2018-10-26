package org.prezydium.herbatime.logic;

import org.prezydium.herbatime.model.Action;
import org.prezydium.herbatime.model.Player;

public class PlayerMover {

    public static void movePlayeer(Player player, Action action) {
        int x = player.getPosX();
        int y = player.getPosY();

        switch (action) {
            case UP:
                player.setPosX(x + 5);
                break;
            case DOWN:
                player.setPosX(x - 5);
                break;
            case LEFT:
                player.setPosY(y - 5);
                break;
            case RIGHT:
                player.setPosY(y + 5);
                break;
        }
    }
}
