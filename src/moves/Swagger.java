package moves;
import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger() { super(Type.NORMAL, 0, 0.85); }
    protected String describe() {return "петушится";};
    protected void applyOppEffects(Pokemon p) {p.setMod(Stat.ATTACK, +2); p.confuse();}
}
