class A {
    public void fun1(int a) {
        System.out.println("function belongs to Class a");
    }
}
class B extends A{
    public  void fun1(int a ,int b){
        System.out.println("function belongs to Class b");
    }
}

public class Tut16_FunctionOverloading {
    public static void main(String[] args) {
    B b1=new B();
    b1.fun1(4);
    b1.fun1(4,5);
    }



}
