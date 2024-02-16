package com.company;

public class russianDoll extends Doll {
    private russianDoll internDoll;


    public russianDoll(int size) {
        super(size);
        this.internDoll = null;
    }

    @Override
    public void Open() {
        if (!isOpen()) {
            System.out.println("Open Doll Size" + getSize());
            setOpen(true);
        } else {
            System.out.println("The Doll is already open");
        }
    }

    @Override
    public void Close() {
        if(isOpen()){
            System.out.println("Close doll Size"+ getSize());
            setOpen(false);
        }else {
            System.out.println("The doll is already closed");
        }
    }

    @Override
    public void placeIn(Doll d) {

    }

    @Override
    public void takeOf(Doll d) {

    }

}