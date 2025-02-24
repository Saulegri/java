public class River extends Line {

    public River(String name, String[] locations) {
        super(name, getPointsArray(locations));
    }

    private static double[][] getPointsArray(String[] locations) {
        double[][] points = new double[locations.length][];
        for (int i = 0; i < locations.length; i++) {
            points[i] = Mappable.parseLocation(locations[i]);
        }
        return points;
    }


}
