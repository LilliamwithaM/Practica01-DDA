/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package org.uv.programa01_2;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * Token: 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
 */
public class Programa01_2 {

    public static void main(String[] args) throws SQLException {
        
        Connection con = null;
        Statement st = null;
        
        try {
            String sql = "insert into empleados(clave, nombre, direccion, telefono) values "
                    + "('02', 'Gabriel', 'Av 1', '555')";
            String url = "jdbc:postgresql://localhost:7000/ejemplo";
            String psd = "1234";
            String user = "postgres";
            
            con = DriverManager.getConnection(url, user, psd);
              Logger.getLogger(Programa01_2.class.getName()).log(Level.INFO, "Se conecto");
              st = con.createStatement();
              st.execute(sql);
              Logger.getLogger(Programa01_2.class.getName()).log(Level.INFO, "Se guardo");
              
        }catch (SQLException ex){
            Logger.getLogger(Programa01_2.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (st!=null) {
                    st.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(Programa01_2.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                if (con!=null) {
                    con.close();
                }
            } catch (SQLException ex) {
                    Logger.getLogger(Programa01_2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

