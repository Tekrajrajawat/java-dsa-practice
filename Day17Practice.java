import java.util.ArrayList;

public class Day17Practice {
    public static void main(String[] args) {
        
        ArrayList<String> names = new ArrayList<>();
        names.add("Aman");
        names.add("Priya");
        names.add("Raj");
        names.add("Sneha");
        
        System.out.println("Full list: " + names);
        
        names.remove("Priya");
        System.out.println("After removing Priya: " + names);
        
        System.out.println("Size: " + names.size());
        
        System.out.println("Looping through the list:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        
        System.out.println("Contains Raj? " + names.contains("Raj"));
        
    }
}
