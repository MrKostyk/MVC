import javax.swing.*;

public class View {
    private final JFrame frame;
    private final JTextField textField;
    private final JButton button;

    public View() {
        frame = new JFrame("MVC Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        textField = new JTextField();
        button = new JButton("Set Data");

        JPanel panel = new JPanel();
        panel.add(textField);
        panel.add(button);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }

    public JFrame getFrame() {
        return frame;
    }

    public JTextField getTextField() {
        return textField;
    }

    public JButton getButton() {
        return button;
    }
}