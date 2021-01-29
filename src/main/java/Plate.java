

/**
 * Project java_core_android
 *
 * @Author Alexander Grigorev
 * Created 22.01.2021
 * v1.0
 */
public class Plate {
    private int food;


    public void putFood(int amount) {
        this.food += amount;
        System.out.println("Food filled, now there's " + food);
    }

    public boolean decreaseFood(int amount) {
        if(food>=amount){
            this.food -= amount;
            System.out.println("Food decreased, now there's " + food);
            return true;
        }else{
            System.out.println("The plate is empty");
        }
        return false;
    }

    public int getFood() {
        return food;
    }
    //plate
}
