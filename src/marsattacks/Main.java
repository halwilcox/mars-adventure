package marsattacks;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("The game is about to start.....Get Ready!!!!");
        System.out.println("What is your name adventurer?");

        Scanner scanner = new Scanner(System.in);
        System.out.println("(type in your name)");

        String name = scanner.nextLine();
        System.out.println(name + ", I am glad you joined the adventure! Yesterday you " +
                "received a call from your good friend at NASA. They need someone to go to " +
                "Mars this weekend, and you have been chosen!");


        System.out.println("Are you Excited? Answer with Y or N");
        Scanner in = new Scanner(System.in);
        String excited = in.nextLine();

        if (excited.equals("Y")){
            System.out.println("Let's do this!!");
        } else if (excited.equals("N")){
            System.out.println("Too bad, your attendance is required..");
        }

        }
    }

