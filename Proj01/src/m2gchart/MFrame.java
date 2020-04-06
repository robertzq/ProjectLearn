package m2gchart;

import javax.swing.*;
import java.awt.*;

public class MFrame extends JFrame {
    private JPanel panel;
    private JLabel lbl;
    public MFrame(){
        super("图表测试");
        panel = new Mg2Panel(this);

        setContentPane(panel);
        setBounds(20,30,500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
