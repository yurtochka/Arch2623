package HW_3.LSP;

public class Square extends RectangleForm{
    private int width;
    private int height;
    public Square(int width, int height){
        this.height = height;
        this.width = width;
    }

    @Override
    public int area(){
        return width * height;
    }
}
