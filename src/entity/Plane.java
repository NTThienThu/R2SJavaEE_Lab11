package entity;

public class Plane {
    private int id;
    private String type;
    private int flightRange;

    public Plane() {
    }

    public Plane(int id, String type, int flightRange) {
        this.id = id;
        this.type = type;
        this.flightRange = flightRange;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getFlightRange() {
        return flightRange;
    }

    public void setFlightRange(int flightRange) {
        this.flightRange = flightRange;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", flightRange=" + flightRange +
                '}';
    }
}
