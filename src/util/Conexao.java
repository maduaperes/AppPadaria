package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    //Parametros da conexao
    private String driver = "com.mysql.cj.jdbc.Driver";
    private String enderecoIP = "jdbc:mysql://10.62.55.61:3306/dbPadaria";
    private String usuario = "senac";
    private String senha = "123@senac";

    public Connection conectar() {
        //Objeto a ser usado para a conexao
        Connection conn = null;

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(enderecoIP, usuario, senha);
            return conn;

        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}