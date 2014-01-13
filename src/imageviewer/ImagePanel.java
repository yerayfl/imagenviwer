package imageviewer;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

public class ImagePanel extends JPanel implements ImageViewer{
    private Image image;

    @Override
    public void show(Image image) {
        this.image = image;
        repaint();
    }

    @Override
    public Image getImage() {
        return image;
    }

    @Override
    public void paint(Graphics graphics) {
        graphics.drawImage(getBitmap(), 0, 0, null);
    }

    private BufferedImage getBitmap() {
        if(image.getBitmap() instanceof SwingBitmap)
            return getBufferedImage((SwingBitmap)image.getBitmap());
        return null;
    }

    private BufferedImage getBufferedImage(SwingBitmap swingBitmap) {
        return swingBitmap.getBufferedImage();
    }
    

}
