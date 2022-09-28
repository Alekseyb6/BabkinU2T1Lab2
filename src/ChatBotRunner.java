import java.util.Scanner;
public class ChatBotRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ChatBot kevin = new ChatBot("Kevin", 7);

        System.out.print("What is your name: "); // greetings
        String name = scan.nextLine();
        kevin.greeting(name);

        System.out.println(); // random fact
        System.out.println("Hey, did you know that a 10-feet wall is about: " + kevin.convertFeetToMeters(10) + " meters!");

        System.out.println();
        System.out.println("Would you like to know about the weather!"); //weather info
        kevin.weather();

        System.out.println();
        System.out.print("What is your favorite number?"); // favorite number comparison
        int favNum = scan.nextInt();
        kevin.favoriteNumber(favNum);

        System.out.println(); // random math fact
        System.out.println("Did you know that 123 + 456 + 654321 = " + kevin.addNumbers(123, 456, 654321));

        System.out.println();
        System.out.println(kevin.goodbye()); // farewell
    }
}
