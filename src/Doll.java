import java.util.ArrayList;

// Classe de base
abstract class Doll {
    private int Size;
    private boolean open;

    public int getSize() {
        return Size;
    }

    public void setSize(int size) {
        Size = size;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }
    public Doll(int size) {
        this.Size = size;
        this.open = false;
    }

    public abstract void Open();

    public abstract void Close();

    public abstract void putIn(Doll d);

    public abstract void pullOut(Doll d);
}