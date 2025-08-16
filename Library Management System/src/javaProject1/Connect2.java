/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaProject1;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author JYo
 */
public class Connect2 {
        public static Connection connect(){
        try{
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/libraryAdmin","libraryAdmin","2001");
            return con;
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error Connection", "DataBase Connected Faild", JOptionPane.ERROR_MESSAGE);
        }
        return null;
}}
