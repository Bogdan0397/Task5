package bird;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by koqfl on 07.05.2017.
 */
public abstract class Bird {
    public String feathers;
    public int layEggs;
    public Bird() {
    }
    public Bird(String feathers, int layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }
    public String getFeathers() {
        return feathers;
    }

    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }

    public int getLayEggs() {
        return layEggs;
    }

    public void setLayEggs(int layEggs) {
        this.layEggs = layEggs;
    }

    public abstract String fly();

    public static void main(String[] args) {
        Bird bird1 = new Eagle("Asia", "dark brown", 3, (double) 3.5);
        Bird bird2 = new Swallow("Europe", "dark blue", 5, (double) 0.2);
        Bird bird3 = new Penguin("Antarctica", "white and black", 1, (double) 35);
        Bird bird4 = new Chicken("Europe", "yellow", 0, (double) 2.5);

        List<Bird> list = new ArrayList<>();
        list.add(bird1);
        list.add(bird2);
        list.add(bird3);
        list.add(bird4);

        for (Bird in : list) {
            System.out.println(in);
            System.out.println(in.fly());
            }

    }


}
