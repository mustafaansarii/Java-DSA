

public class classess {
    public static void main(String[] args) {
        Student s1= new Student();
        Student s2= new Student(34);
        Student s3= new Student("mustafa");
    // System.out.println(s1.name);
}
}

class Student{
    String name;
    int roll;

    // Student(String name,int roll) {
    //     this.name=name;
    // }
    Student() {
    }
    Student(int name1) {
    }
    Student(String name) {
        this.name=name;
    }

    
    
}
