import java.util.Objects;

public class Sedan extends Cars {
    private Colors color;
    private double bodyLength;
    private TireBrands tireBrand;
    Engine typeEngine;

    public Sedan(String model, int maxSpeed, int yearOfManufacture, Colors color, double bodyLength, TireBrands tireBrand, Engine typeEngine) {
        super(model, maxSpeed, yearOfManufacture);
        this.color = color;
        this.bodyLength = bodyLength;
        this.tireBrand = tireBrand;
        this.typeEngine = typeEngine;
    }

    public Engine getTypeEngine() {
        return typeEngine;
    }

    public void setTypeEngine(Engine typeEngine) {
        this.typeEngine = typeEngine;
    }

    @Override
    public void gas() {
        super.gas();
    }

    @Override
    public void brake() {
        super.brake();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Sedan sedan = (Sedan) o;
        return Double.compare(sedan.bodyLength, bodyLength) == 0 && color == sedan.color && tireBrand == sedan.tireBrand && Objects.equals(typeEngine, sedan.typeEngine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color, bodyLength, tireBrand, typeEngine);
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "color=" + color +
                ", bodyLength=" + bodyLength +
                ", tireBrand=" + tireBrand +
                ", typeEngine=" + typeEngine +
                '}';
    }
}
