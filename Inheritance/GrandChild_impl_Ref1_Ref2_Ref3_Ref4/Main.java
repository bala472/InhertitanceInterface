package GrandChild_impl_Ref1_Ref2_Ref3_Ref4;

public class Main {
    public static void main(String[] args) {
        School obj = new School();
        System.out.println(obj.wallColour);//school
        System.out.println(obj.seatCount);//school
        System.out.println(obj.bulbCount);//school
        obj.isDoorOpen();//school
        obj.isDoorClose();//school
        obj.hasPlayGround();//school
        obj.canStudentsAllowedToEat();//school(School extends RoomsInSchool)
        obj.hasAc();//school(School extends RoomsInSchool extends PrincipalRoom)

    }
}
 /*School class all methods of Ref1,Ref2,Ref3,Ref4 */
