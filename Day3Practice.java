public class Day3Practice {
    public static void main(String [] args) {
        
        //For loop - print numbers from 1 to 10
        System.out.println(" Numbers 1 to 10");
        for (int i = 1; i < 10; i++ ){
            System.out.println(i);
        }

        //while loop - print even numbers from 1 to 20
        System.out.println("  Even Number from 1 to 20");
        int num = 1;
        while (num <= 20) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
            num = num + 1;            
        }
    }
}
