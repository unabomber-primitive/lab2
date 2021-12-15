package moves;
import ru.ifmo.se.pokemon.*;

public class ThunderWave extends StatusMove {
    public ThunderWave() {
        super(Type.ELECTRIC, 0, 0.9);
    }
    protected String describe() {
        return "такой типа Тор громом";
    }
    protected void applyOppEffects(Pokemon p) {
        Effect.paralyze(p);
    }
}