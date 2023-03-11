import java.util.Objects;

public class StationWagon extends Cars {
    private Colors color;
    private double bodyLength;
    private TireBrands tireBrand;
    BenzineEngine benzineEngine;
    DieselEngine dieselEngine;
    HybridEngine hybridEngine;

    public StationWagon(String model, int maxSpeed, int yearOfManufacture, Colors color, double bodyLength, TireBrands tireBrand, BenzineEngine benzineEngine) {
        super(model, maxSpeed, yearOfManufacture);
        this.color = color;
        this.bodyLength = bodyLength;
        this.tireBrand = tireBrand;
        this.benzineEngine = benzineEngine;
    }
    public StationWagon(String model, int maxSpeed, int yearOfManufacture, Colors color, double bodyLength, TireBrands tireBrand, DieselEngine dieselEngine) {
        super(model, maxSpeed, yearOfManufacture);
        this.color = color;
        this.bodyLength = bodyLength;
        this.tireBrand = tireBrand;
        this.dieselEngine = dieselEngine;
    }
    public StationWagon(String model, int maxSpeed, int yearOfManufacture, Colors color, double bodyLength, TireBrands tireBrand, HybridEngine hybridEngine) {
        super(model, maxSpeed, yearOfManufacture);
        this.color = color;
        this.bodyLength = bodyLength;
        this.tireBrand = tireBrand;
        this.hybridEngine = hybridEngine;
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
        StationWagon that = (StationWagon) o;
        return Double.compare(that.bodyLength, bodyLength) == 0 && color == that.color && tireBrand == that.tireBrand && Objects.equals(benzineEngine, that.benzineEngine) && Objects.equals(dieselEngine, that.dieselEngine) && Objects.equals(hybridEngine, that.hybridEngine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color, bodyLength, tireBrand, benzineEngine, dieselEngine, hybridEngine);
    }

    @Override
    public String toString() {
        return "StationWagon{" +
                "color=" + color +
                ", bodyLength=" + bodyLength +
                ", tireBrand=" + tireBrand +
                ", benzineEngine=" + benzineEngine +
                ", dieselEngine=" + dieselEngine +
                ", hybridEngine=" + hybridEngine +
                '}';
    }
}
