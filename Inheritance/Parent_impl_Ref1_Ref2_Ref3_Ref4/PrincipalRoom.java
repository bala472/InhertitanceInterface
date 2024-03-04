package Parent_impl_Ref1_Ref2_Ref3_Ref4;
public class PrincipalRoom implements Ref1,Ref2,Ref3,Ref4{

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
    public void canStudentsAllowedToEat() {
        System.out.println("No, student not permitted on pricipal room");//declared because Ref1,Ref3 has this method
    }
    public void hasPlayGround() {
        System.out.println("No, principal room has no playground ");//declared because Ref1,Ref2,Ref3
    }
}

