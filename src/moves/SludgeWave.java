package moves;
import java.lang.Math;
import ru.ifmo.se.pokemon.*;

public class SludgeWave extends SpecialMove {
    public SludgeWave() {
        super(Type.POISON, 95,1.0);
    }
    protected String describe() { return "чета исполнил я хз че"; }
    protected void applyOppEffects(Pokemon p) {
        if(Math.random() < 0.1) Effect.poison(p);
    }
}
