package com.yoruhinda.github.passwordgenerator.controller;

import java.util.concurrent.ThreadLocalRandom;

public class Generator {
    private final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private final String NUMBERS = "0123456789";
    private final String Symbols = "'\"!@#$%¨&*()-=_+`´[{~^]}/?;:.>,<\\|";
    private boolean allowUpperCase;
    private boolean allowLowerCase;
    private boolean allowNumbers;
    private boolean allowSymbols;

    public String generateRandomPassword(int length){
        StringBuilder password = new StringBuilder();
        StringBuilder characters = new StringBuilder();
        if(allowUpperCase){
            characters.append(UPPERCASE);
        }
        if(allowLowerCase){
            characters.append(LOWERCASE);
        }
        if(allowNumbers){
            characters.append(NUMBERS);
        }
        if(allowSymbols){
            characters.append(Symbols);
        }

        for(int i = 0;i < length; i++){
            password.append(characters.charAt(ThreadLocalRandom.current().nextInt(characters.length())));
        }
        return password.toString();
    }

    public void setAllowUpperCase(boolean allowUpperCase) {
        this.allowUpperCase = allowUpperCase;
    }

    public void setAllowLowerCase(boolean allowLowerCase) {
        this.allowLowerCase = allowLowerCase;
    }

    public void setAllowNumbers(boolean allowNumbers) {
        this.allowNumbers = allowNumbers;
    }

    public void setAllowSymbols(boolean allowSymbols) {
        this.allowSymbols = allowSymbols;
    }
}
