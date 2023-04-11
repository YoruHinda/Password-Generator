package com.yoruhinda.github.passwordgenerator.controller;

import com.yoruhinda.github.passwordgenerator.listener.PasswordArgumentsListener;
import com.yoruhinda.github.passwordgenerator.listener.PasswordListener;
import com.yoruhinda.github.passwordgenerator.listener.PasswordSliderListener;
import com.yoruhinda.github.passwordgenerator.view.PasswordGeneratorPanel;

import javax.swing.*;

public class PasswordController {
    private PasswordListener passwordListener = new PasswordListener(this);
    private PasswordSliderListener passwordSliderListener = new PasswordSliderListener(this);
    private PasswordArgumentsListener passwordArgumentsListener = new PasswordArgumentsListener(this);
    private PasswordGeneratorPanel passwordGeneratorPanel;
    private Generator generator = new Generator();

    public PasswordController(PasswordGeneratorPanel passwordGeneratorPanel){
        this.passwordGeneratorPanel = passwordGeneratorPanel;
        initializeComponentsListeners();
    }

    private void initializeComponentsListeners(){
        passwordGeneratorPanel.getGenerateButton().addActionListener(passwordListener);
        passwordGeneratorPanel.getPasswordLength().addChangeListener(passwordSliderListener);
        passwordGeneratorPanel.getLowerCase().addItemListener(passwordArgumentsListener);
        passwordGeneratorPanel.getSymbols().addItemListener(passwordArgumentsListener);
        passwordGeneratorPanel.getNumbers().addItemListener(passwordArgumentsListener);
        passwordGeneratorPanel.getUpperCase().addItemListener(passwordArgumentsListener);
    }

    public void generateRandomPasswordAndDisplay(){
        if(!passwordGeneratorPanel.getLowerCase().isSelected() && !passwordGeneratorPanel.getUpperCase().isSelected() && !passwordGeneratorPanel.getNumbers().isSelected() && !passwordGeneratorPanel.getSymbols().isSelected()){
            JOptionPane.showMessageDialog(null,"Select Argument Character");
            return;
        }
        String randomPassword = generator.generateRandomPassword(passwordGeneratorPanel.getPasswordLength().getValue());
        passwordGeneratorPanel.getPassword().setText(randomPassword);
    }

    public void updatePasswordLengthText(int length){
        passwordGeneratorPanel.getPasswordLengthCountNumber().setText(String.valueOf(length));
    }

    public void addArgumentCharacterPassword(JCheckBox selectedItem){
        if(selectedItem.equals(passwordGeneratorPanel.getLowerCase())){
            generator.setAllowLowerCase(true);
        } else if (selectedItem.equals(passwordGeneratorPanel.getUpperCase())) {
            generator.setAllowUpperCase(true);
        }else if(selectedItem.equals(passwordGeneratorPanel.getNumbers())){
            generator.setAllowNumbers(true);
        }else if(selectedItem.equals(passwordGeneratorPanel.getSymbols())){
            generator.setAllowSymbols(true);
        }
    }

    public void removeArgumentCharacterPassword(JCheckBox selectedItem){
        if(selectedItem.equals(passwordGeneratorPanel.getLowerCase())){
            generator.setAllowLowerCase(false);
        } else if (selectedItem.equals(passwordGeneratorPanel.getUpperCase())) {
            generator.setAllowUpperCase(false);
        }else if(selectedItem.equals(passwordGeneratorPanel.getNumbers())){
            generator.setAllowNumbers(false);
        }else if(selectedItem.equals(passwordGeneratorPanel.getSymbols())){
            generator.setAllowSymbols(false);
        }
    }
}
