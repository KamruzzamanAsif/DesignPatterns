package DesignPattern.MazeGame.FactoryMethod;

import DesignPattern.MazeGame.Door;
import DesignPattern.MazeGame.Room;

public class EnchantedMazeGame extends MazeGame{
    public EnchantedMazeGame(){

    }

    @Override
    public Room makeRoom(int n){
        return new EnchantedRoom(n, castSpell());
    }
    @Override
    public Door makDoor(Room r1, Room r2) {
        return new DoorNeedingSpell(r1, r2);
    }


    private String castSpell(){
        return "enchantedSpell";  // just take a string for now
    }
}
