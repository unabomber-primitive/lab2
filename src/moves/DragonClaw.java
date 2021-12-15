package moves;
import ru.ifmo.se.pokemon.*;

public class DragonClaw extends PhysicalMove {
    public DragonClaw() {
        super(Type.DRAGON, 80,1.0);
    }
    protected String describe() { return ">а может ты пидор, епта? \n *стукает*"; }
}