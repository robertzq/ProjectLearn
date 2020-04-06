package m2gchart;

import javax.swing.*;
import java.awt.*;

public class Mg2Panel extends JPanel {
    private JFrame frame;
    int delta;

    public Mg2Panel(JFrame frame) {
        super();
        this.frame = frame;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawLine(g,Color.BLACK,"测试标题",20,20);
        for(int i=0;i<10;i++) {
            System.out.println(delta);
            drawRect(g, Color.ORANGE, 100, 5, 300 + i*5, 20);
            delta++;

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
      //  drawLine(g,Color.BLACK,"测试标题",20,20);
      //  drawRect(g,Color.ORANGE,100,5,300,20);
    }

    // 填充一个矩形
    private void drawRect(Graphics g,Color color,int x,int y,int width,int height){
        System.out.println("draw rect");
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(color);
        g2d.fillRect(x,y,width,height);
        g2d.dispose();
    }

    //绘制字体
    private void drawLine(Graphics g,Color color,String content,int x,int y) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(color);
        g2d.drawString(content,x,y);
        g2d.dispose();
    }
}
