/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

import java.util.ArrayList;

/**
 *
 * @author samus
 */
public interface Persistencia {
    
    void inserir(Cliente c);
    
    void alterar(Cliente c);
    
    void excluir(Cliente c);
    
    ArrayList listar();
}
