public class Day14Practice {
    public static void main(String[] args) {
        
        Day14Student student = new Day14Student();

        student.setName("Tekraj");
        student.setAge(19);

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());

        student.setAge(-5);
    }
}

class Day14Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName (String n) {
        name = n;
    }
    
    public int getAge() {
        return age;

    }

    public void setAge(int a) {
        if (a < 0) {
            System.out.println("Error: Age cannot be negative");            
        } else {
            age = a;
        }
    }

}
