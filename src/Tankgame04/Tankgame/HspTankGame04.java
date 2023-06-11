package Tankgame04.Tankgame;

import javax.swing.*;

public class HspTankGame04 extends JFrame {
    Mypanel mp = null;

    public static void main(String[] args) {
        HspTankGame04 hspTankGame01 = new HspTankGame04();
    }

    public HspTankGame04() {
        mp = new Mypanel();
        this.add(mp);
        Thread thread = new Thread(mp);
        thread.start();
        this.setSize(1000, 750);
        this.setVisible(true);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
