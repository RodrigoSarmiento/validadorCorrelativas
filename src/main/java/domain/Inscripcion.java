package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materias = new ArrayList<Materia>();

    public Inscripcion(Alumno alumno) {
        this.alumno = alumno;
    }
    public void agregarMaterias(Materia ... materias){
        Collections.addAll(this.materias, materias);
    }

    public Boolean Aprobada(){
        return this.alumno.cumpleCorrelativas(this.materias);
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public List<Materia> getMaterias() {
        return materias;
    }


}
