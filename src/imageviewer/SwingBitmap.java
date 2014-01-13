package imageviewer;

import java.awt.image.BufferedImage;

public class SwingBitmap implements Bitmap{

    private final BufferedImage bufferedImage;
    
    public SwingBitmap(BufferedImage bufferedImage) {
        this.bufferedImage = bufferedImage;
    }

    public BufferedImage getBufferedImage() {
        return bufferedImage;
    }

}
