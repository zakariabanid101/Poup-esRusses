import java.util.ArrayList;

// Classe de base
abstract class Doll {
    private int Size;
    private boolean open;

    public Doll(int size) {
        this.Size = size;
        this.open = false;
    }

    public int getSize() {
        return Size;
    }

    public boolean isOpen() {
        return open;
    }

    public void Open() {
        open = true;
        System.out.println("The Doll size =" + Size + "is opened");
    }

    public void Close() {
        open = false;
        System.out.println("The Doll size = " + Size + "is closed");
    }

    public abstract void putIn(Doll d);

    public abstract void pullOut(Doll d);
}