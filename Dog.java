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

    public void bark() {
        System.out.println(name + " says Woof!");
    }

}
