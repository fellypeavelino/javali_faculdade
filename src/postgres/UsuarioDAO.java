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
public class UsuarioDAO {
    
    public boolean logar(Usuario u) throws SQLException{
        Principal p = new Principal();
        p.con = p.conectar();
        p.stm = p.con.prepareStatement("select count(nome) from usuario where nome='"+u.getNome()+"' and senha='"+u.getSenha()+"'");
        ResultSet rs = p.stm.executeQuery();
        int rows = 0;
        while(rs.next()){
            rows = rs.getInt(1);
        }
        p.desconectar();
        if(rows == 1){
            return true;
        }
        return false;
    }
    
    public void inserir(Usuario u) throws SQLException{
        Principal p = new Principal();
        p.con = p.conectar();
        p.stm = p.con.prepareStatement("insert into usuario (nome, senha) values ('"+u.getNome()+"', '"+u.getSenha()+"');");
        p.stm.execute();
        p.stm.close();
        p.desconectar();
    }
    
    public void exist(Usuario u) throws SQLException{
        Principal p = new Principal();
        p.con = p.conectar();
        p.stm = p.con.prepareStatement("select count(nome) from usuario where nome='"+u.getNome()+"' and senha='"+u.getSenha()+"'");
    
    }
    
    public ArrayList<Usuario> lista() throws SQLException{
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        Principal p = new Principal();
        p.con = p.conectar();
        p.stm = p.con.prepareStatement("select * from usuario");
        ResultSet rows = p.stm.executeQuery();
        while(rows.next()){
            Usuario usuario = new Usuario();
            usuario.setId(rows.getInt("id"));
            usuario.setNome(rows.getString("nome"));
            usuario.setSenha(rows.getString("senha"));
            usuarios.add(usuario);
        }
        return usuarios;
    }
}
