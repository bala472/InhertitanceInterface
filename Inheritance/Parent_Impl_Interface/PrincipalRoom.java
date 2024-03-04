package Parent_Impl_Interface;

public class PrincipalRoom implements Ref2{

    String wallColour ="Yellow";
    int seatCount = 7;
    int bulbCount = 2;
    public  void isDoorOpen(){
        System.out.println("Principal room from 11:00 AM to 04:00 PM");
    }
    public  void isDoorClose(){
        System.out.println("Pricipal room is closed from 05:00 PM to 10:00 AM");
    }
    public  void hasAc(){
        System.out.println("Yes Principal room has AC");
    }
    public void hasPlayGround() {
        System.out.println("No Principal Room has no play ground");
        /*this method is declared because it implements Ref2 which has this method so this class need to declare this method*/
    }
}
