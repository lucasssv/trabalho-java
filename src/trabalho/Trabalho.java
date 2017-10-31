package trabalho;

import javax.swing.JOptionPane;

public class Trabalho {

    public static void main(String[] args) {
        String menu = "01 - cadastrar\n"+
                      "02 - alterar\n"+
                      "03 - exluir\n"+
                      "04 - listar\n"+
                      "05 - Sair do sistema\n"+
                      "Digite uma opção";
        boolean sair = false;
        DAOCliente dao = new DAOCliente();
        Cliente cliente;
        while(!sair){
            int op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            
            switch(op){
                case 1:         
                    cliente = new Cliente();
                    cliente.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo")));
                    cliente.setNome(JOptionPane.showInputDialog("Digite o nome"));
                    cliente.setEndereco(JOptionPane.showInputDialog("Digite o endereço"));
                    dao.inserir(cliente);
                    break;
                case 2:                 
                    cliente = new Cliente();
                    cliente.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo")));
                    cliente.setNome(JOptionPane.showInputDialog("Digite o nome"));
                    cliente.setEndereco(JOptionPane.showInputDialog("Digite o endereço"));
                    dao.alterar(cliente);
                    break;
                case 3:
                    cliente = new Cliente();
                    cliente.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo")));
                    dao.excluir(cliente);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, dao.listar().toArray());
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Saindo do sistema");
                    sair = true;
                    break;
            }
        }
    }
}