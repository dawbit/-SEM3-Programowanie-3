package Klasy;

public class Punkt3D extends Punkt2D {
    double z;
    public Punkt3D(double x, double y, double z){
        super(x,y);
        this.z = z;
    }
    public Punkt3D(double[] var){
        super(var);
        this.z = var[2];
    }
    public Punkt3D(){
        super();
        this.z = 0;
    }
    @Override
    public void show()
    {
        System.out.printf("\nPoint3D: x=%.2f | x=%.2f | x=%.2f\n", x,y,z);
    }
}
