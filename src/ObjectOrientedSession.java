import org.w3c.dom.ls.LSOutput;

public class ObjectOrientedSession {


    public static void main(String args[]){
        int a =5;
        Student sam = new Student("Sam", "Curran", 23, 123456,"Pragra" );
        Student peter = new Student("Peter", "John", 24 , 345678 , "Pragra");
        Student nishtha = new Student("Nishtha", "Patel" , 25 ,679790, "Pragra");
        Student chintan = new Student("Chintan", "Ghevariya" , 23 , 456678, "Pragra");

//        sam.firstName = "Sam";
//        sam.lastName = "Patel";
//        sam.age=26;
//        sam.studentId = 123456;
//        sam.schoolName = "Pragra";


//        peter.firstName = "Peter";
//        peter.lastName = "John";
//        peter.age=24;
//        peter.studentId = 345678;
//        peter.schoolName = "Pragra";
//
//        nishtha.firstName = "Nishtha";
//        nishtha.lastName = "Patel";
//        nishtha.age=25;
//        nishtha.studentId = 123456;
//        nishtha.schoolName = "Pragra";
//
//        chintan.firstName = "Chintan";
//        chintan.lastName = "Ghevariya";
//        chintan.age=23;
//        chintan.studentId = 567875;
//        chintan.schoolName = "Pragra";


        sam.study();
        peter.study();
        nishtha.study();
        chintan.study();
        System.out.println(sam);
        System.out.println(sam.calculateAvg(34,56,78));


    }

}
