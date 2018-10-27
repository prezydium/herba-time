package org.prezydium.herbatime.logic;

import org.prezydium.herbatime.model.Player;

public class PlayerMover {

    public static void movePlayer(Player player, int action) {
        int x = player.getPosX();
        int y = player.getPosY();

        switch (action) {
            case 87:
                player.setPosX(x + 5);
                break;
            case 83:
                player.setPosX(x - 5);
                break;
            case 65:
                player.setPosY(y - 5);
                break;
            case 68:
                player.setPosY(y + 5);
                break;
        }
    }
}
