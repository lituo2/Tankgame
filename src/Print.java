import javax.swing.*;
import java.awt.*;

public class Print extends JFrame {
    private Mypanel mp = null;

    public static void main(String[] args) {
        new Print();
    }

    public Print() {
        mp = new Mypanel();
        this.add(mp);
        this.setSize(1000, 750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

}

class Mypanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        System.out.println("~");
        g.fill3DRect(50, 50, 10, 10, true);
    }
}
