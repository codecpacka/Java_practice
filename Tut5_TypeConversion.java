public class Tut5_TypeConversion {
    public static void main(String[] args) {
        System.out.println("type conversion ");
        System.out.println("windening coversion value of int x is windened into float value");
        int x = 4;
        float y = x;
        System.out.println(y);
        float r=4.5f;
//        int s=r;//narrowing conversion will throw erroe as your are         trying to convert float value into an int value;
        System.out.println("now type casting value of float (r) into an int");
        int s=(int)y;
        System.out.println("r = "+r);
        System.out.println("s = "+s);
    }
}
