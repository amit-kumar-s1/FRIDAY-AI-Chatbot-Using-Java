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


public class settingFriday {

    static JPanel settingJPanel;
    static JPanel settingTopBannerJPanel;
    static JLabel settingHeadingJLabel;
    static  JLabel settingSubHeadingJLabel;
    static JPanel settingHeadingJPanel;
    static JButton historyJButton;
    static JButton clearAllJButton;
    static JPanel topBannerButtonJPanel;
    static JLabel messagelabel;

    ResizeImageQuality quality = new ResizeImageQuality();
    fridayInAction action = new fridayInAction();


    public void addSetting(JButton button){

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                App.rightJPanel.removeAll();
                if(App.isDarkTheme){
                    // Designing Setting Panel
                    settingJPanel = new JPanel();
                    settingJPanel.setPreferredSize(new Dimension(0, Integer.MAX_VALUE));
                    settingJPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
                    settingJPanel.setLayout(new BoxLayout(settingJPanel, BoxLayout.Y_AXIS));

                    settingJPanel.setBackground(new Color(255, 14, 6));

                    App.rightJPanel.add(settingJPanel, BorderLayout.CENTER);

                    // Designing setting Panel - Top Banner
                    settingTopBannerJPanel = new JPanel();
                    settingTopBannerJPanel.setBackground(new Color(5, 18, 8));
                    settingTopBannerJPanel.setPreferredSize(new Dimension(0, 100));
                    settingTopBannerJPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 100));
                    settingTopBannerJPanel.setLayout(new BorderLayout());

                    settingTopBannerJPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

                    settingJPanel.add(settingTopBannerJPanel);

                    // Designing Setting Panel - Heading
                    settingHeadingJLabel = new JLabel();
                    settingHeadingJLabel.setForeground(new Color(150, 255, 50));
                    settingHeadingJLabel.setFont(new Font("Orbitron", Font.BOLD, 30));
                    settingHeadingJLabel.setText("FRIDAY AI Assistant");

                    // Designing Setting Panel - SubHeading
                    settingSubHeadingJLabel = new JLabel();
                    settingSubHeadingJLabel.setForeground(new Color(170, 190, 170));
                    settingSubHeadingJLabel.setFont(new Font("Orbitron", Font.PLAIN, 14));
                    settingSubHeadingJLabel.setText("Setting");

