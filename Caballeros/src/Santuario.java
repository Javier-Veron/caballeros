import java.util.ArrayList;
import java.util.List;

public class Santuario{

    //Atributos
    List<Caballero> listaCaballeros = new ArrayList<Caballero>();


    //Metodos

    public boolean posibleHades(){

        for (Caballero caballero: listaCaballeros){
            if (caballero.getNivelMaldad() > 200)
                return true;
        }
        return false;
    }

    public java.util.List<Caballero> caballerosConConstelacionesCercanasAlSol(){

        List<Caballero> listaTemporal = new ArrayList<Caballero>();

            for (Caballero caballero: listaCaballeros){
               if (caballero.constelacionCercanaAlSol()) listaTemporal.add(caballero);

        }
        return listaTemporal;
    }

    public int precoces() {
        int contador = 0;
        for (Caballero caballero : listaCaballeros) {
            if (caballero.getEdadCaballero() < 12) contador += 1;
        }
        return contador;
    }

    public java.util.List<Caballero> caballerosPoderos(){

        List<Caballero> listaTemporal = new ArrayList<Caballero>();

        for (Caballero caballero : listaCaballeros) {
            if (caballero.getEdadCaballero() < 12 && caballero.constelacionBandaCeleste())
                listaTemporal.add(caballero);
        }
        return listaTemporal;
    }

//  GETTERS AND SETTERS

    public java.util.List<Caballero> getListaCaballeros() {
        return listaCaballeros;
    }

    public void setListaCaballeros(List<Caballero> listaCaballeros) {
        this.listaCaballeros = listaCaballeros;
    }






}
