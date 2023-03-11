import java.util.Objects;

public class BenzineEngine extends Engine {
    private int resourceEngine;

    public BenzineEngine(String typeEngine, int volumeEngine, int serialNumberEngine, int resourceEngine) {
        super(typeEngine, volumeEngine, serialNumberEngine);
        this.resourceEngine = resourceEngine;
    }

    public int getResourceEngine() {
        return resourceEngine;
    }

    public void setResourceEngine(int resourceEngine) {
        this.resourceEngine = resourceEngine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BenzineEngine that = (BenzineEngine) o;
        return resourceEngine == that.resourceEngine;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), resourceEngine);
    }

    @Override
    public String toString() {
        return "BenzineEngine{" +
                "resourceEngine=" + resourceEngine +
                ", typeEngine='" + typeEngine + '\'' +
                ", volumeEngine=" + volumeEngine +
                ", serialNumberEngine=" + serialNumberEngine +
                '}';
    }
}
