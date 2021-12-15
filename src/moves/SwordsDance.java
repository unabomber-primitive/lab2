package moves;
import ru.ifmo.se.pokemon.*;

public class SwordsDance extends StatusMove {
    public SwordsDance() { super(Type.NORMAL, 0, 1.0); }
    protected String describe() {return "делает коловрат из мечей";};
    protected void applySelfEffects(Pokemon p) {p.setMod(Stat.ATTACK, +2);}
}