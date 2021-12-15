package pokemons;
import moves.*;
import ru.ifmo.se.pokemon.*;

public class Nidorino extends NidoranM {
    public Nidorino(String name, int level) {
        super(name, level);
        this.setMove(new SludgeBomb(), new Thunderbolt(), new Leer());
        this.setStats(61, 72, 57, 55, 55, 65);
    }
    public Nidorino() {
        super();
        this.setMove(new SludgeBomb(), new Thunderbolt(), new Leer());
        this.setStats(61, 72, 57, 55, 55, 65);
    }
}