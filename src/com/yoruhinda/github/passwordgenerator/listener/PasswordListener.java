package com.yoruhinda.github.passwordgenerator.listener;

import com.yoruhinda.github.passwordgenerator.controller.PasswordController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasswordListener implements ActionListener {

    private PasswordController passwordController;

    public PasswordListener(PasswordController passwordController) {
        this.passwordController = passwordController;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();
        if(source.getText().equalsIgnoreCase("Generate")){
            passwordController.generateRandomPasswordAndDisplay();
        }
    }
}
