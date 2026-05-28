import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Image;


public class helpFriday {

    static JPanel helpJPanel;
    static JPanel helpTopBannerJPanel;
    static JLabel helpHeadingJLabel;
    static JLabel helpSubHeadingJLabel;
    static JPanel helpHeadingJPanel;
    static JButton historyJButton;
    static JButton clearAllJButton;
    static JPanel topBannerButtonJPanel;
    static JLabel messagelabel;

    ResizeImageQuality quality = new ResizeImageQuality();
    fridayInAction action = new fridayInAction();


    public void addHelp(JButton button){

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                App.rightJPanel.removeAll();
                if(App.isDarkTheme){
                    
                    // Designing Help Panel
                    helpJPanel = new JPanel();
                    helpJPanel.setPreferredSize(new Dimension(0, Integer.MAX_VALUE));
                    helpJPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
                    helpJPanel.setLayout(new BoxLayout(helpJPanel, BoxLayout.Y_AXIS));

                    helpJPanel.setBackground(new Color(255, 14, 6));

                    App.rightJPanel.add(helpJPanel, BorderLayout.CENTER);

                    // Designing Calculator Panel - Top Banner
                    helpTopBannerJPanel = new JPanel();
                    helpTopBannerJPanel.setBackground(new Color(5, 18, 8));
                    helpTopBannerJPanel.setPreferredSize(new Dimension(0, 100));
                    helpTopBannerJPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 100));
                    helpTopBannerJPanel.setLayout(new BorderLayout());

                    helpTopBannerJPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

                    helpJPanel.add(helpTopBannerJPanel);

                    // Designing Help Panel - Heading
                    helpHeadingJLabel = new JLabel();
                    helpHeadingJLabel.setForeground(new Color(150, 255, 50));
                    helpHeadingJLabel.setFont(new Font("Orbitron", Font.BOLD, 30));
                    helpHeadingJLabel.setText("FRIDAY AI Assistant");

                    // Designing Help Panel - SubHeading
                    helpSubHeadingJLabel = new JLabel();
                    helpSubHeadingJLabel.setForeground(new Color(170, 190, 170));
                    helpSubHeadingJLabel.setFont(new Font("Orbitron", Font.PLAIN, 14));
                    helpSubHeadingJLabel.setText("Help");

