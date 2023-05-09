package view;

import javax.swing.*;

public class MainMenu {
    JFrame mm=new JFrame("主界面");


    public void setMm() {
        mm.setBounds(960,540,600,400);
        

        mm.setVisible(true);
        mm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new MainMenu().setMm();
    }
}
