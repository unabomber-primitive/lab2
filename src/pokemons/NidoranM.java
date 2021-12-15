package pokemons;
import moves.*;
import ru.ifmo.se.pokemon.*;

public class NidoranM extends Pokemon {
    public NidoranM(String name, int level) {
        super(name, level);
        this.setMove(new SludgeBomb(), new Thunderbolt());
        this.setType(Type.POISON);
        this.setStats(46, 57, 40, 40, 40, 50);
    }
    public NidoranM() {
        super();
        this.setMove(new SludgeBomb(), new Thunderbolt());
        this.setType(Type.POISON);
        this.setStats(46, 57, 40, 40, 40, 50);
    }
}