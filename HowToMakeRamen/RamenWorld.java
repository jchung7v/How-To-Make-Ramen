package HowToMakeRamen;

public class RamenWorld {

    public static Ramen getRamen(String ramenName) {
        switch (ramenName) {
            case "Shin":
                return new ShinRamen();
            case "NeoGuRi":
                return new NeoGuRiRamen();
            case "Jin":
                return new JinRamen();
            default:
                throw new IllegalArgumentException("Unknown ramen type");
        }
    }
}
