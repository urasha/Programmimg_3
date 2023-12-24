package Humans;

abstract public class Character {
    abstract public void lookAt(Character character);

    protected String name;
    protected Location currentLocation;

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", currentLocation=" + currentLocation +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
