/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.dao;

import br.edu.utfpr.modelo.Pessoa;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author UTFPR
 */
public class PessoaDaoDerby implements Dao{

    Statement stat;
    
    //quando construir o objeto dessa classe vou conectar no banco
    public PessoaDaoDerby(){
        String username = "lucas";
        String password = "123";   
        String url = "jdbc:derby://localhost:1527/MeuBancoDeDados";
        //dps disso mando conectar
       
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            stat = con.createStatement();
            System.out.println("Conexao Estabelecida");
        } catch (SQLException se) {
            System.out.println("Menssagem " + se.getMessage());
            }
    }
    
    
    @Override
    public void adicionar(Pessoa p) {
        
    }

    @Override
    public void remover(Pessoa p) {
       
    }

    @Override
    public void listarTudo() {
        
    }
    
}
