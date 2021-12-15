package pokemons;
import moves.*;
import ru.ifmo.se.pokemon.*;

public class Nidoking extends Nidorino {
    public Nidoking(String name, int level) {
        super(name, level);
        this.setMove(new SludgeBomb(), new Thunderbolt(), new Leer(), new SludgeWave());
        this.setType(Type.POISON, Type.GROUND);
        this.setStats(81, 102, 77, 85, 75, 85);
    }
    public Nidoking() {
        super();
        this.setMove(new SludgeBomb(), new Thunderbolt(), new Leer(), new SludgeWave());
        this.setType(Type.POISON, Type.GROUND);
        this.setStats(81, 102, 77, 85, 75, 85);
    }
}
