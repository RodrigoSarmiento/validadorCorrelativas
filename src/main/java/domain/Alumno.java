package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Alumno {
    private String legajo;
    private List<Materia> materiasAP = new ArrayList<Materia>();
    private String nombre;
    public Alumno(String legajo, String nombre) {
        this.legajo = legajo;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public void setMateriasAP(Materia ... materias) {
        Collections.addAll(this.materiasAP, materias);
    }



    public Boolean cumpleCorrelativas(List<Materia> materias){
        return materias.stream()
                .allMatch(m -> materiasAP.containsAll(m.getCorrelativas()));
        // Con esto estamos corroborando si dentro de materiasAP estan las coreelativas de m.
    }
}
