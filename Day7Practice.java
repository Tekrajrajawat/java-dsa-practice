public class Day7Practice {
    public static void main(String[] args) {
        //Pattern 1: Inverted Triangle (5 shrinking to 1)
        System.out.println("Inverted Triangle:");
        for(int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        //Pattern 2: Hollow Square (5x5, stars only on border)
        System.out.println("Hollow Square:");
        for(int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 5 || j == 1 || j == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
