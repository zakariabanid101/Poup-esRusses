class RussianDoll extends Doll {
    private Doll isIn;

    public RussianDoll(int Size) {
        super(Size);
        this.isIn = null;
    }

    @Override
    public void putIn(Doll d) {
        if (isIn == null && !d.isOpen()) {
            isIn = d;
            System.out.println("The doll size = " + getSize() + " is now inside the doll size =" + d.getSize() + ".");
        } else {
            System.out.println("Error!");
        }
    }

    @Override
    public void pullOut(Doll d) {
        if (isIn == d && d.isOpen()) {
            isIn = null;
            System.out.println("The doll size = " + getSize() + "is pulled from the Doll size" + d.getSize() + ".");
        } else {
            System.out.println("Error!");
        }
    }
}