                    // Designing Setting Heading Panel 
                    settingHeadingJPanel = new JPanel();
                    settingHeadingJPanel.setBackground(new Color(5, 18, 8));
                    settingHeadingJPanel.setPreferredSize(new Dimension(500, 100));
                    settingHeadingJPanel.setMaximumSize(new Dimension(500, Integer.MAX_VALUE));
                    settingHeadingJPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 10));
                    settingHeadingJPanel.setLayout(new BoxLayout(settingHeadingJPanel, BoxLayout.Y_AXIS));
                    
                    settingHeadingJPanel.add(settingHeadingJLabel);
                    settingHeadingJPanel.add(Box.createVerticalStrut(5));
                    settingHeadingJPanel.add(settingSubHeadingJLabel);

                    settingTopBannerJPanel.add(settingHeadingJPanel, BorderLayout.WEST);

                    // Designing Setting Top Banner button - History Button
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


                    // Designing Setting Top Banner button - Clear All Button
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

                    // Designing Setting Top Banner button Panel
                    topBannerButtonJPanel = new JPanel();
                    topBannerButtonJPanel.setBackground(new Color(5, 18, 8));
                    topBannerButtonJPanel.setPreferredSize(new Dimension(200, 100));
                    topBannerButtonJPanel.setMaximumSize(new Dimension(200, Integer.MAX_VALUE));
                    topBannerButtonJPanel.setLayout(new BoxLayout(topBannerButtonJPanel, BoxLayout.X_AXIS));

                    topBannerButtonJPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 10));
                    
                    topBannerButtonJPanel.add(historyJButton);
                    topBannerButtonJPanel.add(Box.createHorizontalStrut(20));
                    topBannerButtonJPanel.add(clearAllJButton);

                    settingTopBannerJPanel.add(topBannerButtonJPanel, BorderLayout.EAST);

                    
                    messagelabel = new JLabel();
                    messagelabel.setForeground(new Color(0, 0, 0));
                    messagelabel.setFont(new Font("Arial", Font.BOLD, 22));
                    messagelabel.setText("This is under Development!");
                    messagelabel.setAlignmentX(Component.CENTER_ALIGNMENT);

                    settingJPanel.add(Box.createVerticalGlue());
                    settingJPanel.add(messagelabel);
                    settingJPanel.add(Box.createVerticalGlue());
                    
                    App.rightJPanel.revalidate();
                    App.rightJPanel.repaint();

                }else{

                    // Designing Setting Panel
                    settingJPanel = new JPanel();
                    settingJPanel.setPreferredSize(new Dimension(0, Integer.MAX_VALUE));
                    settingJPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
                    settingJPanel.setLayout(new BoxLayout(settingJPanel, BoxLayout.Y_AXIS));

                    settingJPanel.setBackground(new Color(255, 14, 6));

                    App.rightJPanel.add(settingJPanel, BorderLayout.CENTER);

                    // Designing setting Panel - Top Banner
                    settingTopBannerJPanel = new JPanel();
                    settingTopBannerJPanel.setBackground(new Color(230, 230, 230));
                    settingTopBannerJPanel.setPreferredSize(new Dimension(0, 100));
                    settingTopBannerJPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 100));
                    settingTopBannerJPanel.setLayout(new BorderLayout());

                    settingTopBannerJPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

                    settingJPanel.add(settingTopBannerJPanel);

                    // Designing Setting Panel - Heading
                    settingHeadingJLabel = new JLabel();
                    settingHeadingJLabel.setForeground(new Color(20, 120, 40));
                    settingHeadingJLabel.setFont(new Font("Orbitron", Font.BOLD, 30));
                    settingHeadingJLabel.setText("FRIDAY AI Assistant");

                    // Designing Setting Panel - SubHeading
                    settingSubHeadingJLabel = new JLabel();
                    settingSubHeadingJLabel.setForeground(new Color(80, 80, 80));
                    settingSubHeadingJLabel.setFont(new Font("Orbitron", Font.PLAIN, 14));
                    settingSubHeadingJLabel.setText("Setting");

                    // Designing Setting Heading Panel 
                    settingHeadingJPanel = new JPanel();
                    settingHeadingJPanel.setBackground(new Color(230, 230, 230));
                    settingHeadingJPanel.setPreferredSize(new Dimension(500, 100));
                    settingHeadingJPanel.setMaximumSize(new Dimension(500, Integer.MAX_VALUE));
                    settingHeadingJPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 10));
                    settingHeadingJPanel.setLayout(new BoxLayout(settingHeadingJPanel, BoxLayout.Y_AXIS));
                    
                    settingHeadingJPanel.add(settingHeadingJLabel);
                    settingHeadingJPanel.add(Box.createVerticalStrut(5));
                    settingHeadingJPanel.add(settingSubHeadingJLabel);

                    settingTopBannerJPanel.add(settingHeadingJPanel, BorderLayout.WEST);

                    // Designing Setting Top Banner button - History Button
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


                    // Designing Setting Top Banner button - Clear All Button
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

                    // Designing Setting Top Banner button Panel
                    topBannerButtonJPanel = new JPanel();
                    topBannerButtonJPanel.setBackground(new Color(230, 230,230));
                    topBannerButtonJPanel.setPreferredSize(new Dimension(200, 100));
                    topBannerButtonJPanel.setMaximumSize(new Dimension(200, Integer.MAX_VALUE));
                    topBannerButtonJPanel.setLayout(new BoxLayout(topBannerButtonJPanel, BoxLayout.X_AXIS));

                    topBannerButtonJPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 10));
                    
                    topBannerButtonJPanel.add(historyJButton);
                    topBannerButtonJPanel.add(Box.createHorizontalStrut(20));
                    topBannerButtonJPanel.add(clearAllJButton);

                    settingTopBannerJPanel.add(topBannerButtonJPanel, BorderLayout.EAST);

                    
                    messagelabel = new JLabel();
                    messagelabel.setForeground(new Color(0, 0, 0));
                    messagelabel.setFont(new Font("Arial", Font.BOLD, 22));
                    messagelabel.setText("This is under Development!");
                    messagelabel.setAlignmentX(Component.CENTER_ALIGNMENT);

                    settingJPanel.add(Box.createVerticalGlue());
                    settingJPanel.add(messagelabel);
                    settingJPanel.add(Box.createVerticalGlue());
                    
                    App.rightJPanel.revalidate();
                    App.rightJPanel.repaint();
                }
                    
                
            }
        });

       

        



    }
}

