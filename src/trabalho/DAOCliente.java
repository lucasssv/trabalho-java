package trabalho;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DAOCliente implements Persistencia {
    
    String q;
    static String status = "";
    Connection con = Conexao.getConnection();
    static ArrayList clientes = new ArrayList();
    
    private int codigo;
    private String nome;
    private String endereco;

    @Override
    public void inserir(Cliente c) {
        q = "insert into clientes(codigo,nome,endereco) "
                + "values("+c.getCodigo()+", '" + c.getNome() + " ', '" + c.getEndereco() + "')";
        try {
            Statement st = con.createStatement();
            st.executeUpdate(q);
            status = "Registro incluido com sucesso!";
        } catch (SQLException e) {
            status = "Não foi possivel incluir o registro erro: "
                    + e.getMessage() + " sql executado: " + q;
        }
    }

    @Override
    public void alterar(Cliente c) {
        q = "update clientes set nome='" + c.getNome() + "', endereco= '" + c.getEndereco() + "' "
                + " where codigo = " + c.getCodigo();
        try {
            Statement st = con.createStatement();
            st.executeUpdate(q);
            status = "Registro alterado com sucesso!";
        } catch (SQLException e) {
            status = "Não foi possivel alterar o registro erro: "
                    + e.getMessage() + " sql executado: " + q;
        }
    }

    @Override
    public void excluir(Cliente c) {
        q = "delete from clientes where codigo = " + c.getCodigo();
        try {
            Statement st = con.createStatement();
            st.executeUpdate(q);
            status = "Cliente " + c.getCodigo() + " Excluido com sucesso!";
        } catch (SQLException e) {
            status = "Não foi possivel excluir o registro erro: "
                    + e.getMessage() + " sql executado: " + q;
        }
    }

    @Override
    public ArrayList listar() {
        clientes.clear();
        q = "select * from clientes ";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(q);
            while (rs.next()) {
                codigo = rs.getInt("codigo");
                nome = rs.getString("nome");
                endereco = rs.getString("endereco");
                Cliente c1 = new Cliente(codigo, nome, endereco);
                clientes.add(c1);
            }
        } catch (SQLException e) {
            status = e.getMessage();
        }
        return clientes;
    }
}