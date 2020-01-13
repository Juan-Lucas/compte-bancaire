package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionDAO {
    static Connection connection = null;
    public static Connection getConnexion()
    {
        try {
             connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestioncompte","root","");

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
