import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame() {
        this.setTitle("JFrame title goes here");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application on close
        this.setResizable(false);
        this.setSize(700,700);
        this.setVisible(true); // makes the frame visible

        ImageIcon image = new ImageIcon("monkey-emoji.webp");
        this.setIconImage(image.getImage()); // changes the icon of the frame
        this.getContentPane().setBackground(new Color(200,200,200));
    }
}
