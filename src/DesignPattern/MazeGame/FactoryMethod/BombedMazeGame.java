package DesignPattern.MazeGame.FactoryMethod;

import DesignPattern.MazeGame.Room;
import DesignPattern.MazeGame.Wall;

public class BombedMazeGame extends MazeGame{
    public BombedMazeGame(){

    }

    @Override
    public Wall makeWall(){
        return new BombedWall();
    }

    @Override
    public Room makeRoom(int n){
        return new RoomWithBomb(n);
    }
}
