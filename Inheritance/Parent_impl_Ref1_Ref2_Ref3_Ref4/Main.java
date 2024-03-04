package Parent_impl_Ref1_Ref2_Ref3_Ref4;
public class Main {
    public static void main(String[] args) {
        PrincipalRoom obj = new School();
        System.out.println(obj.wallColour);//Principal
        System.out.println(obj.seatCount);//Principal
        System.out.println(obj.bulbCount);//Principal
        obj.isDoorOpen(); //School
        obj.isDoorClose(); //School
        obj.hasPlayGround(); //School
        obj.canStudentsAllowedToEat(); //School (School extends RoomsInSchool)
        obj.hasAc();  //School (School extends RoomsInSchool which extends Principalroom)

    }
}

