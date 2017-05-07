package bird;

/**
 * Created by koqfl on 07.05.2017.
 */
public class FlyingBirds extends Bird {
    protected String placeOfResidens;

    public FlyingBirds() {
    }

    public FlyingBirds(String placeOfResidens, String feathers, int layEggs) {
        super(feathers, layEggs);
        this.placeOfResidens = placeOfResidens;
    }

    public String getPlaceOfResidens() {
        return placeOfResidens;
    }

    public void setPlaceOfResidens(String placeOfResidens) {
        this.placeOfResidens = placeOfResidens;
    }

    @Override
    public String fly() {
        return "can fly";
    }

    }

