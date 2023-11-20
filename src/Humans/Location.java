package Humans;

public enum Location {
    WINDOW("окно"),
    ROOF("крыша");

    public final String currentLocation;

    Location(String location) {
        this.currentLocation = location;
    }
}
