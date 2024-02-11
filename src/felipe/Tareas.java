package felipe;

public class Tareas implements Comparable<Tareas> {
    private int prioridad;
    private int duracion;

    public Tareas(int prioridad, int duracion) {
        this.prioridad = prioridad;
        this.duracion = duracion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public int compareTo(Tareas other){
        if (this.prioridad == other.getPrioridad()){
            return this.duracion - other.getDuracion();
        }else {
            return other.getPrioridad() - this.prioridad;
        }
    }

    @Override
    public String toString(){
        return this.prioridad+" - "+this.duracion;
    }
}
