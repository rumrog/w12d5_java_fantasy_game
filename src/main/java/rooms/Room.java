package rooms;

public abstract class Room {

    protected Boolean isExitBloqued;

    public Room(){
        this.isExitBloqued = true;
    }

    public Boolean checkExit(){
        return this.isExitBloqued;
    }

    public void unbloqueExit(){
        this.isExitBloqued = true;
    }

}
