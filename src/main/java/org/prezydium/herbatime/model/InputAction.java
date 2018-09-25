package org.prezydium.herbatime.model;

public class InputAction {

    private int id;
    private Action action;

    public InputAction(int id, Action action) {
        this.id = id;
        this.action = action;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }
}
