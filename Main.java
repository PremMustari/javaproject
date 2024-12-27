class Student{
    String name;
    int age;
    char grade;
}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        student1.name = "Prem";
        student1.age = 20;
        student1.grade = 'A';
        student2.name = "Prem";
        student2.age = 20;
        student2.grade = 'A';
        System.out.println("Name :"+student1.name+"\nAge :"+student1.age+"\nGrade :"+student1.grade);
        System.out.println("Name :"+student2.name+"\nAge :"+student2.age+"\nGrade :"+student2.grade);
    }
}
