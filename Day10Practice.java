public class Day10Practice {
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder();
        
        sb.append("Virat");
        sb.append(" ");
        sb.append("Kohli");
        
        System.out.println("After appending: " + sb);

        sb.insert(0, "Start: ");
        System.out.println("After inserting: " + sb);
        
        sb.reverse();
        System.out.println("After reversing: " + sb);
        
    }
}
