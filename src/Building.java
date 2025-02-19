public class Building implements Mappable{
    private String name;
    private UsageType usageType;

    public Building(String name, UsageType usageType) {
        this.name = name;
        this.usageType = usageType;
    }

    @Override
    public String getLabel(){
        return name + " (" + usageType + ")";
    }

    @Override
    public Geometry getShape() {
        return switch (this.usageType) {
            case BUSINESS, ENTERTAINMENT, SPORTS -> Geometry.POINT;
            default -> Geometry.POINT;
        };
    }

    @Override
    public String getMarker() {
        String result = "";
        switch (this.usageType) {
            case BUSINESS:
                result = PointMaker.CIRCLE.name() +" " + Color.GRAY;
                break;
            case ENTERTAINMENT:
                result = PointMaker.TRIANGLE.name() +" " + Color.GREEN;
                break;
            case SPORTS:
                result = PointMaker.STAR.name() +" " + Color.PURPLE;
                break;
        }
        return result;
    }

    @Override
    public String getProperties() {
        return String.format("\"name\":\"%s\", \"usageType\":\"%s\"", name, usageType);
    }
}
