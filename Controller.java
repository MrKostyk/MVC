import javax.swing.*;

public class Controller {
    private final Model model;
    private final View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;

        view.getButton().addActionListener(e -> updateModelData());
    }

    private void updateModelData() {
        String newData = view.getTextField().getText();
        model.setData(newData);
        JOptionPane.showMessageDialog(view.getFrame(), "Data set successfully!");
    }

    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
    }}