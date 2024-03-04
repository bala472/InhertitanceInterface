package Interface;
public class Main {
    public static void main(String[] args) {
        School obj = new School();
        System.out.println(obj.wallColour);
        System.out.println(obj.seatCount);
        System.out.println(obj.bulbCount);
        obj.isDoorOpen();
        obj.isDoorClose();
        obj.hasPlayGround();//method only declared in school 
        obj.canStudentsAllowedToEat();//method only declared in RoomsInSchool
        obj.hasAc(); //Method only declared in Principal room

    }
}
/*School class implements Ref1 Interface so it need to override the methods declared in Ref1 but it extends the
 class RoomsInSchool which contains some methods need to override, so it need not compulsory to overide on School class 
  */

