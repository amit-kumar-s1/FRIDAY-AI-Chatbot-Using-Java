
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class HoverMouseEffect  {
    public JButton hoverEffect(JButton button){
        button.setBackground(new Color(40, 80, 10,100));
        button.setOpaque(true);
        button.setContentAreaFilled(true);
        button.setBorderPainted(false);
        button.addMouseListener(new MouseAdapter() {

            public void mouseEntered(MouseEvent e){
                button.setBackground(new Color(20,255,20));
            }

            public void mouseExited(MouseEvent e){
                button.setBackground(new Color(40, 80, 10, 100));
            }
        });

        return button;
    }
}
