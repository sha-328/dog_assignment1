import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Dog myDog = new Dog("Goldie", 3, "Golden Retriever", "Golden", 25.5, "Ball", true);

        // Display initial info
        System.out.println(myDog.displayInfo());

        // Selection structure (if)
        if (myDog.isHungry()) {
            System.out.println(myDog.getName() + " is hungry. Let's feed him!");
        } else {
            System.out.println(myDog.getName() + " is not hungry right now.");
        }

        // Selection structure (switch)
        System.out.println("\nChoose an action: ");
        System.out.println("1 - Bark");
        System.out.println("2 - Eat");
        System.out.println("3 - Play");
        System.out.println("4 - Show Info");
        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                System.out.println(myDog.bark());
                break;
            case 2:
                System.out.println(myDog.eat());
                break;
            case 3:
                System.out.println(myDog.play());
                break;
            case 4:
                System.out.println(myDog.displayInfo());
                break;
            default:
                System.out.println("Invalid choice.");
        }

        
        // Looping structure (for)
        System.out.println("\nDog's age progression in months:");
        for (int i = 1; i <= myDog.getAge(); i++) {
            System.out.println("Year " + i + " = " + (i * 12) + " months");
        }

        // Looping structure (while)
        System.out.println("\nSimulating hunger cycle...");
        int hours = 0;
        while (!myDog.isHungry() && hours < 5) {
            System.out.println("Hour " + hours + ": " + myDog.getName() + " is full.");
            hours++;
            if (hours == 5) {
                myDog.setHungry(true);
                System.out.println(myDog.getName() + " is hungry again!");
            }
        }
    }
}