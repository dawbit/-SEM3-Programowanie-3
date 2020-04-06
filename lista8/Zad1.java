/*
Dawid Bitner IA
 */ 

class Algorytm{
    private double x,y;
    public Algorytm(){}
    public Algorytm(double x, double y){
        this.x=x;
        this.y=y;
    };
    void swap(Algorytm z){
        double tmp;
        tmp = z.x;
        z.x=z.y;
        z.y=tmp;
    }
    
    void show(){
        System.out.println("Pierwsza liczba: "+x);
        System.out.println("Druga liczba: "+y);
    }
}
public class Zad1 {

    public static void main(String[] args) {
        Algorytm o = new Algorytm(14.10, 13.37);
        o.show();
        o.swap(o);
        System.out.println("Po zamianie wartości: ");
        o.show();
        
    }
    
}
