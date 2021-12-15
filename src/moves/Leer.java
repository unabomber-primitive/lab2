package moves;
import ru.ifmo.se.pokemon.*;

public class Leer extends StatusMove {
    public Leer() { super(Type.NORMAL, 0, 1.0); }
    protected String describe() {return "смотрит на всех как на быдло";};
    protected void applyOppEffects(Pokemon p) {p.setMod(Stat.DEFENSE, -1);}
}