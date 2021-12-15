package moves;
import ru.ifmo.se.pokemon.*;

public class HammerArm extends PhysicalMove {
    public HammerArm() {
        super(Type.FIGHTING, 100,0.9);
    }
    protected String describe() { return "жоска стукает"; }
    protected void applySelfEffects(Pokemon p) {p.setMod(Stat.SPEED, -1);}
}
