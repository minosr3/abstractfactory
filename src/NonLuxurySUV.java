
public class NonLuxurySUV implements SUV {

    private String name;

    public NonLuxurySUV(String sName) {
        name = sName;
    }

    @Override
    public String getSUVName() {
        return name;
    }

    @Override
    public String getSUVFeatures() {
        return "Non-Luxury SUV Features ";
    }
;

} // End of class

