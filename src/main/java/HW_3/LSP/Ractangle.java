package HW_3.LSP;

public class Ractangle extends RectangleForm{
    private int width;
    private int height;

    public Ractangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int area() {
        return this.width * this.height;
    }
}

