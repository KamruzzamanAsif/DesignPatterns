package CreationalDesignPattern.MazeGame.AbstractFactory;

import CreationalDesignPattern.MazeGame.Door;
import CreationalDesignPattern.MazeGame.FactoryMethod.DoorNeedingSpell;
import CreationalDesignPattern.MazeGame.FactoryMethod.EnchantedRoom;
import CreationalDesignPattern.MazeGame.Room;

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
