public class Point{
    double x,y;
    Point (double a, double b){
        int n;
        x=a;
        y=b;
    }
    Point () {
        x=0;
        y=0;
    }
    void deplacer (double dx, double dy ){
        x+=dx;
        y+=dy;
    }
}
public class EX0_diapo_22{
     public static void main(String[] argv){
        int b;
         System.out.println("\n utitialison un point p1");
         Point p1 = new Point();
         p1.deplacer(4,5);
         System.out.println("\n affichons les nouvelle coordonnées de notre point ");
         System.out.println("\n p1 a pour coordonées x="+p1.x+" et y="+p1.y);
     }
}
