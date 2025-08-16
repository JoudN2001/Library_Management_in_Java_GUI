package javaProject1;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Connect {
    // LIBRARYADMIN.BOOKS (ID,Title,Author,Publisher,Price)
    // LIBRARYADMIN.ACCOUNTS (username, password and name)
    
    public static Connection connect(JFrame frame) {
        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/libraryAdmin", "libraryAdmin", "2001");
            JOptionPane.showMessageDialog(null, "DataBase Connected Successful...");

            return con;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error Connection", "DataBase Connected Faild", JOptionPane.ERROR_MESSAGE);
            if (frame != null){
                frame.dispose();
            }
        }
        return null;
    }
}
