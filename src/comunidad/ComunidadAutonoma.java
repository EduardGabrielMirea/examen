package comunidad;

public class ComunidadAutonoma implements Comparable<ComunidadAutonoma>{
        private String nombre;
        private int poblacion;

    public ComunidadAutonoma(String nombre, int poblacion) {
        this.nombre = nombre;
        this.poblacion = poblacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }


    @Override
    public int compareTo(ComunidadAutonoma other) {
        return other.getPoblacion()-this.poblacion;
    }

    @Override
    public String toString(){
        return this.nombre+ " : "+this.poblacion;
    }
}
