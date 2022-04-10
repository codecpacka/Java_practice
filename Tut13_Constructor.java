import java.util.concurrent.BlockingDeque;

class Tut13_Box {
    private int l, b, h;

    public Tut13_Box() {// constructor of the Tut13_box
        l = 10;
        b = 13;
        h = 15;

    }
    public  Tut13_Box(int L,int B,int H){ // constructor overloading is done here as same constructor with different parameters
        l=L;
        b= B;
        h=H;
    }

    public static void main(String[] args) {
        Tut13_Box b1=new Tut13_Box();

    }
}

public class Tut13_Constructor {
}
