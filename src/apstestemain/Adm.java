package apstestemain;

import javax.swing.JOptionPane;

public class Adm implements Autenticavel{

    private int senha;

    public Adm(int senha) {
        this.senha = senha;
    }


    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

   
    public boolean autentica(int senha) {
    if(getSenha() != senha) return false;
    else return true;

}

}