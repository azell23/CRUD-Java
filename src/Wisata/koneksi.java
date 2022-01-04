/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Wisata;

import java.sql.Connection;
import java.sql.SQLException;
import com.mysql.cj.jdbc.MysqlDataSource;

/**
 *
 * @author hildanrizky
 */
public class koneksi {
    static Connection sambungDB(){
        try {
            MysqlDataSource mds = new MysqlDataSource();
            mds.setDatabaseName("db_wisata"); 
            mds.setUser("root"); 
            mds.setPassword(""); 
            mds.setServerTimezone("Asia/Jakarta");
            
            Connection c = mds.getConnection();
            return c;
        } catch (SQLException e) {
            System.err.println("GAGAL terhubung ke basis data"
                    + "\nError: "+e.getMessage());
        }
        return null;
        
    }

}
