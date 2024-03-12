import java.lang.Math;

public class circle {
    int radius;

    public circle(int r){
        radius = r;
    }

    double computeArea(){
        return radius * radius * Math.PI;
    }



    public static void main(String args[]) {
        circle a = new circle(3);
        System.out.println(a.computeArea());
    }
}
