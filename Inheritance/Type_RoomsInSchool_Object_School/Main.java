package Type_RoomsInSchool_Object_School;
public class Main {
    public static void main(String[] args) {
        RoomsInSchool obj =  new School();
        System.out.println(obj.wallColour);
        System.out.println(obj.seatCount);
        System.out.println(obj.bulbCount);
        obj.isDoorOpen();
        obj.isDoorClose();
        obj.hasAc();
        obj.canStudentsAllowedToEat();
      //  ((School) obj).hasPlayGround();
     // obj.hasPlayGround();
        /*object created for School with type of <RoomsInSchool> class which is parent for School, the datamembers of 
        RoomsInSchool class printed instead of datamembers of school. but incase of methods the methods over riden by school printed
        when called. and so the methods of school cannot be called, it is called only when the type of obj is converted to school.
         */
}
}
