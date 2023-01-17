import entidades.Carnivoro;
import entidades.Herbivoro;

public class Main {
    public static void main( String[] args){
        Carnivoro carnivoro1 = new Carnivoro();
        carnivoro1.crearAnimal();

        carnivoro1.tipoAnimal();
        carnivoro1.alimentacion();
        carnivoro1.imprimirDatos();

        Herbivoro ardilla = new Herbivoro("ardilla", false,5);

        ardilla.tipoAnimal();
        ardilla.alimentacion();
        ardilla.imprimirDatos();
    }
}
