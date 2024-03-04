package Interface;

public class School extends RoomsInSchool implements Ref1 {
    String wallColour ="Rose";
    int seatCount = 620;
    int bulbCount = 70;
    public  void isDoorOpen(){
        System.out.println("School gate is opened from 06:00 AM to 08:00 PM");
    }
    public  void isDoorClose(){
        System.out.println("School gate is closed from 08:30 PM to 06:00 AM");
    }
    public  void hasPlayGround(){
        System.out.println("Yes the school has play ground");
        }
}
