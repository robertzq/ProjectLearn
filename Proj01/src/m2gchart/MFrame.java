package m2gchart;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MFrame extends JFrame implements ActionListener {
    private JPanel panel;
    private JLabel lbl;
    private JButton btn;
    private int deltaSec;
    Timer timer = new Timer(1000, this);
    private int[][] datas = new int[][]{{100, 150, 30, 45, 34}, {28, 78, 48, 26, 45}, {28, 34, 45, 500, 23}, {20, 343, 45, 45, 45}};

    public MFrame() {
        super("图表测试");
        btn = new JButton("start");
        panel = new Mg2Panel(this, 0, datas);
        this.setLayout(new BorderLayout());
        this.add(btn, BorderLayout.SOUTH);

        this.add(panel, BorderLayout.CENTER);
        btn.addActionListener(this);
        setBounds(20, 30, 500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        timer.start();
    }

    public void repaintChartPanel() {
        this.remove(panel);
        panel = new Mg2Panel(this, deltaSec, datas);
        this.add(panel);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        deltaSec++;
        if (deltaSec >= datas.length) {
            timer.stop();
            deltaSec = 0;
        } else {
            repaintChartPanel();
        }

    }
}
