class Student{
    String name;
    static String schoolname;
}
public class Static{
    public static void main(String args[]){
        // No need to create object for declare the school name
        Student.schoolname = "JMV";
        Student s1 = new Student();
        System.out.println(s1.schoolname);
    }
}