package CreationalDesignPattern.MazeGame.FactoryMethod;

import CreationalDesignPattern.MazeGame.Room;
import CreationalDesignPattern.MazeGame.Wall;

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