                    // Designing Help Heading Panel 
                    helpHeadingJPanel = new JPanel();
                    helpHeadingJPanel.setBackground(new Color(5, 18, 8));
                    helpHeadingJPanel.setPreferredSize(new Dimension(500, 100));
                    helpHeadingJPanel.setMaximumSize(new Dimension(500, Integer.MAX_VALUE));
                    helpHeadingJPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 10));
                    helpHeadingJPanel.setLayout(new BoxLayout(helpHeadingJPanel, BoxLayout.Y_AXIS));
                    
                    helpHeadingJPanel.add(helpHeadingJLabel);
                    helpHeadingJPanel.add(Box.createVerticalStrut(5));
                    helpHeadingJPanel.add(helpSubHeadingJLabel);

                    helpTopBannerJPanel.add(helpHeadingJPanel, BorderLayout.WEST);

                    // Designing help Top Banner button - History Button
                    historyJButton = new JButton();
                    historyJButton.setContentAreaFilled(false);
                    historyJButton.setOpaque(false);
                    historyJButton.setFocusPainted(false);
                    historyJButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

                    historyJButton.setPreferredSize(new Dimension(40, 40));
                    historyJButton.setMaximumSize(new Dimension(40, 40));
                    historyJButton.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(new Color(100,255,100), 2, true), BorderFactory.createEmptyBorder(10, 10, 10, 10)));

                    ImageIcon historyImageIcon = new ImageIcon("Resources/history.png");
                    Image historyImage = historyImageIcon.getImage();
                    Image finalhistory = quality.highQuality(historyImage, 30, 30);
                    historyJButton.setIcon(new ImageIcon(finalhistory));


                    // Designing help Top Banner button - Clear All Button
                    clearAllJButton = new JButton();
                    clearAllJButton.setContentAreaFilled(false);
                    clearAllJButton.setOpaque(false);
                    clearAllJButton.setFocusPainted(false);
                    clearAllJButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

                    clearAllJButton.setPreferredSize(new Dimension(40, 40));
                    clearAllJButton.setMaximumSize(new Dimension(40, 40));
                    clearAllJButton.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(new Color(100,255,100), 2, true), BorderFactory.createEmptyBorder(10, 10, 10, 10)));

                    ImageIcon clearAllImageIcon = new ImageIcon("Resources/delete.png");
                    Image clearAllImage = clearAllImageIcon.getImage();
                    Image finalClearAll = quality.highQuality(clearAllImage, 30, 30);
                    clearAllJButton.setIcon(new ImageIcon(finalClearAll));

                    // Designing help Top Banner button Panel
                    topBannerButtonJPanel = new JPanel();
                    topBannerButtonJPanel.setBackground(new Color(5, 18, 8));
                    topBannerButtonJPanel.setPreferredSize(new Dimension(200, 100));
                    topBannerButtonJPanel.setMaximumSize(new Dimension(200, Integer.MAX_VALUE));
                    topBannerButtonJPanel.setLayout(new BoxLayout(topBannerButtonJPanel, BoxLayout.X_AXIS));

                    topBannerButtonJPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 10));
                    
                    topBannerButtonJPanel.add(historyJButton);
                    topBannerButtonJPanel.add(Box.createHorizontalStrut(20));
                    topBannerButtonJPanel.add(clearAllJButton);

                    helpTopBannerJPanel.add(topBannerButtonJPanel, BorderLayout.EAST);

                    
                    messagelabel = new JLabel();
                    messagelabel.setForeground(new Color(0, 0, 0));
                    messagelabel.setFont(new Font("Arial", Font.BOLD, 22));
                    messagelabel.setText("This is under Development!");
                    messagelabel.setAlignmentX(Component.CENTER_ALIGNMENT);

                    helpJPanel.add(Box.createVerticalGlue());
                    helpJPanel.add(messagelabel);
                    helpJPanel.add(Box.createVerticalGlue());
                    
                    App.rightJPanel.revalidate();
                    App.rightJPanel.repaint();
                }else{
                    
                    // Designing Help Panel
                    helpJPanel = new JPanel();
                    helpJPanel.setPreferredSize(new Dimension(0, Integer.MAX_VALUE));
                    helpJPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
                    helpJPanel.setLayout(new BoxLayout(helpJPanel, BoxLayout.Y_AXIS));

                    helpJPanel.setBackground(new Color(255, 14, 6));

                    App.rightJPanel.add(helpJPanel, BorderLayout.CENTER);

                    // Designing Calculator Panel - Top Banner
                    helpTopBannerJPanel = new JPanel();
                    helpTopBannerJPanel.setBackground(new Color(230, 230, 230));
                    helpTopBannerJPanel.setPreferredSize(new Dimension(0, 100));
                    helpTopBannerJPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 100));
                    helpTopBannerJPanel.setLayout(new BorderLayout());

                    helpTopBannerJPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

                    helpJPanel.add(helpTopBannerJPanel);

                    // Designing Help Panel - Heading
                    helpHeadingJLabel = new JLabel();
                    helpHeadingJLabel.setForeground(new Color(20, 120, 40));
                    helpHeadingJLabel.setFont(new Font("Orbitron", Font.BOLD, 30));
                    helpHeadingJLabel.setText("FRIDAY AI Assistant");

                    // Designing Help Panel - SubHeading
                    helpSubHeadingJLabel = new JLabel();
                    helpSubHeadingJLabel.setForeground(new Color(80, 80, 80));
                    helpSubHeadingJLabel.setFont(new Font("Orbitron", Font.PLAIN, 14));
                    helpSubHeadingJLabel.setText("Help");

                    // Designing Help Heading Panel 
                    helpHeadingJPanel = new JPanel();
                    helpHeadingJPanel.setBackground(new Color(230, 230, 230));
                    helpHeadingJPanel.setPreferredSize(new Dimension(500, 100));
                    helpHeadingJPanel.setMaximumSize(new Dimension(500, Integer.MAX_VALUE));
                    helpHeadingJPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 10));
                    helpHeadingJPanel.setLayout(new BoxLayout(helpHeadingJPanel, BoxLayout.Y_AXIS));
                    
                    helpHeadingJPanel.add(helpHeadingJLabel);
                    helpHeadingJPanel.add(Box.createVerticalStrut(5));
                    helpHeadingJPanel.add(helpSubHeadingJLabel);

                    helpTopBannerJPanel.add(helpHeadingJPanel, BorderLayout.WEST);

                    // Designing help Top Banner button - History Button
                    historyJButton = new JButton();
                    historyJButton.setContentAreaFilled(false);
                    historyJButton.setOpaque(false);
                    historyJButton.setFocusPainted(false);
                    historyJButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

                    historyJButton.setPreferredSize(new Dimension(40, 40));
                    historyJButton.setMaximumSize(new Dimension(40, 40));
                    historyJButton.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(new Color(100,255,100), 2, true), BorderFactory.createEmptyBorder(10, 10, 10, 10)));

                    ImageIcon historyImageIcon = new ImageIcon("Resources/history.png");
                    Image historyImage = historyImageIcon.getImage();
                    Image finalhistory = quality.highQuality(historyImage, 30, 30);
                    historyJButton.setIcon(new ImageIcon(finalhistory));


                    // Designing help Top Banner button - Clear All Button
                    clearAllJButton = new JButton();
                    clearAllJButton.setContentAreaFilled(false);
                    clearAllJButton.setOpaque(false);
                    clearAllJButton.setFocusPainted(false);
                    clearAllJButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

                    clearAllJButton.setPreferredSize(new Dimension(40, 40));
                    clearAllJButton.setMaximumSize(new Dimension(40, 40));
                    clearAllJButton.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(new Color(100,255,100), 2, true), BorderFactory.createEmptyBorder(10, 10, 10, 10)));

                    ImageIcon clearAllImageIcon = new ImageIcon("Resources/delete.png");
                    Image clearAllImage = clearAllImageIcon.getImage();
                    Image finalClearAll = quality.highQuality(clearAllImage, 30, 30);
                    clearAllJButton.setIcon(new ImageIcon(finalClearAll));

                    // Designing help Top Banner button Panel
                    topBannerButtonJPanel = new JPanel();
                    topBannerButtonJPanel.setBackground(new Color(230, 230, 230));
                    topBannerButtonJPanel.setPreferredSize(new Dimension(200, 100));
                    topBannerButtonJPanel.setMaximumSize(new Dimension(200, Integer.MAX_VALUE));
                    topBannerButtonJPanel.setLayout(new BoxLayout(topBannerButtonJPanel, BoxLayout.X_AXIS));

                    topBannerButtonJPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 10));
                    
                    topBannerButtonJPanel.add(historyJButton);
                    topBannerButtonJPanel.add(Box.createHorizontalStrut(20));
                    topBannerButtonJPanel.add(clearAllJButton);

                    helpTopBannerJPanel.add(topBannerButtonJPanel, BorderLayout.EAST);

                    
                    messagelabel = new JLabel();
                    messagelabel.setForeground(new Color(0, 0, 0));
                    messagelabel.setFont(new Font("Arial", Font.BOLD, 22));
                    messagelabel.setText("This is under Development!");
                    messagelabel.setAlignmentX(Component.CENTER_ALIGNMENT);

                    helpJPanel.add(Box.createVerticalGlue());
                    helpJPanel.add(messagelabel);
                    helpJPanel.add(Box.createVerticalGlue());
                    
                    App.rightJPanel.revalidate();
                    App.rightJPanel.repaint();
                }
            }
        });
            
    }
}

