package Type_Parent_Object_GrandChild;

public class RoomsInSchool extends PrincipalRoom {
    String wallColour ="White";
    int seatCount = 60;
     int bulbCount = 4;
     public  void isDoorOpen(){
         System.out.println("Class room opened from 08:00 AM to 06:00 PM");
     }
     public void isDoorClose(){
         System.out.println("Class room is closed from 06:30 PM to 07:00 AM");
     }
     public void canStudentsAllowedToEat(){
         System.out.println("Yes, Students allowed to eat in classrooms only on lunch time");
     }
 
 }
 
