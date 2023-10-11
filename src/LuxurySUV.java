
public class LuxurySUV implements SUV {

    private String name;

    public LuxurySUV(String sName) {
        name = sName;
    }

    @Override
    public String getSUVName() {
        return name;
    }

    @Override
    public String getSUVFeatures() {
        return "Luxury SUV Features ";
    }
;

} // End of class

