import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Create a Dog object using parameterized constructor
        Dog dog = new Dog("Goldie", 3, "Golden Retriever", "Golden", 30.5, "Frisbee", true);

        System.out.println("Welcome to the Dog Simulator!");
        System.out.println("You are now interacting with " + dog.getName() + " 🐶");

        int choice;
        do {
            System.out.println("\nChoose an action:");
            System.out.println("1. Bark");
            System.out.println("2. Eat");
            System.out.println("3. Play");
            System.out.println("4. Dog in Human Age");
            System.out.println("5. Display Info");
            System.out.println("6. Change Dog Attributes");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = scan.nextInt();
            scan.nextLine(); // consume newline

            switch(choice) {
                case 1:
                    System.out.println(dog.bark());
                    break;
                case 2:
                    System.out.println(dog.eat());
                    break;
                case 3:
                    System.out.println(dog.play());
                    break;
                case 4:
                    System.out.println(dog.calculateHumanAge());
                    break;
                case 5:
                    System.out.println(dog.displayInfo());
                    break;
                case 6:
                    System.out.println("Which attribute do you want to change?");
                    System.out.println("a) Name\nb) Age\nc) Breed\nd) Color\ne) Weight\nf) Favorite Toy\ng) Hunger Status");
                    String attr = scan.nextLine();

                    switch(attr.toLowerCase()) {
                        case "a":
                            System.out.print("Enter new name: ");
                            dog.setName(scan.nextLine());
                            break;
                        case "b":
                            System.out.print("Enter new age: ");
                            dog.setAge(scan.nextInt());
                            scan.nextLine();
                            break;
                        case "c":
                            System.out.print("Enter new breed: ");
                            dog.setBreed(scan.nextLine());
                            break;
                        case "d":
                            System.out.print("Enter new color: ");
                            dog.setColor(scan.nextLine());
                            break;
                        case "e":
                            System.out.print("Enter new weight: ");
                            dog.setWeight(scan.nextDouble());
                            scan.nextLine();
                            break;
                        case "f":
                            System.out.print("Enter new favorite toy: ");
                            dog.setFavoriteToy(scan.nextLine());
                            break;
                        case "g":
                            System.out.print("Is the dog hungry? (true/false): ");
                            dog.setHungry(scan.nextBoolean());
                            scan.nextLine();
                            break;
                        default:
                            System.out.println("Invalid choice!");
                    }
                    break;
                case 0:
                    System.out.println("Goodbye! 🐾");
                    break;
                default:
                    System.out.println("Invalid option, try again!");
            }

        } while(choice != 0);

        scan.close();
    }
}