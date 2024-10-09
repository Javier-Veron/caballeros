public class Caballero {

    //Atributos

    String nombre;
    int edadCaballero;
    int nivelMaldad;
    Constelacion constelacion;

    // Metodos

    public boolean constelacionCercanaAlSol(){
        return constelacion.cercanaAlSol();
    }

    public boolean constelacionBandaCeleste(){
        return constelacion.getBandaCeleste();
    }


    // GETTERS AND SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdadCaballero() {
        return edadCaballero;
    }

    public void setEdadCaballero(int edadCaballero) {
        this.edadCaballero = edadCaballero;
    }

    public int getNivelMaldad() {
        return nivelMaldad;
    }

    public void setNivelMaldad(int nivelMaldad) {
        this.nivelMaldad = nivelMaldad;
    }


}
