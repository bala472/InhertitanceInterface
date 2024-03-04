package Parent_Impl_Interface;
public class Main {
    public static void main(String[] args) {
        School obj = new School();
        System.out.println(obj.wallColour);
        System.out.println(obj.seatCount);
        System.out.println(obj.bulbCount);
        obj.isDoorOpen();
        obj.isDoorClose();
        obj.hasPlayGround(); /*this method is declared in Principalroom (parent class) because it implements Ref2 which has this method so this class need to declare this method */
        obj.canStudentsAllowedToEat();
        obj.hasAc();
       
    }
}
