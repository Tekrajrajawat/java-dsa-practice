public class Day6Practice {
    public static void main(String[] args) {
        
        //Pattern 1: 5x5 Solid Sqaure
        System.out.println("Square Pattern:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        //Pattern 2: Triangle (1 to 5 stars per row)
        System.out.println("Triangle Pattern:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
