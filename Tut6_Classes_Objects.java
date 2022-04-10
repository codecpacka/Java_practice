class  Tut6_Box{
    // length,breath,heigth are called properties of class
    short length;
    short breath;
    short height;

    // setdimension and showdimendsion are called member funtion of class
    public void setDimesion(short l,short b,short h){ //setDimesion is a setter function
        length=l;
        breath=b;
        height=h;
    }
    public void showDimesion(){ //showDimesion is a getter function
    System.out.println("length = "+ length);
    System.out.println("breath = "+ breath);
    System.out.println("Height = "+ height);
    }

}



public class Tut6_Classes_Objects {
    public static void main(String[] args) {
     Tut6_Box b; //this line only creates an reference variable b which is currently                   // refering to nothing
      b=new Tut6_Box(); //now the refernce variable b is refering to an object of Tut6_box and is now given memory for the block
        b.setDimesion((short) 2, (short) 3, (short) 5);
        b.showDimesion();
        System.out.println("now again making b refernce variable point to empty object which makes the previous object an garbage block/object which will be later collected/removed by garbage collector");
        b=new Tut6_Box();
        b.showDimesion();

    }
}
