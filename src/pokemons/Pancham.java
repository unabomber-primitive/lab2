package pokemons;
import moves.*;
import ru.ifmo.se.pokemon.*;

public class Pancham extends Pokemon {
    public Pancham(String name, int level) {
        super(name, level);
        this.setMove(new ArmThrust(), new SwordsDance(), new DoubleTeam());
        this.setType(Type.FIGHTING);
        this.setStats(67, 82, 62, 46, 48, 43);
    }
    public Pancham() {
        super();
        this.setMove(new ArmThrust(), new SwordsDance(), new DoubleTeam());
        this.setType(Type.FIGHTING);
        this.setStats(67, 82, 62, 46, 48, 43);
    }
}