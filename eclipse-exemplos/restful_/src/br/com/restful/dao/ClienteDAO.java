package br.com.restful.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.sun.org.apache.bcel.internal.generic.RETURN;

import br.com.restful.factory.ConnectionFactory;
import br.com.restful.model.Cliente;

/**
 * 
 * Classe responsável por conter os metodos do CRUD
 *
 * @author Douglas Costa <douglas.cst90@gmail.com>
 * @since 17/02/2013 01:55:13
 * @version 1.0
 */
public class ClienteDAO extends ConnectionFactory {

	private static ClienteDAO instance;


	/**
	 * 
	 * Método responsável por criar uma instancia da classe ClienteDAO (Singleton)
	 *
	 * @return
	 * @author Douglas Costa <douglas.cst90@gmail.com.br>
	 * @since 17/02/2013 02:03:47
	 * @version 1.0
	 */
	public static ClienteDAO getInstance(){
		if(instance == null)
			instance = new ClienteDAO();
		return instance;
	}

	/**
	 * 
	 * Método responsável por listar todos os clientes do banco
	 *
	 * @return ArrayList<CLiente> clientes
	 * @author Douglas Costa <douglas.cst90@gmail.com.br>
	 * @since 17/02/2013 02:01:35
	 * @version 1.0
	 */

	public Cliente adicionarCliente(Cliente clientes){

		Connection conexao = null;
		conexao = criarConexao();
		PreparedStatement pstmt = null;

		try{
			String queryInserir = "Insert into \"tbCliente\"(nome, email, senha) Values (?,?,?)";
			pstmt = conexao.prepareStatement(queryInserir);	
			pstmt.setString(1, clientes.getNome());
			pstmt.setString(2, clientes.getEmail());
			pstmt.setString(3, clientes.getSenha());

			pstmt.executeUpdate();		

		}catch(Exception e){
			e.printStackTrace();
			return null;
		}


		return clientes;
	}

	public ArrayList<Cliente> listarTodos(){
		Connection conexao = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<Cliente> clientes = null;

		conexao = criarConexao();
		clientes = new ArrayList<Cliente>();
		try {
			pstmt = conexao.prepareStatement("select * from \"tbCliente\" order by nome");
			rs = pstmt.executeQuery();

			while(rs.next()){
				Cliente cliente = new Cliente();

				cliente.setId(rs.getInt("id"));
				cliente.setNome(rs.getString("nome"));
				cliente.setEmail(rs.getString("email"));
				cliente.setSenha(rs.getString("senha"));

				clientes.add(cliente);
			}

		} catch (Exception e) {
			System.out.println("Erro ao listar todos os clientes: " + e);
			e.printStackTrace();
		} finally {
			fecharConexao(conexao, pstmt, rs);
		}
		return clientes;
	}


}
