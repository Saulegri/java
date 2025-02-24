public interface Mappable {
    void render();

    static double[] parseLocation(String location) {
        String[] parts = location.split(",");
        double[] coords = new double[parts.length];
        for (int i = 0; i < parts.length; i++) {
            coords[i] = Double.parseDouble(parts[i].trim());
        }
        return coords;
    }
}