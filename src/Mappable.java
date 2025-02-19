public interface Mappable {
    String JSON_PROPERTY = """
            "properties":{%s}
            """;

    String getLabel();

    Geometry getShape();

    String getMarker();

    default String toJSON() {
        return String.format(JSON_PROPERTY,
                String.format("\"type\":\"%s\", \"label\":\"%s\", \"marker\":\"%s\", %s",
                        getShape(), getLabel(), getMarker(), getProperties()));
    }


    default String getProperties() {
        return "";
    }

    static void mapIt(Mappable mappable) {
        System.out.println(mappable.toJSON());
    }
}
