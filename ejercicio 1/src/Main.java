import entidades.Alumno;
import entidades.Profesor;

public class Main {
    public static void main (String [] args){
        Alumno alumno1 = new Alumno("Yanet", "Montoya", 29, 4);
        alumno1.accion();
        alumno1.mostrarDatos();

        Profesor profesor = new Profesor("Luis", "Martinez", 40, "Programación");
        profesor.accion();
        profesor.mostrarDatos();
    }
}
