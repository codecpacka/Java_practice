//purpose: Constructor are not inherited by subclass but are called before the child class constructor by compiler using super(); but the problem is u cannot pass perameters in default constructor so u need to explicitley call the super(args).
/*
notes:



*/
class Tut21_Parent{
     int a;
    Tut21_Parent(int x){ //note: this constructor is not inherited but called automatically by constructor
        System.out.println("parent class constructor");
        a=x;
    }
}
class Tut21_Child extends  Tut21_Parent{
    int b;
    Tut21_Child(){
        super(6);
//        super() this is implicitly calling parent class constructor
        System.out.println("child class constructor");
        System.out.println(super.a);
    }
}


public class Tut21_ConstructorInheritance {

    public static void main(String[] args) {
        Tut21_Child child=new Tut21_Child();
    }
}
