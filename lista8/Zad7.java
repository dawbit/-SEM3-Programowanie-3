/*
Dawid Bitner IA
 */

package zad7;

class Punkt2D{
    protected double x, y;
    
    public Punkt2D(){
        System.out.println("Konstruktor domyślny klasy bazowej");
    }
    public Punkt2D(double x, double y){
        this.x = x;
        this.y = y;
        System.out.println("Konstruktor parametryczny klasy bazowej");
    }
}

class Punkt3D extends Punkt2D{
    protected double z;
    public Punkt3D(){
        System.out.println("Konstruktor domyślny klasy dziedziczącej");
    }
    public Punkt3D(double z){
        this.z = z;
        System.out.println("Konstruktor klasy dziedziczącej z jednym parametrem");
    }
    public Punkt3D(double x, double y, double z){
        super.x = x;
        super.y = y;
        this.z = z;
        System.out.println("Konstruktor klasy dziedziczącej z trzema parametrami");
    }
}


class Punkt3DKolor extends Punkt3D{
    int R, G, B;
    
    public Punkt3DKolor(){}
    public Punkt3DKolor(double x, double y, double z, int R, int G, int B){
        super.x = x;
        super.y = y;
        super.z = z;
        try{
            if((R<0 || R>255) || (G<0 || G>255) || (B<0 || B>255)) throw new Exception("Wartości poza przedziałem 0-255");
            this.R = R;
            this.G = G;
            this.B = B;
        } catch (Exception e){
            //System.out.println("Wartości poza przedziałem 0-255");
            System.out.println(e.getMessage());
        }
        
    }
}
public class Zad7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Punkt3DKolor punkt = new Punkt3DKolor(1,2,3,-4,5,6);
    }
    
}
