import java.awt.Color;
import java.awt.Image;




public class Animal {
    // Attributes
    private int score;
    private int size;
    private Color color;
    private Image image;
    private int armor;
    private int attack;
    private int speed;

    // Constructor
    public Animal(int size, Color color, Image image, int armor, int attack, int speed) {
        this.score = 0;
        this.size = size;
        this.color = color;
        this.image = image;
        this.armor = armor;
        this.attack = attack;
        this.speed = speed;
    }

    // Getters and Setters
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Method to display animal details
    public void displayDetails() {
        System.out.println("Animal Details:");
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
        System.out.println("Armor: " + armor);
        System.out.println("Attack: " + attack);
        System.out.println("Speed: " + speed);
        System.out.println("Score: " + score);
    }
}