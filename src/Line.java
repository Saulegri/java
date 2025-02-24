public abstract class Line implements Mappable {
    private String name;
    private double[][] points;

    public Line(String name, double[][] points) {
        this.name = name;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public double[][] getPoints() {
        return points;
    }

    @Override
    public void render() {
        StringBuilder sb = new StringBuilder("Render " + getName() + " as LINE (");
        for (int i = 0; i < points.length; i++) {
            sb.append("[").append(points[i][0]).append(", ").append(points[i][1]).append("]");
            if (i < points.length - 1) {
                sb.append(", ");
            }
        }
        sb.append(")");
        System.out.println(sb);
    }
}
