/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratica5atividade4;
import javax.swing.JOptionPane;
/**
 *
 * @author gabriel
 */
public class Pratica5Atividade4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            StringBuilder mensagem = new StringBuilder();
            int idade,soma=0,media,cond=0,i=0;
            
            do{
                idade = Integer.parseInt(JOptionPane.showInputDialog("Insira uma idade\n"));
                soma = idade + soma;
                i++;
                cond = Integer.parseInt(JOptionPane.showInputDialog("Quer inserir mais uma idade?\n1) Sim  2) Nao"));
            }while(cond==1);
            media = soma/i;
            mensagem.append("A soma das idades e: ").append(soma).append("\ne a media e: ").append(media);
            JOptionPane.showMessageDialog(null,mensagem);
            System.exit(0);
    }
    
}
