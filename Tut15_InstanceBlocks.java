public class Tut15_InstanceBlocks {
    private int x;
    private static int y;//static  member

    {/*
        instance initalization block runs before constructor
        if their are many initialization blocks then all the blocks are appended
        u can use this and super keyword
*/
        System.out.println("instance block value of int x=" + x);
        x = 12;

    }

    static {/*
    only runs once
    static initialization block could only access static members
    use of this and super keyword in not allowed
    when object is created this block executes
    */
        System.out.println("Static initialization block y = " + y);
        y = 34;
    }

    public Tut15_InstanceBlocks() {
        System.out.println("value of x is " + x );
    }

    public static void main(String[] args) {
        Tut15_InstanceBlocks t1 = new Tut15_InstanceBlocks();
        Tut15_InstanceBlocks t2 = new Tut15_InstanceBlocks();
        new Tut15_InstanceBlocks();//static code executes
        new Tut15_InstanceBlocks();//static code executes
        System.out.println(y);
    }
}
