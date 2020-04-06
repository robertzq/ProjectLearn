package m2gchart;

import javax.swing.*;
import java.awt.*;

public class Mg2Panel extends JPanel {
    private JFrame frame;
    private int delta;
    private int[][] datas;

    public Mg2Panel(JFrame frame,int deltaSec,int[][] data) {
        super();
        this.frame = frame;
        this.delta = deltaSec;
        this.datas=data;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        System.out.println("current second:"+delta);
        paintChart(g);

    }

    public void paintChart(Graphics g) {

        String[] titleList = new String[]{"中国","英国","美国","法国","俄罗斯"};
        Color[] clist = new Color[]{Color.RED,Color.ORANGE,Color.GREEN,new Color(153,217,234),Color.GRAY};
        for(int i=0;i<5;i++) {
            drawLine(g, Color.BLACK, titleList[i], 20, 20+25*i);
            drawRect(g, clist[i], 100, 5+25*i, 3*datas[delta][i] + delta * 5, 20);
            drawLine(g, Color.BLACK, datas[delta][i]+"", 320, 20+25*i);
        }
    }

    // 填充一个矩形
    private void drawRect(Graphics g, Color color, int x, int y, int width, int height) {

        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(color);
        g2d.fillRect(x, y, width, height);
        g2d.dispose();
    }

    //绘制字体
    private void drawLine(Graphics g, Color color, String content, int x, int y) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(color);
        g2d.drawString(content, x, y);
        g2d.dispose();
    }
}
