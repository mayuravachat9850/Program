package Home_Inheritance;

/*
 * TODO 1: Make this class abstract.
 */
abstract class Box {
    private int length;
    private int width;

    public Box(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}

