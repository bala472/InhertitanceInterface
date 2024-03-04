package RoomsInSchool_impl_Inteface;

public class Main {
    public static void main(String[] args) {
        School obj = new School();
        System.out.println(obj.wallColour);
        System.out.println(obj.seatCount);
        System.out.println(obj.bulbCount);
        obj.isDoorOpen();
        obj.isDoorClose();
        obj.hasPlayGround();/*This is the method only available for School class but RoomsInSchool not contains this method
                               but implements Ref1 interface which has this method, so it is compulsory to RoomsInSchool class
                               to override this method*/
        obj.canStudentsAllowedToEat();
        obj.hasAc(); 

    }

}
/*The output is printed all methods and attribute related to SChool class because the object type same as object created for. */



