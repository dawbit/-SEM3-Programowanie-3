package Klasy;

public class Punkt2D extends Punkt
{
    double y;
    Punkt2D() {
        this.x = 0.0;
        this.y = 0.0;
    }
    Punkt2D(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    Punkt2D(double[] var)
    {
        this.x = var[0];
        this.y = var[1];
    }

    public void show()
    {
        System.out.printf("\nPoint3D: x=%.2f | x=%.2f \n", x,y);
    }
}
