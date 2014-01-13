package imageviewer;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ApplicationFrame extends JFrame{
    private ImageViewer imageViewer;

    public ApplicationFrame() {
        super("Image viewer");
        this.setSize(1024, 800);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());       
        this.createComponents();
        this.setVisible(true);
    }

    public ImageViewer getImageViewer() {
        return imageViewer;
    }

    private void createComponents() {
        this.add(createImagePanel(),BorderLayout.CENTER);
        this.add(createButton("Prev"),BorderLayout.SOUTH);
        this.add(createButton("Next"),BorderLayout.SOUTH);
    }
     
    private JButton createButton(String title) {
        JButton button = new JButton(title);
        return button;
    }

    private JPanel createImagePanel() {
        ImagePanel panel = new ImagePanel();
        this.imageViewer = panel;
        return panel;
    }

}
