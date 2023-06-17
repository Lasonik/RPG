import java.util.Scanner;
import java.util.*;

public class Player {
    Scanner scanner = new Scanner(System.in);
    private int freePoints = 20;
    protected String name;
    private int str = 5;
    private int agl = 5;
    private int vit = 5;
    private int hp = 50;
    private int maxHp;
    private int level = 1;
    private int exp = 0;
    private int expForLevel = 100;
    private double expMultiplier = 1.3;
    private int gold;


    public Player() {
        System.out.println("Name your character: ");
        this.name = scanner.next();
        while (freePoints != 0 && freePoints > 0) {
            System.out.println("Please spend your points!");
            System.out.println("You have : " + freePoints + " left");
            System.out.println("Your stats: " + "\n" + "Strength: " + str + "\n" + "Agility: " + agl + "\n" + "Vitality: " + vit);
            System.out.println("Choose what stat to increase" + "\n" +
                    "1)Strength 2)Agility 3)Vitality");
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("How much to spend?");
                int temp = 0;
                int amount = scanner.nextInt();
                if (amount <= freePoints) {
                    str = str + amount;
                    freePoints = freePoints - amount;
                } else {
                    System.out.println("Not enough points");
                }
            } else if (choice == 2) {
                System.out.println("How much to spend?");
                int amount = scanner.nextInt();
                if (amount <= freePoints) {
                    agl = agl + amount;
                    freePoints = freePoints - amount;
                } else {
                    System.out.println("Not enough points");
                }
            } else if (choice == 3) {
                System.out.println("How much to spend?");
                int amount = scanner.nextInt();
                if (amount <= freePoints) {
                    vit = vit + amount;
                    freePoints = freePoints - amount;
                } else {
                    System.out.println("Not enough points");
                }
            } else {
                System.out.println("Wrong number try again");
            }
        }
        System.out.println(String.format("Спасти наш мир от драконов вызвался %s! Да будет его броня крепка и бицепс кругл!", Player.getName()));
    }

    static String getName() {
        return name;
    }

    protected int maxHp(int vit, int hp) {
        return (vit * 5) - vit + hp;
    }

    private int getRandomValue() {
        return (int) (Math.random() * (str * 2) + agl);
    }

    protected int attack() {
        return getRandomValue();
    }

    public int getXp() {
        return exp;
    }

    public int getGold() {
        return gold;
    }

    public int getHealthPoints() {
        return hp;
    }

    public void setHealthPoints(int defenderHealth) {
        this.hp = defenderHealth;
    }
}
