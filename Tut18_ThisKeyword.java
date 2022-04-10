class Tut18_Box{
    private  int length,breath,height;
    public void setDimension(int length,int breath,int height){
        this.length=length;
        this.breath=breath;
        this.height=height;
    }
    public void showDimension(){
        System.out.println(length);
        System.out.println(breath);
        System.out.println(height);
    }
    public void sendGift(){

    }
}
public class Tut18_ThisKeyword {
    public static void main(String[] args) {
        Tut18_Box b=new Tut18_Box();
        b.setDimension(12,15,4);
        b.showDimension();
    }
}
