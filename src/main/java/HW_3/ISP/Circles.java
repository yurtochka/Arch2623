package HW_3.ISP;

public class Circles implements Share{
    private double radius;

    public Circles(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }
}

