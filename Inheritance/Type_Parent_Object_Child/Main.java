package Type_Parent_Object_Child;

public class Main {
    public static void main(String[] args) {
        PrincipalRoom obj = new RoomsInSchool();
        System.out.println(obj.wallColour); //Datamembers of parent(Principal room) printed
        System.out.println(obj.seatCount); //Datamembers of parent(Principal room) printed
        System.out.println(obj.bulbCount); //Datamembers of parent(Principal room) printed
        obj.isDoorOpen(); //methods of child is printed
        obj.isDoorClose(); //methods of child is printed
        obj.hasAc(); //it is the method of parent and it is printed as expected
       /*  obj.canStudentsAllowedToEat(); method in child when declared generated error and the error removed only changed the
        type of obj.*/
}
}
