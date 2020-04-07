package Klasy;

public class Punkt3DColor extends Punkt3D {
    int R,G,B;
    public Punkt3DColor()
    {
        super();
        this.R = 0;
        this.G = 0;
        this.B = 0;
    }
    public Punkt3DColor(int R,int G, int B)
    {
        super();
        if(R>=0 && G>=0 && B>=0  &&  R<=255 && G<=255 && B<=255) {
            this.R = R;
            this.G = G;
            this.B = B;
        }else
        {
            System.out.println("Błędne kody R G B");
            this.R = 0;
            this.G = 0;
            this.B = 0;
        }
    }
    public Punkt3DColor(double x, double y, double z, int R, int G, int B)
    {
        super(x,y,z);
        if(R>=0 && G>=0 && B>=0  &&  R<=255 && G<=255 && B<=255) {
            this.R = R;
            this.G = G;
            this.B = B;
        }else
        {
            System.out.println("Błędne kody R G B");
            this.R = 0;
            this.G = 0;
            this.B = 0;
        }
    }
    public Punkt3DColor(double[] var)
    {
        super(var);
        if(R>=0 && G>=0 && B>=0  &&  R<=255 && G<=255 && B<=255) {
            this.R = (int)var[3];
            this.G = (int)var[4];
            this.B = (int)var[5];
        }else
        {
            System.out.println("Błędne kody R G B");
            this.R = 0;
            this.G = 0;
            this.B = 0;
        }
    }
    @Override
    public void show()
    {
        System.out.printf("\nPoint3D: x=%.2f | x=%.2f | x=%.2f", x,y,z);
        System.out.printf("\nColors:  R=%d  | G=%d  | B=%d\n",R,G,B);
    }
}
