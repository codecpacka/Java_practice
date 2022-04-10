class Tut19_A{
      int x;
    void  fun1(){
        System.out.println("belongs to class A");
    }
}
class Tut19_B extends Tut19_A{
    private int x;
    void fun1(){
        System.out.println("belongs to class B");
        super.fun1();

    }
    void  fun2(){
        int  x;
        this.x=3;
        super.x=8;
    }
}

public class Tut19_super {
    public static void main(String[] args) {


        Tut19_B b = new Tut19_B();
        b.fun1();
    }
    }
