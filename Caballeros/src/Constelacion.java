public class Constelacion {
    //Atributos

    String nombre;
    int distanciaAlSol;
    Boolean bandaCeleste;

    //Metodos

    public boolean cercanaAlSol(){
        return distanciaAlSol < 1000;
    }

    //GETTERS AND SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDistanciaAlSol() {
        return distanciaAlSol;
    }

    public void setDistanciaAlSol(int distanciaAlSol) {
        this.distanciaAlSol = distanciaAlSol;
    }

    public Boolean getBandaCeleste() {
        return bandaCeleste;
    }

    public void setBandaCeleste(Boolean bandaCeleste) {
        this.bandaCeleste = bandaCeleste;
    }




}
