
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.formdev.flatlaf.FlatDarkLaf;


public class App {

    
    static JFrame frame; 
    static JPanel leftJPanel;
    static JPanel rightJPanel;
    static JPanel mainChatPanel;
    static JPanel sidebar;
    static JPanel topBanner;
    static JPanel headingPanel;
    static JPanel navigationBar;
    static JPanel downNavigationBar;
    static JPanel logoJPanel;
    static JLabel headingJLabel;
    static JLabel subHeadingJLabel;
    static JLabel onlineJLabel;
    static JSeparator line;
    static JButton newJButton;
    static JButton calculatorJButton;
    static JButton settingJButton;
    static JButton helpJButton;
    static JButton exitJButton;
    static JSeparator line2;
    static JLabel quickJLabel;
    static JButton quick1JButton;
    static JButton quick2JButton;
    static JButton quick3JButton;
    static JButton quick4JButton;
    static JPanel TopRightBannerJPannel;
    static JLabel rightHeadingJLabel;
    static JLabel rightSubHeadingJLabel;
    static JPanel rightHeadingJPanel;
    static JPanel buttonJPanel;
    static JButton themeJButton;
    static JButton deleteJButton;
    static JPanel messageJPanel;
    static JScrollPane scrollPane;
    static JPanel inputJPanel;
    static JTextField inputField;
    static JButton sendJButton;    
    
    static Boolean isDarkTheme = true;
    static Boolean isNewChat = true;
    static Boolean isMainPanel = true;

