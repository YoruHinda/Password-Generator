package com.yoruhinda.github.passwordgenerator.listener;

import com.yoruhinda.github.passwordgenerator.controller.PasswordController;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class PasswordArgumentsListener implements ItemListener {
    private PasswordController passwordController;

    public PasswordArgumentsListener(PasswordController passwordController) {
        this.passwordController = passwordController;
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() instanceof JCheckBox) {
            JCheckBox source = (JCheckBox) e.getSource();
            if (e.getStateChange() == ItemEvent.SELECTED) {
                passwordController.addArgumentCharacterPassword(source);
            }
            if (e.getStateChange() == ItemEvent.DESELECTED) {
                passwordController.removeArgumentCharacterPassword(source);
            }
        }
    }
}
