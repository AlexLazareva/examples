package beans;

import java.awt.*;
import java.awt.event.*;
import java.io.Serializable;

public class Colors extends Canvas implements Serializable {
    transient private Color color;
    private boolean rectangular;

    public Colors() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                change();
            }
        });
        rectangular = false;
        setSize(200, 100);
        change();
    }

    public boolean getRectangular() {
        return rectangular;
    }

    public void setRectangular(boolean flag) {
        this.rectangular = flag;
        repaint();
    }

    public void change() {
       color = randomColor();
       repaint();
    }

    private Color randomColor() {
        int r = (int) (255*Math.random());
        int g = (int) (255*Math.random());
        int b = (int) (255*Math.random());

        return new Color(r, g, b);
    }

    @Override
    public void paint(Graphics graphics) {
        Dimension dimension = getSize();
        int height = dimension.height;
        int width = dimension.width;

        graphics.setColor(color);

        if (rectangular) {
            graphics.fillRect(0, 0, width - 1, height - 1);
        } else {
            graphics.fillOval(0,0, width - 1, height - 1);
        }
    }
}
