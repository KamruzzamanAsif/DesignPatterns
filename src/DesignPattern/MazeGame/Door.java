package DesignPattern.MazeGame;

public class Door extends MapSite{
    private Room r1, r2;
    private boolean isOpen;
    public Door(Room r1, Room r2){
        this.r1 = r1;
        this.r2 = r2;
    }

    public Room otherSideFrom(Room r){
        return r1 == r ? r2: r1;
    }

    public void enter(){

    }
}
