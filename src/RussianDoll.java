class RussianDoll extends Doll {
    private Doll isIn;

    public RussianDoll(int Size) {
        super(Size);
        this.isIn = null;
    }

    @Override
    public void Open() {
        if (!this.isOpen()) {
            this.setOpen(true);
            System.out.println("The Doll size =" + getSize() + "is opened");
        }else System.out.println("is already open!");
    }
    @Override
    public void Close() {
        if (this.isOpen()) {
            this.setOpen(false);
            System.out.println("The Doll size  " +getSize() + "is closed");
        }else System.out.println("is already close!");
    }
    @Override
    public void putIn(Doll d) {
        //System.out.println("this" + d.getSize());
        if (isIn == null && d.isOpen()) {
            this.isIn = d;
            System.out.println("The doll size  " +getSize() + " is now inside the doll size " + d.getSize() + ".");
        } else {
            System.out.println("You must open the target doll first!");
        }
    }

    @Override
    public void pullOut(Doll d) {
        //System.out.println("this" + isIn.getSize());
        if (isIn == this && d.isOpen()) {
            this.isIn = null;
            System.out.println("The doll size = " +getSize() + " is toked off from the doll size " + d.getSize() + ".");
        } else {
            System.out.println("You must open the doll first!");
        }
    }
}