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


public class CalculatorFriday {

    static JPanel calculatorJPanel;
    static JPanel calculatorTopBannerJPanel;
    static JLabel calculatorHeadingJLabel;
    static JLabel calculatorSubHeadingJLabel; 
    static JPanel calculatorHeadingJPanel; 
    static JButton historyJButton;
    static JButton clearAllJButton;
    static JPanel topBannerButtonJPanel;
    static JLabel messagelabel;

    ResizeImageQuality quality = new ResizeImageQuality();
    fridayInAction action = new fridayInAction();


    public void addCalculator(JButton button){

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                App.rightJPanel.removeAll();

                if(App.isDarkTheme){
                    // Designing calculator Panel
                    calculatorJPanel = new JPanel();
                    calculatorJPanel.setPreferredSize(new Dimension(0, Integer.MAX_VALUE));
                    calculatorJPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
                    calculatorJPanel.setLayout(new BoxLayout(calculatorJPanel, BoxLayout.Y_AXIS));

                    calculatorJPanel.setBackground(new Color(255, 14, 6));

                    App.rightJPanel.add(calculatorJPanel, BorderLayout.CENTER);

                    // Designing Calculator Panel - Top Banner
                    calculatorTopBannerJPanel = new JPanel();
                    calculatorTopBannerJPanel.setBackground(new Color(5, 18, 8));
                    calculatorTopBannerJPanel.setPreferredSize(new Dimension(0, 100));
                    calculatorTopBannerJPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 100));
                    calculatorTopBannerJPanel.setLayout(new BorderLayout());

                    calculatorTopBannerJPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

                    calculatorJPanel.add(calculatorTopBannerJPanel);

                    // Designing Calculator Panel - Heading
                    calculatorHeadingJLabel = new JLabel();
                    calculatorHeadingJLabel.setForeground(new Color(150, 255, 50));
                    calculatorHeadingJLabel.setFont(new Font("Orbitron", Font.BOLD, 30));
                    calculatorHeadingJLabel.setText("FRIDAY AI Assistant");

                    // Designing Calculator Panel - SubHeading
                    calculatorSubHeadingJLabel = new JLabel();
                    calculatorSubHeadingJLabel.setForeground(new Color(170, 190, 170));
                    calculatorSubHeadingJLabel.setFont(new Font("Orbitron", Font.PLAIN, 14));
                    calculatorSubHeadingJLabel.setText("Calculator");

