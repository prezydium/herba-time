package org.prezydium.herbatime.model;

public class InputAction {

    private int id;
    private int keyCode;

    public InputAction() {
    }

    public InputAction(int id, int keyCode) {
        this.id = id;
        this.keyCode = keyCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKeyCode() {
        return keyCode;
    }

    public void setKeyCode(int keyCode) {
        this.keyCode = keyCode;
    }
}
