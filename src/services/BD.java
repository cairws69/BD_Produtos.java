package services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BD {

	public Connection con = null;
	public PreparedStatement st = null;
	public ResultSet rs = null;

	private final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private final String DATABASENAME = "java";
//	private final String URL = "jdbc:sqlserver://192.168.56.1:1433;databaseName=" + DATABASENAME + ";integratedSecurity=true";
	private final String URL = "jdbc:sqlserver://localhost:1433;databaseName=" + DATABASENAME;// + ";integratedSecurity=true";
	private final String LOGIN = "usuario";
	private final String SENHA = "fatec";
	
	/**
	 * Realiza a conexão com o banco de dados
	 * 
	 * @return - true em caso de sucesso, ou false caso contrário
	 */
	public boolean getConnection() {
		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL,LOGIN,SENHA);
//			con = DriverManager.getConnection(URL);
			System.out.println("Conectou!");
			return true;
		} catch (SQLException erro) {
			System.out.println("Falha na conexão! " + erro.getMessage());
			erro.printStackTrace(); // Adiciona detalhes do stack trace para depuração
			return false;
		} catch (ClassNotFoundException erro) {
			System.out.println("Driver não encontrado!");
			return false;
		}

	}

	/**
	 * Encerra a conexão e libera os objetos utilizados
	 */
	public void close() {
		try {
			if (rs != null)
				rs.close();
		} catch (SQLException e) {
		}

		try {
			if (st != null)
				st.close();
		} catch (SQLException e) {
		}
		try {
			if (con != null) {
				con.close();
				System.out.println("Desconectou!");
			}
		} catch (SQLException e) {
		}

	}

	public static void main(String[] args) {
		BD bd = new BD();
		bd.getConnection();
		bd.close();
	}
}
