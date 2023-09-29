import javax.swing.*;
import java.awt.*;

public class BasicSwingGUI {
    public void GuiMethod(){
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocation(500, 500);
        frame.setBounds(200, 50, 400, 300);
        frame.setTitle("Text");
        //frame.setResizable(false);
        frame.setLayout(null);


        //Here the extra part
        JLabel lbl = new JLabel("Leading University");
        lbl.setBounds(50, 20, 400, 20);
        lbl.setForeground(Color.RED);
        lbl.setFont(new Font("Arial Black", Font.BOLD, 20));
        frame.add(lbl);

        JButton btn = new JButton("Submit");
        btn.setBounds(50, 80, 80, 30);
        frame.add(btn);

        JTextField txtf = new JTextField();
        txtf.setBounds(50, 120, 100, 30);
        frame.add(txtf);

        String dist[] = {"Dhaka", "Sylhet", "Chittagong", "Rajshahi", "Khulna", "Barishal"};
        JComboBox list = new JComboBox(dist);
        list.setBounds(50, 200, 100, 50);
        frame.add(list);

        JLabel GenderLbl = new JLabel("Mark your gender: ");
        GenderLbl.setBounds(50, 300, 400, 50);
        GenderLbl.setForeground(Color.RED);
        GenderLbl.setFont(new Font("Arial Black", Font.BOLD, 20));
        frame.add(GenderLbl);

        JRadioButton maleBtn = new JRadioButton("Male");
        maleBtn.setBounds(50, 400, 100, 50);
        JRadioButton femaleBtn = new JRadioButton("Female");
        femaleBtn.setBounds(150, 400, 100, 50);
        ButtonGroup group = new ButtonGroup();
        group.add(maleBtn);
        group.add(femaleBtn);
        frame.add(maleBtn);
        frame.add(femaleBtn);

        JCheckBox checkBox = new JCheckBox();
        checkBox.setBounds(50, 500, 300, 50);
        checkBox.setText("I am not a robot");
        frame.add(checkBox);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(50, 570, 300, 50);
        textArea.setText("Thanks for giving your informations.");
        frame.add(textArea);
    }

    public static void main(String[] args) {
        BasicSwingGUI abc = new BasicSwingGUI();
        abc.GuiMethod(); //if GuiMethod() were a constructor, we don't have to call it
    }
}