package moves;
import java.lang.Math;
import ru.ifmo.se.pokemon.*;

public class ArmThrust extends PhysicalMove {
    public ArmThrust() {
        super(Type.FIGHTING, 15, 1.0, 0, 2);
        double a = Math.random()*8;
        this.hits = (a<3 ? 2 : (a<6 ? 3 : (a<7 ? 4 : (a<8 ? 5 : 2))));
    }
    protected String describe() { return "тычка"; }
}
