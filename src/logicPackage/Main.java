/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicPackage;

import formPackage.LogInFrame;
import formPackage.MainFrame;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Alexey
 */
public class Main {
    
    private static final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    
    public static LogInFrame logInFrame;
    
    public static void main(String[] args) {
        MainFrame mf = new MainFrame();
        logInFrame = new LogInFrame();
        mf.setBounds((screenSize.width - 1200) / 2, (screenSize.height - 800) / 2, 1200, 800);
        logInFrame.setBounds((screenSize.width - 400) / 2, (screenSize.height - 150) / 2, 400, 150);
        mf.setVisible(true);
        logInFrame.setVisible(true);
    }
}
