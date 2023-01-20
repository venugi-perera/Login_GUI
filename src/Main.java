import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {

    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JTextField passwordText;
    private static JButton button;
    private static JLabel success;
    private static JButton clearbutton;

    public static void main(String[] args) {

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        userLabel = new JLabel("User");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        button = new JButton("Login");
        button.setBounds(10, 80, 80, 25);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String user = userText.getText();
                String password = passwordText.getText();
                System.out.println(user + "," + password);

                if (user.equals("Venugi") && password.equals("123")) {
                    JOptionPane.showMessageDialog(null, "Login Successful!");

                } else {
                    JOptionPane.showMessageDialog(null, "Login Unsuccessful!");
                    passwordText.setText("");
                }
                if (user.equals("Venugi") && password.equals("123")) {

                }
            }
        });
        panel.add(button);

        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);

        clearbutton = new JButton("clear");
        clearbutton.setBounds(200, 80, 80, 25);
        clearbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                passwordText.setText("");
                userText.setText("");
            }
        });
        panel.add(clearbutton);


        frame.setVisible(true);
    }
}