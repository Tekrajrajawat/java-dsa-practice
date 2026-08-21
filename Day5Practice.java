public class Day5Practice {
    static int add(int a, int b) {
        return a + b;
    }

    static void checkEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + "is odd");
        }
    }

    public static void main(String[] args) {

        int result = add (5, 10);
        System.out.println("Sum: " + result);

        checkEvenOdd(7);
        checkEvenOdd(12);        
    }
}
