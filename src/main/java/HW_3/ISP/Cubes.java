package HW_3.ISP;

public class Cubes implements Share{
    private int edge;

    public Cubes(int edge) {
        this.edge = edge;
    }

    @Override
    public double area() {
        return 6 * edge * edge;
    }
}
