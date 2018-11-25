package org.prezydium.herbatime.logic;

import org.prezydium.herbatime.model.Player;

public class PlayerMover {

    public static void movePlayer(Player player, int action) {
        int x = player.getPosX();
        int y = player.getPosY();

        switch (action) {
            case 68:
                player.setPosX(x + 5);
                break;
            case 65:
                player.setPosX(x - 5);
                break;
            case 87:
                player.setPosY(y - 5);
                break;
            case 83:
                player.setPosY(y + 5);
                break;
        }
    }
}
