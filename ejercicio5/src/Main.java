import entidades.Animal;
import entidades.Caballo;
import entidades.Gato;
import entidades.Perro;

public class Main {
    public static void main (String[] args){
        Animal perro = new Perro("Stich","Carnivoro",15, "Doberman");
        perro.Alimentarse();
        System.out.println(" ");

        Perro perro1 = new Perro("Teddy", "Croqueta", 10, "Chihuahua");
        perro1.Alimentarse();
        System.out.println(" ");

        Animal gato = new Gato("Pelusa", "Galletas", 15,"Siames");
        gato.Alimentarse();
        System.out.println(" ");

        Animal caballo = new Caballo("Spark", "Pasto", 25, "Fino");
        caballo.Alimentarse();

        perro.mostrarDatos();
        perro1.mostrarDatos();
        gato.mostrarDatos();
        caballo.mostrarDatos();

    }
}
