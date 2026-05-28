import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;


public class fridayInAction {

    FRIDAYWeather weather = new FRIDAYWeather(); 
    FRIDAYLocation location = new FRIDAYLocation();
    calculation calculate = new calculation();

    public void sendButtonAction(JButton button, JTextField textField){

        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e){

                String text = textField.getText().trim();

                if(!text.isEmpty()){
                    addMessage(text, true);
                    
                    textField.setText("");

                    SwingUtilities.invokeLater(new Runnable() {
                        public void run(){
                            String reply = ruleBasedQuesAns(text);
                            addMessage(reply , false);

                            if(text.equalsIgnoreCase("exit")){
                                System.exit(0);
                            }
                        }  
                    });
                    
                }
                
            }
        });
    }

    public void addMessage(String text, Boolean isUser){
        JPanel containerJPanel = new JPanel();
        containerJPanel.setOpaque(false);

        if (isUser == true) {
            containerJPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        }else{
            containerJPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        }

        JPanel bubble = new JPanel();
        if(isUser == true){
            bubble.setBackground(new Color(90,70,255));
        }else{
            bubble.setBackground(new Color(25,35,25));
        }
        bubble.setBorder(BorderFactory.createEmptyBorder( 10, 15, 10, 15));


        JLabel messageLabel = new JLabel();
        messageLabel.setForeground(Color.WHITE);
        messageLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        messageLabel.setText("<html><body style='width:250px'>" + text + "</body></html>");

        bubble.add(messageLabel);
        
        containerJPanel.add(bubble);

        App.messageJPanel.add(containerJPanel);
        App.messageJPanel.revalidate();
        App.messageJPanel.repaint();

        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                JScrollBar verticalJScrollBar = App.scrollPane.getVerticalScrollBar();
                verticalJScrollBar.setValue(verticalJScrollBar.getMaximum());
            }
        });


    }

    public void textFieldAction(JTextField textField, JButton button){
        textField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                button.doClick();
            }
        });
    }

    public void themeButtonAction(JButton button){
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){

                if(App.isDarkTheme){
                    App.leftJPanel.setBackground(new Color(230, 230, 230));
                    App.rightJPanel.setBackground(new Color(230, 230, 230));
                    App.topBanner.setBackground(new Color(230, 230, 230));
                    App.headingPanel.setBackground(new Color(230, 230, 230));
                    App.logoJPanel.setBackground(new Color(230, 230, 230));
                    App.navigationBar.setBackground(new Color(230, 230, 230));
                    App.downNavigationBar.setBackground(new Color(230, 230, 230));
                    App.TopRightBannerJPannel.setBackground(new Color(230, 230, 230));
                    App.rightHeadingJPanel.setBackground(new Color(230, 230, 230));            
                    App.buttonJPanel.setBackground(new Color(230, 230, 230));
                    
                    
                    App.headingJLabel.setForeground(new Color(20, 120, 40));
                    App.quickJLabel.setForeground(new Color(20, 120, 40));
                    App.rightHeadingJLabel.setForeground(new Color(20, 120, 40));
                    
                    App.subHeadingJLabel.setForeground(new Color(80, 80, 80));
                    App.rightSubHeadingJLabel.setForeground(new Color(80, 80, 80));
                    
                    App.newJButton.setForeground(new Color(30, 30, 30));
                    App.calculatorJButton.setForeground(new Color(30, 30, 30));
                    App.settingJButton.setForeground(new Color(30, 30, 30));
                    App.helpJButton.setForeground(new Color(30, 30, 30));
                    App.exitJButton.setForeground(new Color(30, 30, 30));

                    App.quick1JButton.setForeground(new Color(30, 30, 30));
                    App.quick2JButton.setForeground(new Color(30, 30, 30));
                    App.quick3JButton.setForeground(new Color(30, 30, 30));
                    App.quick4JButton.setForeground(new Color(30, 30, 30));
                    
                    App.messageJPanel.setBackground(new Color(255, 255, 255));
                    App.scrollPane.getViewport().setBackground(Color.WHITE);
                    
                    App.inputJPanel.setBackground(new Color(230, 230, 230));
                    App.inputField.setBackground(Color.WHITE);
                    App.inputField.setForeground(Color.BLACK);
                    App.inputField.setCaretColor(Color.BLACK);
                    
                    App.sendJButton.setBackground(new Color(60, 180, 90));
                    App.sendJButton.setForeground(Color.WHITE);
                    
                    App.frame.getContentPane().setBackground(new Color(250,250,250));
                    
                    App.line.setForeground(new Color(180,180,180));
                    App.line2.setForeground(new Color(180,180,180));
                    
                    App.isDarkTheme = false;
                    App.frame.revalidate();
                    App.frame.repaint();

                }else{
                    
                    App.leftJPanel.setBackground(new Color(5, 18, 8));
                    App.rightJPanel.setBackground(new Color(3, 14, 6));

                    App.topBanner.setBackground(new Color(5, 18, 8));
                    App.navigationBar.setBackground(new Color(5, 18, 8));
                    App.downNavigationBar.setBackground(new Color(5, 18, 8));

                    App.headingPanel.setBackground(new Color(5, 18, 8));
                    App.logoJPanel.setBackground(new Color(5, 18, 8));

                    App.TopRightBannerJPannel.setBackground(new Color(5, 18, 8));
                    App.rightHeadingJPanel.setBackground(new Color(5, 18, 8));            
                    App.buttonJPanel.setBackground(new Color(5, 18, 8));

                    App.headingJLabel.setForeground(new Color(150, 255, 50));
                    App.quickJLabel.setForeground(new Color(150, 255, 50));
                    App.rightHeadingJLabel.setForeground(new Color(150, 255, 50));

                    App.subHeadingJLabel.setForeground(new Color(170, 190, 170));
                    App.rightSubHeadingJLabel.setForeground(new Color(170, 190, 170));

                    App.newJButton.setForeground(new Color(245, 255,255));
                    App.calculatorJButton.setForeground(new Color(245, 255,255));
                    App.settingJButton.setForeground(new Color(245, 255,255));
                    App.helpJButton.setForeground(new Color(245, 255,255));
                    App.exitJButton.setForeground(new Color(245, 255,255));

                    App.quick1JButton.setForeground(new Color(245, 255,255));
                    App.quick2JButton.setForeground(new Color(245, 255,255));
                    App.quick3JButton.setForeground(new Color(245, 255,255));
                    App.quick4JButton.setForeground(new Color(245, 255,255));

                    App.messageJPanel.setBackground(new Color(3,14,6));
                    App.scrollPane.getViewport().setBackground(new Color(3,14,6));

                    App.inputJPanel.setBackground(new Color(5, 18, 8));
                    App.inputField.setBackground(new Color(15,25,15));
                    App.inputField.setForeground(Color.WHITE);
                    App.inputField.setCaretColor(Color.WHITE);

                    App.sendJButton.setBackground(new Color(100, 255, 100));
                    App.sendJButton.setForeground(Color.BLACK);

                    App.frame.getContentPane().setBackground(new Color(2, 10, 5));

                    App.line.setForeground(new Color(150,150,150,60));
                    App.line2.setForeground(new Color(150,150,150,60));

                    App.isDarkTheme = true;

                    App.frame.revalidate();
                    App.frame.repaint();
                
                }

            }
        });
    }

    public void newChatButtonAction(JButton button){
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                App.rightJPanel.removeAll();

                App.rightJPanel.add(App.mainChatPanel, BorderLayout.CENTER);

                App.messageJPanel.removeAll();

                addMessage("Hello! I am FRIDAY AI Assistant.", false);

                App.rightJPanel.revalidate();
                App.rightJPanel.repaint();

                App.messageJPanel.revalidate();
                App.messageJPanel.repaint();
            }
        });
    }


    public void exitButtonAction(JButton button){
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
    }

    public String ruleBasedQuesAns(String text){

        text = text.toLowerCase();

        HashMap<String, String> questionBank = new HashMap<>();
        questionBank.put("hi", "Hi Boss, I am Friday your AI Assistant. What's up Boss?");
        questionBank.put("hey", "hey Boss, I'm Friday. How can I help you?");
        questionBank.put("hello", "Hello Boss, This is Friday. How can I help you?");
        questionBank.put("wake up","Yes Boss, What's up?");
        questionBank.put("good morning", "Good Morning Boss, what's up?");
        questionBank.put("good afternoon", "Good Afternoon Boss, what's up?");
        questionBank.put("good night", "Good Night Boss, Have a sweet dream.");
        questionBank.put("good evening", "Good Evening! How was your day?");
        questionBank.put("how are you", "I am functioning perfectly!");

        questionBank.put("what is your name", "I am Friday an AI Assistant developed by Amit.");
        questionBank.put("who are you", "I'm Friday an AI Assistant.");
        questionBank.put("who made you", "Mr. Amit, the creator of me ");
        questionBank.put("are you ai", "Yes, I am Friday an AI Assistant.");
        questionBank.put("what can you do", "I can reply to your question, chats, date, time, weather, perform calculation, etc.");
        
        String currentTime = java.time.LocalTime.now().format(java.time.format.DateTimeFormatter.ofPattern("hh:mm:ss a"));
        questionBank.put("what time is it", "Time is " + currentTime);
        questionBank.put("tell me the time", "Time is " + currentTime);
        questionBank.put("current time", "Current Time is " + currentTime);
        questionBank.put("today's date", "Today date is " + java.time.LocalDate.now().toString());
        questionBank.put("what day is today", "Today is " + java.time.LocalDate.now().getDayOfWeek().toString());

        // Jokes and funny Questions
        questionBank.put("tell me a joke", "Why do Java developers wear glasses? Because they don't C#.");
        questionBank.put("make me laugh", "Debugging: Being the detective in a crime movie where you are also the murderer.");
        questionBank.put("motivate me", "Success comes from consistency. Keep coding!");
        questionBank.put("inspire me", "Dream big. Start small. Act now.");
        questionBank.put("tell me a fact", "Java was originally called Oak.");

        // Education Question
        questionBank.put("tell me a joke", "Why do Java developers wear glasses? Because they don't C#.");
        questionBank.put("make me laugh", "Debugging: Being the detective in a crime movie where you are also the murderer.");
        questionBank.put("motivate me", "Success comes from consistency. Keep coding!");
        questionBank.put("inspire me", "Dream big. Start small. Act now.");
        questionBank.put("tell me a fact", "Java was originally called Oak.");

        questionBank.put("help", "I am here to assist you.");
        questionBank.put("can you help me", "Of course! Tell me your problem.");
        questionBank.put("assist me", "Sure! How can I assist you?");
        questionBank.put("set reminder", "Reminder feature coming soon.");
        questionBank.put("create note", "Note feature will be available soon.");

        questionBank.put("i am sad", "Don't worry. Better days are coming.");
        questionBank.put("i am happy", "That's wonderful to hear!");
        questionBank.put("i am tired", "Take some rest and recharge yourself.");
        questionBank.put("i am bored", "Try learning something new today.");
        questionBank.put("i love you", "Thank you! That means a lot.");

        questionBank.put("bye", "Goodbye! Have a great day.");
        questionBank.put("goodbye", "See you soon!");
        questionBank.put("close", "Shutting down assistant.");

        if(text.contains("exit")){
            return "Closing... FRIDAY assistant.";
        }

        String weatherReply = weatherFunction(text);

        if(weatherReply != null){
            return weatherReply;
        }

        if (text.contains("current location")) {
            String currentLocation = location.getLocation();

            if (currentLocation != null && !currentLocation.isEmpty()) {
                return currentLocation;
            }else{
                return "Sorry, I could not fetch your location.";
            }
        }

        if(text.contains("clear the chat")){
            App.rightJPanel.removeAll();
            App.rightJPanel.add(App.mainChatPanel, BorderLayout.CENTER); 
            App.messageJPanel.removeAll();      
            App.rightJPanel.revalidate();
            App.rightJPanel.repaint();   
            App.messageJPanel.revalidate();
            App.messageJPanel.repaint();
            return "Hello! I am FRIDAY AI Assistant.";
            
        }

        if(text.contains("calculate")){
            String input = text.replace("calculate", "").trim();
            String result = calculate.performCalculation(input);

            return result;

        }

        for(String key : questionBank.keySet()){
            if(text.contains(key)){
                return questionBank.get(key);
            }
        }

        // DEFAULT MESSAGE
        return "Sorry Boss, I don't understand that yet.";


    }

    public String weatherFunction(String text){
        text = text.toLowerCase().trim();
        if (text.contains("weather in")){
            String city = text.substring(text.indexOf("weather in") + 10).trim();
            return weather.weatherInFriday(city);
        }
        return null;
    }

    public void quick1Function(JButton button){
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String reply = ruleBasedQuesAns("what time is it");
                addMessage("What's the time? ", true);
                addMessage(reply, false);
            }
        });
    }

    public void quick2Function(JButton button){
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                
                addMessage("Current Weather Report", true);

                SwingUtilities.invokeLater(new Runnable() {
                    public void run(){
                        String reply = ruleBasedQuesAns("weather in Ranchi");
                        addMessage(reply, false);
                    }
                });
                
                
            }
        });
    }
    

    public void quick3Function(JButton button){
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String reply = "this function is not available, it's still being update." ;
                addMessage("Do Calculation", true);
                addMessage(reply, false);
            }
        });
    }

    public void quick4Function(JButton button){
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String reply = ruleBasedQuesAns("tell me a joke");
                addMessage("Tell me a Joke", true);
                addMessage(reply, false);
            }
        });
    }

}
