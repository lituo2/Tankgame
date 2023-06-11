package Tankgame02.Tankgame;

import javax.swing.*;

public class HspTankGame02 extends JFrame {
    Mypanel mp = null;

    public static void main(String[] args) {
        HspTankGame02 hspTankGame01 = new HspTankGame02();
    }

    public HspTankGame02() {
        mp = new Mypanel();
        this.add(mp);
        this.setSize(1000, 750);
        this.setVisible(true);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
