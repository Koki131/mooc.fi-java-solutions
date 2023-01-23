/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc.logic;

import mooc.ui.UserInterface;

/**
 *
 * @author milapetrov
 */
public class ApplicationLogic {
    private UserInterface UI;
    
    public ApplicationLogic(UserInterface ui) {
        this.UI = ui;
    }
    
    public void execute(int times) {
        for (int n = 0; n < times; n++) {
            System.out.println("Application logic is working");
            UI.update();
        }
    }
    
    
    
}
