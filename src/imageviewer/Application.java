package imageviewer;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Application {

    public static void main(String[] args) {
        new Application().execute();
    }
    private static final String FILENAME = "C:\\Users\\Yeray\\Pictures\\duda octabio.PNG";

    private void execute() {
        ApplicationFrame applicationFrame = new ApplicationFrame();
        ImageViewer viewer = applicationFrame.getImageViewer();
        viewer.show(createRealImage());
    }

    private Image createRealImage() {
        return new RealImage(loadBitmap());
    }

    private Bitmap loadBitmap() {
        return new SwingBitmap(loadBufferedImage());
    }

    private BufferedImage loadBufferedImage() {
        try {
            return ImageIO.read(new File(FILENAME));
        } catch (IOException ex) {
            return null;
        }
    }
    
}
