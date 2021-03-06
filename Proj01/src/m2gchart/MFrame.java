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
    Timer timer;

    private int[][] datas = new int[][]{{100, 20, 66, 41, 34}, {28, 78, 96, 26, 45}, {28, 34, 72, 18, 23}, {20, 48, 21, 30, 17}, {30, 58, 81, 20, 67}};

    public MFrame() {
        super("图表测试");
        btn = new JButton("start");
        panel = new Mg2Panel(this, 0, datas);
        this.setLayout(new BorderLayout());
        this.add(btn, BorderLayout.SOUTH);
        this.add(panel, BorderLayout.CENTER);
        btn.addActionListener(this);
        setBounds(20, 30, 800, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        timer = new Timer(500, this);
        timer.setDelay(1000);//every action event interval
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
        System.out.println(System.currentTimeMillis());
        if (deltaSec >= datas.length) {
            // timer.stop();
            deltaSec = 0;
        } else {
            repaintChartPanel();
            deltaSec++;
        }

    }
}
