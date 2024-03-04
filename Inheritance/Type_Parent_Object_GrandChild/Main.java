package Type_Parent_Object_GrandChild;

public class Main {
    public static void main(String[] args) {
        PrincipalRoom obj =  new School();
        System.out.println(obj.wallColour);//datamembers of PrincipalRoom printed
        System.out.println(obj.seatCount); //datamembers of PrincipalRoom printed
        System.out.println(obj.bulbCount); //datamembers of PrincipalRoom printed
        obj.isDoorOpen(); //isDoorOpen method on school class is printed
        obj.isDoorClose(); //isDoorClose method on school class is printed
        obj.hasAc(); //this method only available in PricipleRoom class and it is printed
        /*the methods of School class is not able to declared because the object type is PrincipalRoom (parent) has space
        only able to declare its own method and attributes*/ 
       
}
}

