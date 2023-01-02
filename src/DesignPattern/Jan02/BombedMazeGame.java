package DesignPattern.Jan02;

public class BombedMazeGame extends MazeGame{
    public BombedMazeGame(){

    }

    public Wall makeWall(){
        return new BombedWall();
    }

    public Room makeRoom(int n){
        return new RoomWithBomb(n);
    }
}
