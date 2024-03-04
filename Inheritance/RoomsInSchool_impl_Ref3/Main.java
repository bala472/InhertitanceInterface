package RoomsInSchool_impl_Ref3;

public class Main {
    public static void main(String[] args) {
        RoomsInSchool obj = new School();
        System.out.println(obj.wallColour);//RoomsInSchool
        System.out.println(obj.seatCount); //RoomsInSchool
        System.out.println(obj.bulbCount);//RoomsInSchool
        obj.isDoorOpen();//school
        obj.isDoorClose();//school
        obj.hasPlayGround();//this method is only for school class but ref3 interface has this method which was implemented by RoomsInschool so, it need to be declared on RoomsInschool
        obj.canStudentsAllowedToEat();//RoomsInschool
        obj.hasAc(); //parent

    }

}
