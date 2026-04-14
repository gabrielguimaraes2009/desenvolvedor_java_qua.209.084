package com.atividade08.app;

import javax.swing.JOptionPane;

import com.atividade08.models.Pessoa;

public class App {
 
    public static void main(String[] args) throws Exception {
        
        Pessoa pessoa = new Pessoa (null, 0);
        


        pessoa.setNome(JOptionPane.showInputDialog("Informe o nome:"));
        pessoa.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade:")));

        if (pessoa.getIdade() <18) {
           JOptionPane.showMessageDialog(null, "Menor de idade");
        }
        else {
            JOptionPane.showMessageDialog(null, "Maior de idade");
        }

        // saida de dados
        JOptionPane.showMessageDialog(null, "Nome: " + pessoa.getNome() + ("\n Idade: " + pessoa.getIdade()));


        
    }
}
