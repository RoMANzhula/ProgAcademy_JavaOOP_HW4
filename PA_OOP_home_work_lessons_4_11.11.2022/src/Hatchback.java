public class Hatchback extends Cars {
    private Colors color;
    private double bodyLength;
    private TireBrands tireBrand;
    BenzineEngine benzineEngine;
    DieselEngine dieselEngine;
    HybridEngine hybridEngine;

    public Hatchback(String model, int maxSpeed, int yearOfManufacture, Colors color, double bodyLength, TireBrands tireBrand, BenzineEngine benzineEngine) {
        super(model, maxSpeed, yearOfManufacture);
        this.color = color;
        this.bodyLength = bodyLength;
        this.tireBrand = tireBrand;
        this.benzineEngine = benzineEngine;
    }
    public Hatchback(String model, int maxSpeed, int yearOfManufacture, Colors color, double bodyLength, TireBrands tireBrand, DieselEngine dieselEngine) {
        super(model, maxSpeed, yearOfManufacture);
        this.color = color;
        this.bodyLength = bodyLength;
        this.tireBrand = tireBrand;
        this.dieselEngine = dieselEngine;
    }
    public Hatchback(String model, int maxSpeed, int yearOfManufacture, Colors color, double bodyLength, TireBrands tireBrand, HybridEngine hybridEngine) {
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
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
