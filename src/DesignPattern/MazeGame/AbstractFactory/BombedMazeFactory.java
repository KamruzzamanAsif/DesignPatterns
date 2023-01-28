package DesignPattern.MazeGame.AbstractFactory;

import DesignPattern.MazeGame.FactoryMethod.BombedWall;
import DesignPattern.MazeGame.FactoryMethod.RoomWithBomb;
import DesignPattern.MazeGame.Room;
import DesignPattern.MazeGame.Wall;

public class BombedMazeFactory extends MazeFactory{
    public BombedMazeFactory(){

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
