/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratica5atividade6;
import javax.swing.JOptionPane;
/**
 *
 * @author gabriel
 */
public class Pratica5Atividade6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             StringBuilder mensagem = new StringBuilder();
            
             int idade,i=1,media,soma=0;
             
                         do{
                idade = Integer.parseInt(JOptionPane.showInputDialog("Insira a idade da pessoa de numero: " + i + " \n"));
                i++;
                soma = idade + soma;
                
            }while(i<11);
                         media = soma/i;
               mensagem.append("A media das idade e: ").append(media);
            JOptionPane.showMessageDialog(null,mensagem);
            System.exit(0);                        
                         
    }
    
}
