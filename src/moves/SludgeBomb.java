package moves;
import java.lang.Math;
import ru.ifmo.se.pokemon.*;

public class SludgeBomb extends SpecialMove {
    public SludgeBomb() {
        super(Type.POISON, 90,1.0);
    }
    protected String describe() { return "кидается говном"; }
    protected void applyOppEffects(Pokemon p) {
        if(Math.random() < 0.3) Effect.poison(p);
    }
}