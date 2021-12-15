
import pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Registeel("Братишка", 4);
        Pokemon p2 = new Pancham("Начальник", 4);
        Pokemon p3 = new Pangoro("BoyNextDoor", 4);
        Pokemon p4 = new NidoranM("Поридж", 4);
        Pokemon p5 = new Nidorino("Эдуард Лимонов", 5);
        Pokemon p6 = new Nidoking("Тимур Муцураев", 3);
        b.addAlly(p1);
        b.addAlly(p3);
        b.addAlly(p5);
        b.addFoe(p2);
        b.addFoe(p4);
        b.addFoe(p6);
        b.go();
    }
}
