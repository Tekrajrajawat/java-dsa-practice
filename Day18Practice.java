import java.util.HashMap;

public class Day18Practice {
    public static void main(String[] args) {
        
        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("Rahul", 85);
        marks.put("Priya", 92);
        marks.put("Aman", 78);
        
        System.out.println("Full map: " + marks);
        
        System.out.println("Rahul's marks: " + marks.get("Rahul"));
        
        marks.remove("Priya");
        System.out.println("After removing Priya: " + marks);
        
        System.out.println("Looping through the map:");
        for (String key : marks.keySet()) {
            System.out.println(key + ": " + marks.get(key));
        }
        
        System.out.println("Contains Aman? " + marks.containsKey("Aman"));
        
    }
}
