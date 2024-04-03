package domain.test;

import domain.Alumno;
import domain.Inscripcion;
import domain.Materia;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;


public class test{
    @Test

    public void testInscripcionRechazada(){
        Materia algebra = new Materia("Algebra");
        Materia analisis1 = new Materia("Analisis 1");
        Materia analisis2 = new Materia("Analisis 2");

        Alumno katy = new Alumno("2553144", "Katy");

        analisis2.setCorrelativas(analisis1, algebra);
        analisis1.setCorrelativas(algebra);

        katy.setMateriasAP(algebra);

        Inscripcion unaInscripcion = new Inscripcion(katy);

        unaInscripcion.agregarMaterias(analisis1, analisis2);

        Assert.assertEquals(false, unaInscripcion.Aprobada());
    }

    @Test
    public void testInscripcionAprobada(){
        Materia algoritmos = new Materia("Algoritmos y Estructuras de Datos");
        Materia pdep = new Materia("Paradigmas de Programacion");
        Materia dds = new Materia("Diseño de Sistemas");

        Alumno franco = new Alumno("1566710", "Franco");

        pdep.setCorrelativas(algoritmos);
        dds.setCorrelativas(algoritmos, pdep);

        franco.setMateriasAP(algoritmos, pdep);

        Inscripcion unaInscripcion = new Inscripcion(franco);

        unaInscripcion.agregarMaterias(dds);

        Assert.assertTrue(unaInscripcion.Aprobada());
    }
}
