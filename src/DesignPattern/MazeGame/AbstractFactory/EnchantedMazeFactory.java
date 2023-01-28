package DesignPattern.MazeGame.AbstractFactory;

import DesignPattern.MazeGame.Door;
import DesignPattern.MazeGame.FactoryMethod.DoorNeedingSpell;
import DesignPattern.MazeGame.FactoryMethod.EnchantedRoom;
import DesignPattern.MazeGame.Room;

public class EnchantedMazeFactory extends MazeFactory{
    public EnchantedMazeFactory(){

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
