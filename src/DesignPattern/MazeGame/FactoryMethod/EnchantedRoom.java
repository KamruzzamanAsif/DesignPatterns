package DesignPattern.MazeGame.FactoryMethod;

import DesignPattern.MazeGame.Room;

public class EnchantedRoom extends Room {
    private String castSepll;
    public EnchantedRoom(int roomNumber, String castSepll) {
        super(roomNumber);
        this.castSepll = castSepll;
        // spell logic
    }
}
