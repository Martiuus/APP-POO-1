import model.Alumno;
import model.CicloAcademico;
import model.Curso;
import model.Especialidad;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //Creando un objeto desde un constructor vacio
        Curso objCurso = new Curso();
        objCurso.setIdcurso(1);
        System.out.println(objCurso.getIdcurso());

        //Creando un objeto desde un constructor con parametros
        Curso objCurso2 = new Curso(2);
        System.out.println(objCurso2.getIdcurso());

        Especialidad objEspe = new Especialidad(2,"especialidad", true, LocalDate.now());
        String[] atributosEspe = {
                String.valueOf(objEspe.getIdespecialidad()),
                objEspe.getNomespecialidad(),
                String.valueOf(objEspe.getEstado()),
                String.valueOf(objEspe.getFechacreada())
        };
        for (String atributo : atributosEspe){
            System.out.println(atributo);
        }

        CicloAcademico objCicloAca = new CicloAcademico(2025, "año nuevo chino", "año biciesto", LocalDate.of(2025,3,15), LocalDate.of(2025,10,15));
        String [] atributosCiclo = {
                objCicloAca.getIdciclo().toString(),
                objCicloAca.getNomciclo(),
                objCicloAca.getDescripcion(),
                objCicloAca.getFechainicio().toString(),
                objCicloAca.getFechafin().toString()
        };

        for (String atributo : atributosCiclo){
            System.out.println(atributo);
        }

        Alumno objAlumno = new Alumno();
        objAlumno.setNombre("Alonso");
        objAlumno.setApellido("Zambrano");
        objAlumno.setDni("74854551");
        objAlumno.setEdad(24);
        objAlumno.setId(201);

    }
}