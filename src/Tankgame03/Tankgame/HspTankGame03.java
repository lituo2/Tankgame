package Tankgame03.Tankgame;

import javax.swing.*;

public class HspTankGame03 extends JFrame {
    Mypanel mp = null;

    public static void main(String[] args) {
        HspTankGame03 hspTankGame01 = new HspTankGame03();
    }

    public HspTankGame03() {
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
