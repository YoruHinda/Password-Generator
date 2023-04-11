package com.yoruhinda.github.passwordgenerator.view;

import com.yoruhinda.github.passwordgenerator.controller.PasswordController;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PasswordGeneratorFrame extends JFrame {
    private final int WIDTH = 400, HEIGHT = 130;
    private BufferedImage image;

    public PasswordGeneratorFrame(){
        initialize();
    }

    private void initialize(){
        PasswordGeneratorPanel passwordGeneratorPanel = new PasswordGeneratorPanel();
        PasswordController passwordController = new PasswordController(passwordGeneratorPanel);
        try {
            image = ImageIO.read(new File("src/com/yoruhinda/github/passwordgenerator/images/passwordIcon.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        setTitle("Password generator");
        setSize(WIDTH,HEIGHT);
        setLocationRelativeTo(null);
        setResizable(false);
        setIconImage(image);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(passwordGeneratorPanel);
        setVisible(true);
    }
}
