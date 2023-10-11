
public class NonLuxuryCar implements Car {

    private String name;

    public NonLuxuryCar(String cName) {
        name = cName;
    }

    @Override
    public String getCarName() {
        return name;
    }

    @Override
    public String getCarFeatures() {
        return "Non-Luxury Car Features ";
    }
;

} // End of class

