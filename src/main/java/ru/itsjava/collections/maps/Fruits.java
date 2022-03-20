package ru.itsjava.collections.maps;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Fruits {
    private final String name;
    private final int weight;

    public String getName() {
        return this.name;
    }

    public int getWeight() {
        return this.weight;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Fruits)) return false;
        final Fruits other = (Fruits) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        if (this.getWeight() != other.getWeight()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Fruits;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        result = result * PRIME + this.getWeight();
        return result;
    }

    public String toString() {
        return "Fruits(name=" + this.getName() + ", weight=" + this.getWeight() + ")";
    }
}
