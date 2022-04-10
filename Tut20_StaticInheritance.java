//main purpose: function hiding
//note :static member functions are inherited
//        :static variables are not inherited


class Tut20_Parent {
    static int y=4;
    public static void f1() {
        System.out.println("static function of parent class which is going to be inherited");
    }
}
class Tut20_Child extends  Tut20_Parent{
    static {
        y=5;
    }
//    note: the below function has same signature of parent function so its doing function hiding
    public static void f1(){
        System.out.println("static function of child class function hiding");
    }
}


public class Tut20_StaticInheritance {
    public static void main(String[] args) {
//        Tut20_Child child=new Tut20_Child();
//        child.f1();
        System.out.println("y="+Tut20_Child.y); //y=4 because compiler will automatically change child name to parent name but value of y will change if we create any object of child class because then the static initialization block will run
    }
}
