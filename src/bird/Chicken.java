package bird;

/**
 * Created by koqfl on 07.05.2017.
 */
public class Chicken extends NonFlyingBirds {
    private double weight;

    public Chicken() {

    }

    public Chicken(String placeOfResidens, String feathers, int layEggs, double weight) {
        super(placeOfResidens, feathers, layEggs);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String fly() {
        return "I can't fly.";
    }

    public String feature() {
        return "I am poultry!!!";
    }

    @Override
    public String toString() {
        return "Chicken [weight=" + weight + ", placeOfResidens=" + placeOfResidens + ", feathers=" + feathers
                + ", layEggs=" + layEggs + "]";
    }
}

