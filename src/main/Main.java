/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controller.Controller;
import view.MainMenu;

/**
 *
 * @author LENOVO G4-45
 */
public class Main {
    static Controller controller = new Controller();

    public static void main(String[] args) {
        new MainMenu();
    }
}
