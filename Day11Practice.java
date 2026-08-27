public class Day11Practice {
    public static void main(String[] args) {
        
        Student student1 = new Student();
        student1.name = "Kuku";
        student1.age = 18;

        Student student2 = new Student();
        student2.name = "Tekraj";
        student2.age =  19;

        System.out.println("Student 1: " + student1.name + ", Age: " + student1.age);
        System.out.println("Student 2: " + student2.name + ", Age: " + student2.age);
    }
}

class Student {
    String name;
    int age;
}
