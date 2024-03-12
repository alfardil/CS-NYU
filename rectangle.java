public class rectangle {

    int length;
    int width;

    public rectangle(int l, int w){
        length = l;
        width = w;
    }

    int length(){
        return length;
    }
    int width(){
        return width;
    }
    int computeArea(){
        return length * width;
    }

    public static void main(String[] args) {
        rectangle a = new rectangle(3, 2);
        System.out.println(a.length());
        System.out.println(a.width());
        System.out.println(a.computeArea());
    }
}
