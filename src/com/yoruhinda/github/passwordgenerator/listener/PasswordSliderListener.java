package com.yoruhinda.github.passwordgenerator.listener;

import com.yoruhinda.github.passwordgenerator.controller.PasswordController;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class PasswordSliderListener implements ChangeListener {
    PasswordController passwordController;

    public PasswordSliderListener(PasswordController passwordController){
        this.passwordController = passwordController;
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if(e.getSource() instanceof JSlider){
            JSlider source = (JSlider) e.getSource();
            passwordController.updatePasswordLengthText(source.getValue());
        }
    }
}
