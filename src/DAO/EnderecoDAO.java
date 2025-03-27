package DAO;

import model.Cliente;
import util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import model.Endereco;
import util.Conexao;
import model.Fornecedor;


public class EnderecoDAO {
        private Conexao conexao = new Conexao();

        public boolean inserirEndereco(Endereco endereco) {
            try (Connection conn = conexao.conectar();
                 PreparedStatement stmt = conn.prepareStatement("INSERT INTO endereco (cep, logradouro, barro, cidade, estado, numero,idCliente,idFornecedor) VALUES (?, ?, ?, ?,?,?,?,?)")) {

                stmt.setString(1, endereco.getCep());
                stmt.setString(2, endereco.getLogradouro());
                stmt.setString(3, endereco.getBairro());
                stmt.setString(4, endereco.getCidade());
                stmt.setString(5, endereco.getEstado());
                stmt.setString(6, endereco.getNumero());
                stmt.setInt(7, endereco.getIdCliente());
                stmt.setInt(8, endereco.getIdFornecedor());

                int rowsAffected = stmt.executeUpdate();
                return rowsAffected > 0;

            } catch (Exception e) {
                System.out.println(e);
                return false;
            }
        }

        public boolean atualizarEndereco(Endereco endereco) {
            try (Connection conn = conexao.conectar();
                 PreparedStatement stmt = conn.prepareStatement("UPDATE endereco SET cep = ?, logradouro = ?, bairro = ?, cidade = ?, estado = ?, numero = ? WHERE idEndereco = ?")) {

                stmt.setString(1, endereco.getCep());
                stmt.setString(2, endereco.getLogradouro());
                stmt.setString(3, endereco.getBairro());
                stmt.setString(4, endereco.getCidade());
                stmt.setString(5, endereco.getEstado());
                stmt.setString(6, endereco.getNumero());
                stmt.setInt(7, endereco.getIdEndereco());


                int rowsAffected = stmt.executeUpdate();
                return rowsAffected > 0;

            } catch (Exception e) {
                System.out.println(e);
                return false;
            }
        }

        public boolean deletarEndereco(int idEndereco) {
            try (Connection conn = conexao.conectar();
                 PreparedStatement stmt = conn.prepareStatement("DELETE FROM endereco WHERE idEndereco = ?")) {

                stmt.setInt(1, idEndereco);

                int rowsAffected = stmt.executeUpdate();
                return rowsAffected > 0;

            } catch (Exception e) {
                System.out.println(e);
                return false;
            }
        }
    }

