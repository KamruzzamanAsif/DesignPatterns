package CreationalDesignPattern.MazeGame.AbstractFactory;

import CreationalDesignPattern.MazeGame.FactoryMethod.BombedWall;
import CreationalDesignPattern.MazeGame.FactoryMethod.RoomWithBomb;
import CreationalDesignPattern.MazeGame.Room;
import CreationalDesignPattern.MazeGame.Wall;

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
