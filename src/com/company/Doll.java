package com.company;

public abstract class Doll {
    private final int size;
    private boolean isOpen;

    public Doll(int size){
        this.size = size;
        this.isOpen = false;

    }

    public int getSize(){
        return size;
    }
    public int setSize(){
        return size;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public boolean getOpen() {
        return false;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public abstract void Open();

    public abstract void Close();

    public abstract void placeIn(Doll d);

    public abstract void takeOf(Doll d);

}