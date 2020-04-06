/*
Dawid Bitner IA
 */
package zad6;

class Punkt2D {
    protected double x, y;
    public Punkt2D() {
        x=0.0;
        y=0.0;
    };
    public Punkt2D(double x, double y) {
        this.x=x;
        this.y=y;
    };
}

class Punkt3D extends Punkt2D {
    protected double z;
}

//Z WYKORZYSTANIEM SUPER
class Punkt2Dsuper {
    protected double x, y;
}

class Punkt3Dsuper extends Punkt2Dsuper{
    protected double z;
    
    public Punkt3Dsuper(double x, double y, double z)
    {
        super.x = x;
        super.y = y;
        this.z = z;
    }
    
    void drukuj ()
    {
        System.out.println("Z klasy bazowej: "+super.x);
        System.out.println("Z klasy bazowej: "+super.y);
        System.out.println("Z podklasy: "+z);
    }
}

public class Zad6 {

    public static void main(String[] args) {
        System.out.println("PARAMETROWY:");
        Punkt2D punkt2d = new Punkt2D(2.3, -1.2);
        System.out.println("x: "+punkt2d.x+", y: "+punkt2d.y);
        
        Punkt3D punkt3d = new Punkt3D();
        System.out.println("x: "+punkt3d.x+", y: "+punkt3d.y+", z: "+punkt3d.z);
        
        punkt3d.x = 5.32;
        punkt3d.y = 4.89;
        punkt3d.z = 1.52;
        System.out.println("x: "+punkt3d.x+", y: "+punkt3d.y+", z: "+punkt3d.z);
        
        System.out.println("\nBEZPARAMETROWY:");
        Punkt2D punkt2db = new Punkt2D();
        System.out.println("x: "+punkt2db.x+", y: "+punkt2db.y);
        
        Punkt3D punkt3db = new Punkt3D();
        System.out.println("x: "+punkt3db.x+", y: "+punkt3db.y+", z: "+punkt3db.z);
        
        System.out.println("\nSuper - PARAMETROWY:");
        
        Punkt3Dsuper punkt3ds = new Punkt3Dsuper(3.6, 0.6, 0.1);
        System.out.println("x: "+punkt3ds.x+", y: "+punkt3ds.y+", z: "+punkt3ds.z);
        punkt3ds.drukuj();
        
    }
    
}
