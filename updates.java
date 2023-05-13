import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GameUI extends JFrame {
    private JButton updatesButton;

    public GameUI() {
        // create the updates button
        updatesButton = new JButton("Updates");

        // add an action listener to the updates button
        updatesButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // create a new window or dialog box to display the updates
                // you can use JOptionPane or create your own custom window
                // or dialog box
                JOptionPane.showMessageDialog(null, "Latest updates:\n- Added new weapons\n- Improved graphics");
            }
        });

        // add the updates button to your game's user interface
        JPanel panel = new JPanel();
        panel.add(updatesButton);
        add(panel, BorderLayout.CENTER);

        // set the size and visibility of your game's user interface
        setSize(800, 600);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GameUI();
    }
}
