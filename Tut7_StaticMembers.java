class Tut7_main {
    int x; //instance member variable;
    private static int y;//static member as a single value for whole class and doesn't depend on Objects

    public void main() {
//        static int z;// error instance function cannot create/access static members
//                     only static functions could access static variables

        /* creating static inner class*/

    }

    static int assignValue() {
        y = 3;
        return y;
    }

    static class Tut7_StaticInnnerClass {
        public static String country = "india";
    }

}

public class Tut7_StaticMembers {
    public static void main(String[] args) {
        int x; //instance member variable;
        System.out.println(Tut7_main.assignValue());
//        using static inner class
        System.out.println(Tut7_main.Tut7_StaticInnnerClass.country);
//
    }
}



