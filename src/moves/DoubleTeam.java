package moves;
import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {
    public DoubleTeam() { super(Type.NORMAL, 0, 1.0); }
    protected String describe() {return "шатается пьяный";};
    protected void applySelfEffects(Pokemon p) {p.setMod(Stat.EVASION, +1);}
}