public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Max", 3, "Golden Retriever", "Golden", 25.5, "Ball", true);
        
        // selection method
        if (myDog.getAge() < 5) {
            System.out.println(myDog.getName() + " is a young dog!");
        }
        
        // looping method
        for (int i = 0; i < 3; i++) {
            myDog.bark();
        }
        
        // attribute manipulation
        // Change attribute using setter
        myDog.setName("Charlie");
        System.out.println("New name: " + myDog.getName());
    }
}