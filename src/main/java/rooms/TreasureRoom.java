package rooms;

public class TreasureRoom extends Room {

    private int treasure;
    private Exit exit;

    public TreasureRoom(int treasure, Exit exit){
        this.treasure = treasure;
        this.exit = exit;
    }

    public int allowToCollectTreasure(){
        return this.treasure;
    }

    public Exit getExit(){
        return this.exit;
    }

}
