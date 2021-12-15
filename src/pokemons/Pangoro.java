package pokemons;
import moves.*;
import ru.ifmo.se.pokemon.*;

public class Pangoro extends Pancham {
    public Pangoro(String name, int level) {
        super(name, level);
        this.setMove(new ArmThrust(), new SwordsDance(), new DoubleTeam(), new DragonClaw());
        this.setType(Type.FIGHTING, Type.DARK);
        this.setStats(95, 124, 78, 69, 71, 58);
    }
    public Pangoro() {
        super();
        this.setMove(new ArmThrust(), new SwordsDance(), new DoubleTeam(), new DragonClaw());
        this.setType(Type.FIGHTING, Type.DARK);
        this.setStats(95, 124, 78, 69, 71, 58);
    }
}
