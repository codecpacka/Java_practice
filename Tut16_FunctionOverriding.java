class Tut_16A {
    public void fun1(int a) {
        System.out.println("this is a function of class A");
    }
}

class Tut_16B extends Tut_16A {
    public void fun1(int a) {
        System.out.println("this is a function of class B");
    }
}

public class Tut16_FunctionOverriding {
    public static void main(String[] args) {
        Tut_16B b = new Tut_16B();
        b.fun1(6); //we can only call the function of b class
//        example:gear shifting in car and sports car is different that is why
//                  we override shifting gear functionality after inheritance
    }
}
