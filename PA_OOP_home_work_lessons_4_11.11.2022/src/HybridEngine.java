import java.util.Objects;

public class HybridEngine extends Engine{
    private int resourceEngine;

    public HybridEngine(String typeEngine, int volumeEngine, int serialNumberEngine, int resourceEngine) {
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
        HybridEngine that = (HybridEngine) o;
        return resourceEngine == that.resourceEngine;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), resourceEngine);
    }

    @Override
    public String toString() {
        return "HybridEngine{" +
                "resourceEngine=" + resourceEngine +
                '}';
    }
}
