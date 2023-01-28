package DesignPattern.MazeGame.FactoryMethod;

import DesignPattern.MazeGame.Door;
import DesignPattern.MazeGame.Room;

public class DoorNeedingSpell extends Door {

    public DoorNeedingSpell(Room r1, Room r2) {
        super(r1, r2);
        // spell logic
    }

    @Override
    public void enter() {
        // spell logic
    }
}
