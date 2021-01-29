public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate();

        plate.putFood(15);

        Cat[] cat = {
                new Cat("Red",5),
                new Cat("Blue",5),
                new Cat("Yelow",5),
                new Cat("Green",5)
        };

        for(int i=0; i< cat.length;i++){
            cat[i].eat(plate);
        }

        for(int i=0; i< cat.length;i++){
            cat[i].getSatiety();
        }
    }
    ///main
}
