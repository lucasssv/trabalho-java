package trabalho;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class Conexao {

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/trabalho", "root", "");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}