package CreationalDesignPattern.MazeGame.FactoryMethod;

import CreationalDesignPattern.MazeGame.Room;

public class EnchantedRoom extends Room {
    private String castSepll;
    public EnchantedRoom(int roomNumber, String castSepll) {
        super(roomNumber);
        this.castSepll = castSepll;
        // spell logic
    }
}
