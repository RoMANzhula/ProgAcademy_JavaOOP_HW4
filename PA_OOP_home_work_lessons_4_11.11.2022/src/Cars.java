import java.util.Objects;

public class Cars implements Gas, Brake {
    protected String model;
    protected int maxSpeed;
    protected int yearOfManufacture;

    public Cars(String model, int maxSpeed, int yearOfManufacture) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    @Override
    public void brake() {
        System.out.println("Brake!");
    }

    @Override
    public void gas() {
        System.out.println("Gas!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cars cars = (Cars) o;
        return maxSpeed == cars.maxSpeed && yearOfManufacture == cars.yearOfManufacture && Objects.equals(model, cars.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, maxSpeed, yearOfManufacture);
    }

    @Override
    public String toString() {
        return "Cars{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", yearOfManufacture=" + yearOfManufacture +
                '}';
    }
}
