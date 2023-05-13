import java.awt.*;
import javax.swing.*;

public class HomeScreen extends JFrame {
    
    public HomeScreen() {
        setTitle("War Bound");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create a panel for the buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(2, 1));
        
        // Create buttons for singleplayer and multiplayer modes
        JButton singleplayerButton = new JButton("Singleplayer");
        JButton multiplayerButton = new JButton("Multiplayer");
        
        // Add buttons to the panel
        buttonPanel.add(singleplayerButton);
        buttonPanel.add(multiplayerButton);
        
        // Add the panel to the frame
        add(buttonPanel, BorderLayout.CENTER);
        
        // Add a label for the game title
        JLabel titleLabel = new JLabel("WAR BOUND", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Sans-serif", Font.BOLD, 50));
        add(titleLabel, BorderLayout.NORTH);
        
        // Show the frame
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new HomeScreen();
    }
}
