package pokemons;
import moves.*;
import ru.ifmo.se.pokemon.*;

public class Registeel extends Pokemon {
    public Registeel(String name, int level) {
        super(name, level);
        this.setMove(new HammerArm(), new Stomp(), new Swagger(), new ThunderWave());
        this.setType(Type.STEEL);
        this.setStats(80, 75, 150, 75, 150, 50);
    }
    public Registeel() {
        super();
        this.setMove(new HammerArm(), new Stomp(), new Swagger(), new ThunderWave());
        this.setType(Type.STEEL);
        this.setStats(80, 75, 150, 75, 150, 50);
    }
}
