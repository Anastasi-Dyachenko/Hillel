package Lesson5;

public abstract class ChessItem {
    int x,y;
    int value;
    public int getValue(){
        return this.value;

    }
    public abstract void draw();

}
