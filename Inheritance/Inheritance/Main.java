package Inheritance;

public class Main {
    public static void main(String[] args) {
        School obj = new School();
        System.out.println(obj.wallColour);
        System.out.println(obj.seatCount);
        System.out.println(obj.bulbCount);
        obj.isDoorOpen();
        obj.isDoorClose();
        obj.hasPlayGround();
        obj.canStudentsAllowedToEat();
        obj.hasAc();
        /*object created for <School> class which contains property and methods of <RoomsInSchool><PrincipalRoom>
           the method  canStudentsAllowedToEat() and hasAc() just extended by school class but not over rided
           but when calling the method it gives the value of methods as declared in the particular classes*/

    }
}
