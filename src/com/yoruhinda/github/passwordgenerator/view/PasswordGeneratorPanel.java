package com.yoruhinda.github.passwordgenerator.view;

import javax.swing.*;
import java.awt.*;

public class PasswordGeneratorPanel extends JPanel {
    private JTextField password = new JTextField();
    private JButton generateButton = new JButton();
    private JCheckBox upperCase = new JCheckBox("Upper Case");
    private JCheckBox lowerCase = new JCheckBox("Lower Case");
    private JCheckBox numbers = new JCheckBox("Numbers");
    private JCheckBox symbols = new JCheckBox("Symbols");
    private JLabel passwordLengthText = new JLabel("Password Length:");
    private JSlider passwordLength = new JSlider(1,30);
    private JLabel passwordLengthCountNumber = new JLabel();

    public PasswordGeneratorPanel(){
        this.initialize();
    }

    private void initialize(){
        setLayout(new FlowLayout());
        generateButton.setText("Generate");
        password.setColumns(25);
        passwordLength.setValue(15);
        passwordLengthCountNumber.setText(String.valueOf(passwordLength.getValue()));
        add(password);
        add(generateButton);
        add(upperCase);
        add(lowerCase);
        add(numbers);
        add(symbols);
        add(passwordLengthText);
        add(passwordLength);
        add(passwordLengthCountNumber);
    }

    public JTextField getPassword() {
        return password;
    }

    public JButton getGenerateButton() {
        return generateButton;
    }

    public JCheckBox getUpperCase() {
        return upperCase;
    }

    public JCheckBox getLowerCase() {
        return lowerCase;
    }

    public JCheckBox getNumbers() {
        return numbers;
    }

    public JCheckBox getSymbols() {
        return symbols;
    }

    public JSlider getPasswordLength() {
        return passwordLength;
    }

    public JLabel getPasswordLengthCountNumber() {
        return passwordLengthCountNumber;
    }
}
