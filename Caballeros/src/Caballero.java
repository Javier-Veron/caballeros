public class Caballero {

    //Atributos

    String nombre;
    int edadCaballero;
    int nivelMaldad;
    Constelacion constelacion;

    //Constructores

    public Caballero(String nombre,int edad, int nivelMaldad, Constelacion constelacion){

        this.nombre = nombre;
        this.edadCaballero = edad;
        this.nivelMaldad = nivelMaldad;
        this.constelacion = constelacion;

    }

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
