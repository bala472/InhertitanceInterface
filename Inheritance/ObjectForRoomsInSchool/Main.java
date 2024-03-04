package ObjectForRoomsInSchool;

public class Main {
    public static void main(String[] args) {
        RoomsInSchool obj = new RoomsInSchool();
        System.out.println(obj.wallColour);
        System.out.println(obj.seatCount);
        System.out.println(obj.bulbCount);
        obj.isDoorOpen();
        obj.isDoorClose();
        obj.canStudentsAllowedToEat();
        obj.hasAc();
        /*object created for <RoomsInSchool> class which contains property and methods of <PrincipalRoom>
           the method   hasAc() just extended by RoomsInSchool class but not over rided
           but when calling the method it gives the value of methods as declared in the particular classes*/

    }
}
