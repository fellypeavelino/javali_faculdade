/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package postgres;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author mria do carmo
 */
public class Usuario {
    
    public Usuario(){
    
    }
    private int id;
    private String nome;
    private String senha;

    public Usuario(String nome, String senha){
        this.nome = nome;
        this.senha = senha;
    }
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /*
CREATE TABLE usuario
(
  id serial primary key,
  nome character varying(255),
  senha character varying(255)
)     
     */
}
