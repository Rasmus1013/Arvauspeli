import java.util.Scanner;

public class Arvauspeli {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String secret = "Justin";
        String guess = "";

        System.out.println("Guess my name!");

        while (true) {
            System.out.print("Your guess: ");
            guess = in.nextLine();

            if (guess.equalsIgnoreCase(secret)) {
                System.out.println("Correct! Great job.");
                break;
            } else {
                System.out.println("Wrong, try again!");
            }
        }
    }
}
