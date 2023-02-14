package CreationalDesignPattern.MazeGame.FactoryMethod;

import CreationalDesignPattern.MazeGame.Room;
public class RoomWithBomb extends Room{
    public RoomWithBomb(int n){
        super(n);
        // bomb logic
    }

    public void enter(){
        // bomb logic
    }
}
