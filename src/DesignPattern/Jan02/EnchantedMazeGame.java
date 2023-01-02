package DesignPattern.Jan02;

public abstract class EnchantedMazeGame extends MazeGame{
    public EnchantedMazeGame(){

    }

    public Room makeRoom(int n){
        return new EnchantRoom(n, CastSpell());
    }

    public Door makeDoor(Room r1, Room r2){
        return new DoorNeedingSpell(r1, r2);
    }

    protected abstract Spell CastSpell();
}
