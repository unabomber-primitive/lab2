package moves;
import java.lang.Math;
import ru.ifmo.se.pokemon.*;

public class Thunderbolt extends SpecialMove {
    public Thunderbolt() {
        super(Type.ELECTRIC, 90,1.0);
    }
    protected String describe() { return "ведает, активирует коловратом молнию предков"; }
    protected void applyOppEffects(Pokemon p) {
        if(Math.random() < 0.1) Effect.paralyze(p);
    }
}