package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    private  String driver = "com.mysql.jdbc.Driver";
    private  String enderecoIP = "jdbc:mysql://10.62.55.61:3306/dbPadaria";
    private  String usuario = "senac";
    private  String senha = "123@senac";

    public Connection conectar() {

        Connection conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(enderecoIP , usuario, senha);
            return conn;

        }catch (Exception e){
            System.out.println(e);
            return null;
        }
    }
}