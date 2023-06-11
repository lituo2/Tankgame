package Tankgame04.Tankgame;

import java.util.Vector;

public class EnemyTank extends Tank {
    Vector<Shot> shots = new Vector<>();
    boolean isLive = true;

    public EnemyTank(int x, int y) {
        super(x, y);
    }
}
