package rooms;

public class TreasureRoom extends Room {

    private int treasure;

    public TreasureRoom(int treasure ){
        this.treasure = treasure;
    }

    public int allowToCollectTreasure(){
        return this.treasure;
    }

}
