public class Student {
    //properties --> variables

    String firstName;
    String lastName;
    int age;
    int studentId;
    String schoolName;

    //Constructor
    Student(String fName,String lName,int a,int id,String school){
        firstName = fName;
        lastName = lName;
        age = a;
        studentId = id;
        schoolName = school;
    }

    // behaviour --> methods
    void study(){
        System.out.println(firstName + " " + lastName + " is studying at " + schoolName );
        System.out.println("Student Id is "+ studentId + " & age is " + age );
    }

    double calculateAvg(double math, double sci, double phy){
        return  (math+sci+phy)/3;
    }
}
