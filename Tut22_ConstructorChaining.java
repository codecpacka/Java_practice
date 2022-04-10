//purpose : constructor chaining means when one class's constructor call its other consturctor
//note : contructor could only have super() which is default or this(args [optional]) user could write this for constructor chaining.
class Tut22_Parent {
    Tut22_Parent() {
        System.out.println("A 1");
    }
}

class Tut22_Child extends Tut22_Parent {
    Tut22_Child() {
//     super() // this is called implicitly by compiler
        this(3); // {calling another overloaded constructor}here this  keyword is used for changing  control flow of the programme
        System.out.println("B 1");
    }

    //note:now doing constructor overloading
    Tut22_Child(int a) {
        System.out.println("B 2");
    }
}

public class Tut22_ConstructorChaining {
    public static void main(String[] args) {
        Tut22_Child child = new Tut22_Child();
    }

}
