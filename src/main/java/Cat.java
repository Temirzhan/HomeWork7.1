

import java.util.Objects;

/**
 * Project java_core_android
 *
 * @Author Alexander Grigorev
 * Created 22.01.2021
 * v1.0
 */
public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;
    private int health;
    private int damage;
    private final int WELLFED =5;

    public Cat(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.satiety = false;
    }

    public void takeHit(Cat another) {
        this.health -= another.getDamage();
        if (this.health > 0) System.out.println("Got a hit. Health is now " + health);
        if (this.health <= 0) {
            System.out.println(name + "dead");
            throw new RuntimeException("This cat is dead!!!");
        }
    }

    public void kick(Cat another) {
        System.out.println(this.name + " hits " + another.name);
        another.takeHit(this);
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        if(IsSatiety(plate.getFood())){
            if( plate.decreaseFood(appetite))
                System.out.println("Cat ate for " + appetite);
            satiety = true;
        }
        else System.out.println("Cat is angry and hungry");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    private boolean IsSatiety(int food){
        if(food >= WELLFED){
            return true;
        }else{
            return false;
        }
    }

    public void getSatiety(){
        if(satiety == true)
            System.out.println(name + " is Well-Fed");
        else System.out.println(name + " is hungry ");
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    //lesson
}
