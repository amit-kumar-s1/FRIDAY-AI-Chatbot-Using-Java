import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.Cursor;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;


public class newChatFriday {

    JPanel messageJPanel;
    JPanel TopRightBannerJPannel;
    JLabel rightHeadingJLabel;
    JLabel rightSubHeadingJLabel;
    JPanel rightHeadingJPanel;
    JPanel buttonJPanel; 
    JButton themeJButton;
    JButton deleteJButton;
    JScrollPane scrollPane;
    JPanel inputJPanel;
    JTextField inputField;
    JButton sendJButton;
    
    ResizeImageQuality quality = new ResizeImageQuality();
    public void addNewChat(JButton button){
        // Right Panel - Designing
        //Designing TopRightBanner
        TopRightBannerJPannel = new JPanel();
        TopRightBannerJPannel.setBackground(new Color(5, 18, 8));
        TopRightBannerJPannel.setPreferredSize(new Dimension(0,100));
        TopRightBannerJPannel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 100));
        TopRightBannerJPannel.setLayout(new BorderLayout());
        
        TopRightBannerJPannel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        App.rightJPanel.add(TopRightBannerJPannel, BorderLayout.NORTH);

        // Designing RightHeading 
        rightHeadingJLabel = new JLabel();
        rightHeadingJLabel.setForeground(new Color(150, 255, 50));
        rightHeadingJLabel.setFont(new Font("Orbitron", Font.BOLD, 30));
        rightHeadingJLabel.setText("FRIDAY AI Assistant");


        // Designing RightSubHeading
        rightSubHeadingJLabel = new JLabel();
        rightSubHeadingJLabel.setForeground(new Color(170, 190, 170));
        rightSubHeadingJLabel.setFont(new Font("Orbitron", Font.PLAIN, 14));
        rightSubHeadingJLabel.setText("Here to help you 24/7");


        // Designing RightHeadingPanel
        rightHeadingJPanel = new JPanel();
        rightHeadingJPanel.setBackground(new Color(5, 18, 8));
        rightHeadingJPanel.setPreferredSize(new Dimension(500,100));
        rightHeadingJPanel.setMaximumSize(new Dimension(500, Integer.MAX_VALUE));
        rightHeadingJPanel.setLayout(new BoxLayout(rightHeadingJPanel, BoxLayout.Y_AXIS));
        rightHeadingJPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

        rightHeadingJPanel.add(rightHeadingJLabel);
        rightHeadingJPanel.add(Box.createVerticalStrut(5));
        rightHeadingJPanel.add(rightSubHeadingJLabel);

        TopRightBannerJPannel.add(rightHeadingJPanel, BorderLayout.WEST);


        // Designing Panel Of theme, Delete button
        buttonJPanel = new JPanel();
        buttonJPanel.setBackground(new Color(5, 18, 8));
        buttonJPanel.setPreferredSize(new Dimension(200,100));
        buttonJPanel.setMaximumSize(new Dimension(200, Integer.MAX_VALUE));
        buttonJPanel.setLayout(new BoxLayout(buttonJPanel, BoxLayout.X_AXIS)); 
        buttonJPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));       

        // Desiging RightPanel Button - Change Theme Button
        themeJButton = new JButton();
        themeJButton.setContentAreaFilled(false);
        themeJButton.setOpaque(false);
        themeJButton.setFocusPainted(false);

        themeJButton.setPreferredSize(new Dimension(30,30));
        themeJButton.setMaximumSize(new Dimension(30,30));
        themeJButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        themeJButton.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(new Color(100,255,100),2,true), BorderFactory.createEmptyBorder(5,5,5,5 )));

        ImageIcon theme = new ImageIcon("Resources/Theme.png");
        Image themeImage = theme.getImage();
        Image finalTheme = quality.highQuality(themeImage, 30, 30);

        themeJButton.setIcon(new ImageIcon(finalTheme));

        buttonJPanel.add(themeJButton);

        // Desiging RightPanel Button - Delete Button
        deleteJButton = new JButton();
        deleteJButton.setContentAreaFilled(false);
        deleteJButton.setOpaque(false);
        deleteJButton.setFocusPainted(false);

        deleteJButton.setPreferredSize(new Dimension(30,30));
        deleteJButton.setMaximumSize(new Dimension(30,30));
        deleteJButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        deleteJButton.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(new Color(100,255,100),2,true), BorderFactory.createEmptyBorder(5,5,5,5 )));

        ImageIcon delete = new ImageIcon("Resources/Delete.png");
        Image deleteImage = delete.getImage();
        Image finalDelete = quality.highQuality(deleteImage, 30, 30);

        deleteJButton.setIcon(new ImageIcon(finalDelete));
        buttonJPanel.add(Box.createHorizontalStrut(20));
        buttonJPanel.add(deleteJButton);

        TopRightBannerJPannel.add(buttonJPanel, BorderLayout.EAST);

        // Designing Right Side - message panel
        messageJPanel = new JPanel();
        messageJPanel.setBackground(new Color(3,14,6));
        messageJPanel.setLayout(new BoxLayout(messageJPanel, BoxLayout.Y_AXIS));

        // Designing Scroll Pane
        scrollPane = new JScrollPane(messageJPanel);
        scrollPane.setBorder(null);
        scrollPane.getViewport().setBackground(new Color(3,14,6));
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);
        App.rightJPanel.add(scrollPane, BorderLayout.CENTER);

        // Designing Bottom Input Panel
        inputJPanel = new JPanel();
        inputJPanel.setBackground(new Color(5,18,8));
        inputJPanel.setLayout(new BorderLayout(10,10));
        inputJPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        //Designing input field 
        inputField = new JTextField();
        inputField.setBackground(new Color(15,25,15));
        inputField.setForeground(Color.WHITE);
        inputField.setCaretColor(Color.WHITE);
        inputField.setFont(new Font("Segoe UI", Font.PLAIN, 18));

        inputField.setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 15));

        // Deigning Send Button
        sendJButton = new JButton();
        sendJButton.setFocusPainted(false);
        sendJButton.setBackground(new Color(100, 255, 100));
        sendJButton.setFont(new Font("Orbitron", Font.PLAIN, 18));
        sendJButton.setText("Send");

        inputJPanel.add(inputField, BorderLayout.CENTER);

        inputJPanel.add(sendJButton, BorderLayout.EAST);

        App.rightJPanel.add(inputJPanel, BorderLayout.SOUTH);
    }

}
