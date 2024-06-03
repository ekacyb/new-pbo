/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import com.mycompany.mavenui.TextUI;
import java.util.Scanner;
import sistemlogic.SistemPerkuliahan;

/**
 *
 * @author A-21
 */
public class main {

    public static void main(String[] args) {
        SistemPerkuliahan sistemPerkuliahan = new SistemPerkuliahan();
        TextUI ui = new TextUI();
        ui.run();
    }

}
