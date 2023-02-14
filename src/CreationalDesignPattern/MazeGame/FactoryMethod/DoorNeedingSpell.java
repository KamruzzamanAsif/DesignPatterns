package CreationalDesignPattern.MazeGame.FactoryMethod;

import CreationalDesignPattern.MazeGame.Door;
import CreationalDesignPattern.MazeGame.Room;

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