                    // Designing Calculator Heading Panel 
                    calculatorHeadingJPanel = new JPanel();
                    calculatorHeadingJPanel.setBackground(new Color(5, 18, 8));
                    calculatorHeadingJPanel.setPreferredSize(new Dimension(500, 100));
                    calculatorHeadingJPanel.setMaximumSize(new Dimension(500, Integer.MAX_VALUE));
                    calculatorHeadingJPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 10));
                    calculatorHeadingJPanel.setLayout(new BoxLayout(calculatorHeadingJPanel, BoxLayout.Y_AXIS));
                    
                    calculatorHeadingJPanel.add(calculatorHeadingJLabel);
                    calculatorHeadingJPanel.add(Box.createVerticalStrut(5));
                    calculatorHeadingJPanel.add(calculatorSubHeadingJLabel);

                    calculatorTopBannerJPanel.add(calculatorHeadingJPanel, BorderLayout.WEST);

                    // Designing Calculator Top Banner button - History Button
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


                    // Designing Calculator Top Banner button - Clear All Button
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

                    // Designing Calculator Top Banner button Panel
                    topBannerButtonJPanel = new JPanel();
                    topBannerButtonJPanel.setBackground(new Color(5, 18, 8));
                    topBannerButtonJPanel.setPreferredSize(new Dimension(200, 100));
                    topBannerButtonJPanel.setMaximumSize(new Dimension(200, Integer.MAX_VALUE));
                    topBannerButtonJPanel.setLayout(new BoxLayout(topBannerButtonJPanel, BoxLayout.X_AXIS));

                    topBannerButtonJPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 10));
                    
                    topBannerButtonJPanel.add(historyJButton);
                    topBannerButtonJPanel.add(Box.createHorizontalStrut(20));
                    topBannerButtonJPanel.add(clearAllJButton);

                    calculatorTopBannerJPanel.add(topBannerButtonJPanel, BorderLayout.EAST);

                    
                    messagelabel = new JLabel();
                    messagelabel.setForeground(new Color(0, 0, 0));
                    messagelabel.setFont(new Font("Arial", Font.BOLD, 22));
                    messagelabel.setText("This is under Development!");
                    messagelabel.setAlignmentX(Component.CENTER_ALIGNMENT);

                    calculatorJPanel.add(Box.createVerticalGlue());
                    calculatorJPanel.add(messagelabel);
                    calculatorJPanel.add(Box.createVerticalGlue());
                    
                    App.rightJPanel.revalidate();
                    App.rightJPanel.repaint();
                }else{
                    // Designing calculator Panel
                    calculatorJPanel = new JPanel();
                    calculatorJPanel.setPreferredSize(new Dimension(0, Integer.MAX_VALUE));
                    calculatorJPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
                    calculatorJPanel.setLayout(new BoxLayout(calculatorJPanel, BoxLayout.Y_AXIS));

                    calculatorJPanel.setBackground(new Color(255, 14, 6));

                    App.rightJPanel.add(calculatorJPanel, BorderLayout.CENTER);

                    // Designing Calculator Panel - Top Banner
                    calculatorTopBannerJPanel = new JPanel();
                    calculatorTopBannerJPanel.setBackground(new Color(230, 230, 230));
                    calculatorTopBannerJPanel.setPreferredSize(new Dimension(0, 100));
                    calculatorTopBannerJPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 100));
                    calculatorTopBannerJPanel.setLayout(new BorderLayout());

                    calculatorTopBannerJPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

                    calculatorJPanel.add(calculatorTopBannerJPanel);

                    // Designing Calculator Panel - Heading
                    calculatorHeadingJLabel = new JLabel();
                    calculatorHeadingJLabel.setForeground(new Color(20, 120, 40));
                    calculatorHeadingJLabel.setFont(new Font("Orbitron", Font.BOLD, 30));
                    calculatorHeadingJLabel.setText("FRIDAY AI Assistant");

                    // Designing Calculator Panel - SubHeading
                    calculatorSubHeadingJLabel = new JLabel();
                    calculatorSubHeadingJLabel.setForeground(new Color(80, 80, 80));
                    calculatorSubHeadingJLabel.setFont(new Font("Orbitron", Font.PLAIN, 14));
                    calculatorSubHeadingJLabel.setText("Calculator");

                    // Designing Calculator Heading Panel 
                    calculatorHeadingJPanel = new JPanel();
                    calculatorHeadingJPanel.setBackground(new Color(230, 230, 230));
                    calculatorHeadingJPanel.setPreferredSize(new Dimension(500, 100));
                    calculatorHeadingJPanel.setMaximumSize(new Dimension(500, Integer.MAX_VALUE));
                    calculatorHeadingJPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 10));
                    calculatorHeadingJPanel.setLayout(new BoxLayout(calculatorHeadingJPanel, BoxLayout.Y_AXIS));
                    
                    calculatorHeadingJPanel.add(calculatorHeadingJLabel);
                    calculatorHeadingJPanel.add(Box.createVerticalStrut(5));
                    calculatorHeadingJPanel.add(calculatorSubHeadingJLabel);

                    calculatorTopBannerJPanel.add(calculatorHeadingJPanel, BorderLayout.WEST);

                    // Designing Calculator Top Banner button - History Button
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


                    // Designing Calculator Top Banner button - Clear All Button
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

                    // Designing Calculator Top Banner button Panel
                    topBannerButtonJPanel = new JPanel();
                    topBannerButtonJPanel.setBackground(new Color(230, 230, 230));
                    topBannerButtonJPanel.setPreferredSize(new Dimension(200, 100));
                    topBannerButtonJPanel.setMaximumSize(new Dimension(200, Integer.MAX_VALUE));
                    topBannerButtonJPanel.setLayout(new BoxLayout(topBannerButtonJPanel, BoxLayout.X_AXIS));

                    topBannerButtonJPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 10));
                    
                    topBannerButtonJPanel.add(historyJButton);
                    topBannerButtonJPanel.add(Box.createHorizontalStrut(20));
                    topBannerButtonJPanel.add(clearAllJButton);

                    calculatorTopBannerJPanel.add(topBannerButtonJPanel, BorderLayout.EAST);

                    
                    messagelabel = new JLabel();
                    messagelabel.setForeground(new Color(0, 0, 0));
                    messagelabel.setFont(new Font("Arial", Font.BOLD, 22));
                    messagelabel.setText("This is under Development!");
                    messagelabel.setAlignmentX(Component.CENTER_ALIGNMENT);

                    calculatorJPanel.add(Box.createVerticalGlue());
                    calculatorJPanel.add(messagelabel);
                    calculatorJPanel.add(Box.createVerticalGlue());
                    
                    App.rightJPanel.revalidate();
                    App.rightJPanel.repaint();
                }

                
            }
        });

       

        



    }
}
