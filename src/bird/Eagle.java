package bird;

/**
 * Created by koqfl on 07.05.2017.
 */
public class Eagle extends FlyingBirds {
    private double weight;

    public Eagle() {

    }

    public Eagle(String placeOfResidens, String feathers, int layEggs, double weight) {
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
        return "can fly";
    }


    @Override
    public String toString() {
        return "Eagle [weight=" + weight + ", plaseOfResidens=" + placeOfResidens + ", feathers=" + feathers
                + ", layEggs=" + layEggs + "]";
    }
}
