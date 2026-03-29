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
     * Method 1: Returns the dog's bark based on hunger status
     */
    public String bark() {
        String[] barkResponses = {
            name + " barks happily: woof woof!",
            name + " barks loudly: WOOF WOOF WOOF! (I'm hungry!)"
        };
        return barkResponses[isHungry ? 1 : 0];
    }

    /**
     * Method 2: Returns the dog's eating behavior and updates hunger status
     */
    public String eat() {
        String[] eatResponses = {
            name + " is not hungry right now. " + name + " walks away from the food.",
            name + " is eating happily!\nNom nom nom... " + name + " finished the meal!"
        };
        String result = eatResponses[isHungry ? 1 : 0];
        this.isHungry = false;
        return result;
    }

    /**
     * Method 3: Calculates dog's age in human years
     */
    public double calculateHumanAge() {
        int firstTwoYears = Math.min(age, 2);
        int remainingYears = Math.max(0, age - 2);
        double humanYears = (firstTwoYears * 10.5) + (remainingYears * 4);
        return humanYears;
    }

    /**
     * Method 4: Displays all dog information
     */
    public String displayInfo() {
        String hungryStatus = isHungry ? "Yes 🍽️" : "No 😊";
        return "═══════════════════════════════════\n" +
               "🐕 DOG PROFILE\n" +
               "═══════════════════════════════════\n" +
               "Name         : " + name + "\n" +
               "Age          : " + age + " years\n" +
               "Human Years  : " + calculateHumanAge() + " years\n" +
               "Breed        : " + breed + "\n" +
               "Color        : " + color + "\n" +
               "Weight       : " + weight + " kg\n" +
               "Favorite Toy : " + favoriteToy + "\n" +
               "Hungry Status: " + hungryStatus + "\n" +
               "═══════════════════════════════════";
    }

    /**
     * Method 5: Returns the dog's playing behavior based on hunger status
     */
    public String play() {
        String[] playResponses = {
            name + " happily plays with the " + favoriteToy + "!\n" + 
            name + " runs around, fetches the " + favoriteToy + ", and wags tail excitedly!",
            name + " is too hungry to play! " + name + " wants food first!"
        };
        return playResponses[isHungry ? 1 : 0];
    }
}
