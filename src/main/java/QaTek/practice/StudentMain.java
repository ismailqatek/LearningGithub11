package QaTek.practice;

public class StudentMain {

    public static void main(String[] args){

        Student student1 = new Student();
        Student student2 = new Student();

        System.out.println("Student1 marks = " + student1.marks);
        System.out.println("Student2 marks = " + student2.marks);

        System.out.println();

        student2.marks = 80;
        System.out.println("Student1 marks = " + student1.marks);
        System.out.println("Student2 marks = " + student2.marks);

        System.out.println();
        System.out.println("Student1 age = " + student1.age);
        System.out.println("Student2 age = " + student2.age);

        Student.age = 27;
        System.out.println();
        System.out.println("Student1 age = " + student1.age);
        System.out.println("Student2 age = " + student2.age);
    }
}
