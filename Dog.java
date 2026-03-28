public class Dog {
    private String name;
    private int age;
    private String breed;
    private String color;
    private double weight;
    private String favoriteToy;
    private boolean isHungry;

    // Default constructor (no info)
    public Dog() {
        name = "Unknown";
        age = 0;
        breed = "Unknown";
        color = "Unknown";
        weight = 0.0;
        favoriteToy = "Unknown";
        isHungry = false;
    }

    // Parameterized constructor (with info)
    public Dog(String name, int age, String breed, String color, double weight, String favoriteToy, boolean isHungry) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.color = color;
        this.weight = weight;
        this.favoriteToy = favoriteToy;
        this.isHungry = isHungry;
    }

    // Getters and Setters for each attribute
    public String getName() { 
        return name; 
    }
    public void setName(String name) { 
        this.name = name; 
    }

    public int getAge() { 
        return age; 
    }
    public void setAge(int age) { 
        this.age = age; 
    }

    public String getBreed() { 
        return breed; 
    }
    public void setBreed(String breed) { 
        this.breed = breed; 
    }

    public String getColor() { 
        return color; 
    }
    public void setColor(String color) { 
        this.color = color; 
    }

    public double getWeight() { 
        return weight; 
    }
    public void setWeight(double weight) { 
        this.weight = weight; 
    }

    public String getFavoriteToy() { 
        return favoriteToy; 
    }
    public void setFavoriteToy(String favoriteToy) { 
        this.favoriteToy = favoriteToy; 
    }

    public boolean isHungry() { 
        return isHungry; 
    }
    public void setHungry(boolean isHungry) { 
        this.isHungry = isHungry; 
    }
    
    /**
     * Method 1: Makes the dog bark
     * Shows different bark sounds based on how hungry the dog is
    */
    public void bark() {
        if (isHungry) {
            System.out.println(name + " barks loudly: WOOF WOOF WOOF! (I'm hungry!)");
        } else {
            System.out.println(name + " barks happily: woof woof!");
        }
    }
    
    /**
     * Method 2: Feeds the dog
     * If hungry, dog eats and becomes full
     * If not hungry, dog refuses to eat
    */
    public void eat() {
        if (isHungry) {
            System.out.println(name + " is eating happily!");
            System.out.println("Nom nom nom... " + name + " finished the meal!");
            isHungry = false;
        } else {
            System.out.println(name + " is not hungry right now. " + name + " walks away from the food.");
        }
    }
    
    /**
     * Method 3: Calculates dog's age in human years
     * First 2 years = 10.5 human years each, then 4 human years per dog year
     * @return dog's age in human years
    */
    public double calculateHumanAge() {
        double humanYears;
        
        if (age <= 2) {
            humanYears = age * 10.5;
        } else {
            humanYears = (2 * 10.5) + ((age - 2) * 4);
        }
        
        return humanYears;
    }
    
    /**
     * Method 4: Displays all dog information in a nice format
     * Shows all attributes in an organized way
    */
    public void displayInfo() {
        System.out.println("═══════════════════════════════════");
        System.out.println("🐕 DOG PROFILE");
        System.out.println("═══════════════════════════════════");
        System.out.println("Name         : " + name);
        System.out.println("Age          : " + age + " years");
        System.out.println("Human Years  : " + calculateHumanAge() + " years");
        System.out.println("Breed        : " + breed);
        System.out.println("Color        : " + color);
        System.out.println("Weight       : " + weight + " kg");
        System.out.println("Favorite Toy : " + favoriteToy);
        System.out.println("Hungry Status: " + (isHungry ? "Yes 🍽️" : "No 😊"));
        System.out.println("═══════════════════════════════════");
    }
    
    /**
     * Method 5: Makes the dog play with its favorite toy
     * Shows different reactions based on hunger status
    */
    public void play() {
        if (isHungry) {
            System.out.println(name + " is too hungry to play! " + name + " wants food first!");
        } else {
            System.out.println(name + " happily plays with the " + favoriteToy + "!");
            System.out.println(name + " runs around, fetches the " + favoriteToy + ", and wags tail excitedly!");
        }
    }
}