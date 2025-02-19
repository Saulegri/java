
public class UtilityLine implements Mappable {

    private String name;
    private UtilityType utilityType;

    public UtilityLine(String name, UtilityType utilityType) {
        this.name = name;
        this.utilityType = utilityType;
    }

    @Override
    public String getLabel() {
        return name + " (" + utilityType + ")";
    }

    @Override
    public Geometry getShape() {
        return switch (this.utilityType) {
            case FIBER_OPTIC, WATER -> Geometry.LINE;
            default -> Geometry.LINE;
        };
    }
    @Override
    public String getMarker() {
        String result = "";
        switch (this.utilityType) {
            case FIBER_OPTIC:
                result = PointMaker.CIRCLE.name() + " " + Color.GRAY;
                break;
            case WATER:
                result = PointMaker.TRIANGLE.name() + " " + Color.GREEN;
                break;
        }
        return result;
    }
    @Override
    public String getProperties() {
        return String.format("\"name\":\"%s\", \"utilityType\":\"%s\"", name, utilityType);
    }

}
