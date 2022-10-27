package model.dao;

public class MotoristaDAO {

import model.bean.Motorista;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

    public class VagaDAO {

        public void create(Motorista m) {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;

            try {
                stmt = con.prepareStatement("INSERT INTO motorista (nome, genero, RG, CPF, celular, email, senha) VALUES (?,?,?,?,?,?,?)");
                stmt.String(1, m.getNome());
                stmt.setString(2, m.getGenero());
                stmt.setint(3, m.getRG());
                stmt.setint(4, m.getCPF());
                stmt.setint(5, m.getCelular());
                stmt.setString(6, m.getEmail());
                stmt.setString(7, m.getSenha());

                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Motorista salvo com sucesso!");

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao salvar: " + e);
            } finally {
                ConnectionFactory.closeConnection(con, stmt);
            }

        }
    }

}
