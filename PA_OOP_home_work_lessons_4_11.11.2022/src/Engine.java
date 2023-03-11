import java.util.Objects;

public class Engine {
    protected String typeEngine;
    protected int volumeEngine;
    protected int serialNumberEngine;


    public Engine(String typeEngine, int volumeEngine, int serialNumberEngine) {
        this.typeEngine = typeEngine;
        this.volumeEngine = volumeEngine;
        this.serialNumberEngine = serialNumberEngine;
    }

    public String getTypeEngine() {
        return typeEngine;
    }

    public void setTypeEngine(String typeEngine) {
        this.typeEngine = typeEngine;
    }

    public int getVolumeEngine() {
        return volumeEngine;
    }

    public int getSerialNumberEngine() {
        return serialNumberEngine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return volumeEngine == engine.volumeEngine && serialNumberEngine == engine.serialNumberEngine && Objects.equals(typeEngine, engine.typeEngine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeEngine, volumeEngine, serialNumberEngine);
    }

    @Override
    public String toString() {
        return "Engine{" +
                "typeEngine='" + typeEngine + '\'' +
                ", volumeEngine=" + volumeEngine +
                ", serialNumberEngine=" + serialNumberEngine +
                '}';
    }
}
