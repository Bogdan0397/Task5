package bird;

/**
 * Created by koqfl on 07.05.2017.
 */
public class Penguin extends NonFlyingBirds{
    private double weight;

    public Penguin() {

    }

    public Penguin(String placeOfResidens, String feathers, int layEggs, double weight) {
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



    @Override
    public String toString() {
        return "Penguin [weight=" + weight + ", plaseOfResidens=" + placeOfResidens + ", feathers=" + feathers
                + ", layEggs=" + layEggs + "]";
    }
}
