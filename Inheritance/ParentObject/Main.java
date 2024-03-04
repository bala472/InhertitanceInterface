package ParentObject;

public class Main {
    public static void main(String[] args) {
        PrincipalRoom obj = new PrincipalRoom();
        System.out.println(obj.wallColour);
        System.out.println(obj.seatCount);
        System.out.println(obj.bulbCount);
        obj.isDoorOpen();
        obj.isDoorClose();
        obj.hasAc();
        /*object created for <PrincipalRoom> class which is parent for RoomsInSchool and School class but methods and 
         data members of child classes cannot be accessed by parents
         */
}
}