    public static void main(String[] args) throws Exception {

        FlatDarkLaf.setup();

        System.setProperty("awt.useSystemAAFontSettings", "on");
        System.setProperty("swing.aatext", "true");


        HoverMouseEffect hover = new HoverMouseEffect();
        fridayInAction action = new fridayInAction();
        CalculatorFriday calculator = new CalculatorFriday();
        settingFriday setting = new settingFriday();
        helpFriday help = new helpFriday();
        

        ResizeImageQuality quality = new ResizeImageQuality();
        frame = new JFrame();

        // Main Components of FRIDAY - INTERFACE
        leftJPanel = new JPanel();
        rightJPanel = new JPanel();

        leftJPanel.setBackground(new Color(5, 18, 8));
        leftJPanel.setPreferredSize(new Dimension(300, 500));
        leftJPanel.setLayout(new BoxLayout(leftJPanel, BoxLayout.Y_AXIS));

        rightJPanel.setBackground(new Color(3, 14, 6));
        rightJPanel.setPreferredSize(new Dimension(450,500));
        rightJPanel.setLayout(new BorderLayout());
    

        topBanner = new JPanel();
        topBanner.setBackground(new Color(5, 18, 8));
        topBanner.setPreferredSize(new Dimension(250, 0));
        topBanner.setLayout(new BorderLayout());
        topBanner.setAlignmentX(Component.LEFT_ALIGNMENT);

        leftJPanel.add(topBanner);

        headingPanel = new JPanel();
        headingPanel.setBackground(new Color(5, 18, 8));
        headingPanel.setPreferredSize(new Dimension(200, 0));
        headingPanel.setLayout(new BoxLayout(headingPanel, BoxLayout.Y_AXIS));

        topBanner.add(headingPanel, BorderLayout.EAST);
        

        // Designing Center - Navigation Bar
        navigationBar = new JPanel();
        navigationBar.setBackground(new Color(5, 18, 8));
        navigationBar.setPreferredSize(new Dimension(0,350));
        navigationBar.setMaximumSize(new Dimension(Integer.MAX_VALUE, 350));
        navigationBar.setAlignmentX(Component.LEFT_ALIGNMENT);

        navigationBar.setLayout(new BoxLayout(navigationBar, BoxLayout.Y_AXIS));
        leftJPanel.add(navigationBar);


        // Designing Down - Navigation Bar
        downNavigationBar = new JPanel();
        downNavigationBar.setBackground(new Color(5, 18, 8));
        downNavigationBar.setPreferredSize(new Dimension(0,250));
        downNavigationBar.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
        downNavigationBar.setLayout(new BoxLayout(downNavigationBar, BoxLayout.Y_AXIS));
        downNavigationBar.setAlignmentX(Component.LEFT_ALIGNMENT);

        leftJPanel.add(downNavigationBar);

        // // Designing TopBanner - Components
       
        // Designing Logo of Topbanner
        JLabel mainLogoJLabel = new JLabel();
        ImageIcon mainLogo = new ImageIcon(App.class.getResource("Resources/Friday.png"));
        Image mainImage = mainLogo.getImage();
        Image FinalMainLogo = quality.highQuality(mainImage, 70, 70);
        mainLogoJLabel.setIcon(new ImageIcon(FinalMainLogo));

        logoJPanel = new JPanel();
        logoJPanel.setBackground(new Color(5, 18, 8));
        logoJPanel.setPreferredSize(new Dimension(90,90));
        logoJPanel.setBorder(BorderFactory.createEmptyBorder(19, 10, 0, 0));
        logoJPanel.add(mainLogoJLabel);

        topBanner.add(logoJPanel, BorderLayout.WEST);


        // Designing heading of TopBanner
        headingJLabel = new JLabel();
        headingJLabel.setForeground(new Color(150, 255, 50));
        headingJLabel.setFont(new Font("Orbitron", Font.BOLD, 30));
        headingJLabel.setText("<html>FRIDAY</html>"); 
        headingJLabel.setBorder(BorderFactory.createEmptyBorder(19, 10, 0, 0));

        headingPanel.add(headingJLabel);

        subHeadingJLabel = new JLabel();
        subHeadingJLabel.setForeground(new Color(170, 190, 170));
        subHeadingJLabel.setFont(new Font("Orbitron", Font.PLAIN, 14));
        subHeadingJLabel.setText("<html>Your Virtual Assistant</html>"); 
        subHeadingJLabel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));

        headingPanel.add(subHeadingJLabel);

        onlineJLabel = new JLabel();
        onlineJLabel.setForeground(new Color(0,255,80));
        onlineJLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        onlineJLabel.setText("<html>● Online</html>"); 
        onlineJLabel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));

        headingPanel.add(onlineJLabel);

        // Designing Line Separator

        line = new JSeparator();

        line.setForeground(new Color(150,150,150,60));
        line.setPreferredSize(new Dimension(0,1));
        line.setMaximumSize(new Dimension(Integer.MAX_VALUE,1));
        line.setAlignmentX(Component.LEFT_ALIGNMENT);

        topBanner.add(line, BorderLayout.SOUTH);


        // Desiging New Chat Button
        newJButton = new JButton();
        newJButton.setOpaque(true);
        newJButton.setBorderPainted(false);
        newJButton.setFocusPainted(false);
        newJButton.setContentAreaFilled(true);

        newJButton.setForeground(new Color(245, 255,255));
        newJButton.setFont(new Font("Orbitron", Font.BOLD, 20));
        newJButton.setPreferredSize(new Dimension(300,80));
        newJButton.setMaximumSize(new Dimension(Integer.MAX_VALUE, 80));
        newJButton.setText("New Chat");
        newJButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        hover.hoverEffect(newJButton);
        newJButton.setHorizontalAlignment(SwingConstants.LEFT);
        newJButton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 10));
        navigationBar.add(newJButton);

        //Designing Calculator button
        calculatorJButton = new JButton();
        calculatorJButton.setOpaque(true);
        calculatorJButton.setBorderPainted(false);
        calculatorJButton.setFocusPainted(false);
        calculatorJButton.setContentAreaFilled(true);

        calculatorJButton.setForeground(new Color(245, 255,255));
        calculatorJButton.setFont(new Font("Orbitron", Font.BOLD, 20));
        calculatorJButton.setPreferredSize(new Dimension(300,80));
        calculatorJButton.setMaximumSize(new Dimension(Integer.MAX_VALUE, 80));
        calculatorJButton.setText("Calculator");
        calculatorJButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        hover.hoverEffect(calculatorJButton);
        calculatorJButton.setHorizontalAlignment(SwingConstants.LEFT);
        calculatorJButton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 10));
        navigationBar.add(Box.createVerticalStrut(10));
        navigationBar.add(calculatorJButton);

        //Designing Setting Button
        settingJButton = new JButton();
        settingJButton.setOpaque(true);
        settingJButton.setBorderPainted(false);
        settingJButton.setFocusPainted(false);
        settingJButton.setContentAreaFilled(true);

        settingJButton.setForeground(new Color(245, 255,255));
        settingJButton.setFont(new Font("Orbitron", Font.BOLD, 20));
        settingJButton.setPreferredSize(new Dimension(300,80));
        settingJButton.setMaximumSize(new Dimension(Integer.MAX_VALUE, 80));
        settingJButton.setText("Setting");
        settingJButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        hover.hoverEffect(settingJButton);

        settingJButton.setHorizontalAlignment(SwingConstants.LEFT);
        settingJButton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 10));
        navigationBar.add(Box.createVerticalStrut(10));
        navigationBar.add(settingJButton);

        // Designing Help Button
        helpJButton = new JButton();
        helpJButton.setOpaque(true);
        helpJButton.setBorderPainted(false);
        helpJButton.setFocusPainted(false);
        helpJButton.setContentAreaFilled(true);

        helpJButton.setForeground(new Color(245, 255,255));
        helpJButton.setFont(new Font("Orbitron", Font.BOLD, 20));
        helpJButton.setPreferredSize(new Dimension(300,80));
        helpJButton.setMaximumSize(new Dimension(Integer.MAX_VALUE, 80));
        helpJButton.setText("Help");
        helpJButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        hover.hoverEffect(helpJButton);

        helpJButton.setHorizontalAlignment(SwingConstants.LEFT);
        helpJButton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 10));
        navigationBar.add(Box.createVerticalStrut(10));
        navigationBar.add(helpJButton);

        // Designing Exit button
        exitJButton = new JButton();
        exitJButton.setOpaque(true);
        exitJButton.setBorderPainted(false);
        exitJButton.setFocusPainted(false);
        exitJButton.setContentAreaFilled(true);

        exitJButton.setForeground(new Color(245, 255,255));
        exitJButton.setFont(new Font("Orbitron", Font.BOLD, 20));
        exitJButton.setPreferredSize(new Dimension(300,80));
        exitJButton.setMaximumSize(new Dimension(Integer.MAX_VALUE, 80));
        exitJButton.setText("Exit");
        exitJButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        hover.hoverEffect(exitJButton);

        exitJButton.setHorizontalAlignment(SwingConstants.LEFT);
        exitJButton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 10));
        navigationBar.add(Box.createVerticalStrut(10));
        navigationBar.add(exitJButton);

        // Separator between middle and down navigation Bar

        line2 = new JSeparator();

        line2.setForeground(new Color(150,150,150,60));
        line2.setPreferredSize(new Dimension(0,1));
        line2.setMaximumSize(new Dimension(Integer.MAX_VALUE,1));
        line2.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        navigationBar.add(Box.createVerticalStrut(10));
        navigationBar.add(line2);

        // Design Down - Quick Action 
        quickJLabel = new JLabel();
        quickJLabel.setForeground(new Color(150, 255, 50));
        quickJLabel.setFont(new Font("Orbitron", Font.PLAIN, 20));
        quickJLabel.setText("Quick Action");
        quickJLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        quickJLabel.setBorder(BorderFactory.createEmptyBorder(20, 40, 0, 0));
        downNavigationBar.add(quickJLabel);

        //Designing Quick Action - What's the time?
        quick1JButton = new JButton();
        quick1JButton.setOpaque(true);
        quick1JButton.setBorderPainted(false);
        quick1JButton.setFocusPainted(false);

        quick1JButton.setBackground(new Color(40, 80, 10));
        quick1JButton.setForeground(new Color(245, 255,255));
        quick1JButton.setFont(new Font("Orbitron", Font.PLAIN, 15));
        quick1JButton.setPreferredSize(new Dimension(300,40));
        quick1JButton.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));
        quick1JButton.setText("What's the time?");
        quick1JButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        hover.hoverEffect(quick1JButton);

        quick1JButton.setHorizontalAlignment(SwingConstants.LEFT);
        quick1JButton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 10));
        downNavigationBar.add(Box.createVerticalStrut(10));
        downNavigationBar.add(quick1JButton);

        //Designing Quick Action - Weather Report
        quick2JButton = new JButton();
        quick2JButton.setOpaque(true);
        quick2JButton.setBorderPainted(false);
        quick2JButton.setFocusPainted(false);

        quick2JButton.setBackground(new Color(40, 80, 10));
        quick2JButton.setForeground(new Color(245, 255,255));
        quick2JButton.setFont(new Font("Orbitron", Font.PLAIN, 15));
        quick2JButton.setPreferredSize(new Dimension(300,40));
        quick2JButton.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));
        quick2JButton.setText("Current Weather Report");
        quick2JButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        hover.hoverEffect(quick2JButton);

        quick2JButton.setHorizontalAlignment(SwingConstants.LEFT);
        quick2JButton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 10));
        downNavigationBar.add(Box.createVerticalStrut(10));
        downNavigationBar.add(quick2JButton);

        //Designing Quick Action - Do Calculation
        quick3JButton = new JButton();
        quick3JButton.setOpaque(true);
        quick3JButton.setBorderPainted(false);
        quick3JButton.setFocusPainted(false);

        quick3JButton.setBackground(new Color(40, 80, 10));
        quick3JButton.setForeground(new Color(245, 255,255));
        quick3JButton.setFont(new Font("Orbitron", Font.PLAIN, 15));
        quick3JButton.setPreferredSize(new Dimension(300,40));
        quick3JButton.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));
        quick3JButton.setText("Do Calculation");
        quick3JButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        hover.hoverEffect(quick3JButton);

        quick3JButton.setHorizontalAlignment(SwingConstants.LEFT);
        quick3JButton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 10));
        downNavigationBar.add(Box.createVerticalStrut(10));
        downNavigationBar.add(quick3JButton);


        //Designing Quick Action - Tell me a joke
        quick4JButton = new JButton();
        quick4JButton.setOpaque(true);
        quick4JButton.setBorderPainted(false);
        quick4JButton.setFocusPainted(false);

        quick4JButton.setBackground(new Color(40, 80, 10));
        quick4JButton.setForeground(new Color(245, 255,255));
        quick4JButton.setFont(new Font("Orbitron", Font.PLAIN, 15));
        quick4JButton.setPreferredSize(new Dimension(300,40));
        quick4JButton.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));
        quick4JButton.setText("Tell me a joke");
        quick4JButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        hover.hoverEffect(quick4JButton);

        quick4JButton.setHorizontalAlignment(SwingConstants.LEFT);
        quick4JButton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 10));
        downNavigationBar.add(Box.createVerticalStrut(10));
        downNavigationBar.add(quick4JButton);

        // Right Panel - Designing
        // main chat Panel 
        mainChatPanel = new JPanel();
        mainChatPanel.setBackground(new Color(3, 14, 6));
        mainChatPanel.setLayout(new BorderLayout());

        rightJPanel.add(mainChatPanel, BorderLayout.CENTER);
        


        //Designing TopRightBanner
        TopRightBannerJPannel = new JPanel();
        TopRightBannerJPannel.setBackground(new Color(5, 18, 8));
        TopRightBannerJPannel.setPreferredSize(new Dimension(0,100));
        TopRightBannerJPannel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 100));
        TopRightBannerJPannel.setLayout(new BorderLayout());
        
        TopRightBannerJPannel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        mainChatPanel.add(TopRightBannerJPannel, BorderLayout.NORTH);

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
        themeJButton.setContentAreaFilled(true);
        themeJButton.setOpaque(true);
        themeJButton.setFocusPainted(false);

        themeJButton.setPreferredSize(new Dimension(40,40));
        themeJButton.setMaximumSize(new Dimension(40,40));
        themeJButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        themeJButton.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(new Color(100,255,100),2,true), BorderFactory.createEmptyBorder(5,5,5,5 )));

        ImageIcon theme = new ImageIcon(App.class.getResource("/Resources/Theme.png"));
        Image themeImage = theme.getImage();
        Image finalTheme = quality.highQuality(themeImage, 40, 40);

        themeJButton.setIcon(new ImageIcon(finalTheme));

        buttonJPanel.add(themeJButton);

        // Desiging RightPanel Button - Delete Button
        deleteJButton = new JButton();
        deleteJButton.setContentAreaFilled(true);
        deleteJButton.setOpaque(true);
        deleteJButton.setFocusPainted(false);

        deleteJButton.setPreferredSize(new Dimension(40,40));
        deleteJButton.setMaximumSize(new Dimension(40,40));
        deleteJButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        deleteJButton.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(new Color(100,255,100),2,true), BorderFactory.createEmptyBorder(5,5,5,5 )));

        ImageIcon delete = new ImageIcon(App.class.getResource("/Resources/Delete.png"));
        Image deleteImage = delete.getImage();
        Image finalDelete = quality.highQuality(deleteImage, 40, 40);

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
        mainChatPanel.add(scrollPane, BorderLayout.CENTER);

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

        mainChatPanel.add(inputJPanel, BorderLayout.SOUTH);


        // Send Button Action 
        action.sendButtonAction(sendJButton, inputField);

        // Text Field Action
        action.textFieldAction(inputField, sendJButton);

        // Default message
        action.addMessage("Hello! I am FRIDAY AI Assistant.", false);

        // Change Theme Action 
        action.themeButtonAction(themeJButton);

        // Delete Button Action
        action.newChatButtonAction(deleteJButton);

        // New Chat Button Action
        action.newChatButtonAction(newJButton);

        // Calculator button Action
        calculator.addCalculator(calculatorJButton);

        // Setting button Action
        setting.addSetting(settingJButton);

        // Help button Action
        help.addHelp(helpJButton);

        // Exit Button Action
        action.exitButtonAction(exitJButton);

        // Quick - 1 Action
        action.quick1Function(quick1JButton); 

        // Quick - 2 Action
        action.quick2Function(quick2JButton);
        
         // Quick - 3 Action
        action.quick3Function(quick3JButton); 

         // Quick - 4 Action
        action.quick4Function(quick4JButton); 
        

        


        frame.setTitle("AI Chatbot");
        frame.getContentPane().setBackground(new Color(2, 10, 5));
        ImageIcon logo = new ImageIcon(App.class.getResource("/Resources/Logo2.png"));
        Image imageLogo = logo.getImage();
        Image finalLogo = quality.highQuality(imageLogo, 40, 40);
        frame.setIconImage(finalLogo);

        frame.setLayout(new BorderLayout(10,10));
        frame.add(leftJPanel, BorderLayout.WEST);
        frame.add(rightJPanel, BorderLayout.CENTER);


        frame.setSize(new Dimension(1200,900));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.revalidate();
        frame.repaint();

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}