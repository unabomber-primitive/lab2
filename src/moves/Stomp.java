package moves;
import ru.ifmo.se.pokemon.*;

public class Stomp extends PhysicalMove {
    public Stomp() { super(Type.NORMAL, 65,1.0); }
    protected String describe() {return "жоска топает";}
}