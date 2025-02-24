public class Point implements Mappable {
    String name;
    private double latitude;
    private double longitude;


    public Point(String name, double latitude, double longitude) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;

    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getName() {
        return name;
    }

    @Override
    public void render() {
        System.out.println("Render " + getName() + " as POINT (" + getLatitude() + ", " + getLongitude() + ")");
    }
}