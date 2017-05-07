package bird;

/**
 * Created by koqfl on 07.05.2017.
 */
public class NonFlyingBirds extends Bird {
    protected String placeOfResidens;

    public NonFlyingBirds() {
    }

    public NonFlyingBirds(String plaseOfResidens, String feathers, int layEggs) {
        super(feathers, layEggs);
        this.placeOfResidens = plaseOfResidens;
    }

    public String getPlaseOfResidens() {
        return placeOfResidens;
    }

    public void setPlaceOfResidens(String plaseOfResidens) {
        this.placeOfResidens = plaseOfResidens;
    }

    @Override
    public String fly() {
        return "can't fly.";
    }
}
