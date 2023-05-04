/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratica5atividade1;
import javax.swing.JOptionPane;
/**
 *
 * @author gabriel
 */
public class Pratica5Atividade1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         StringBuilder mensagem = new StringBuilder();
    
 int soma = 0;
 
 for(int i = 7; i<=20; i++){
     
soma = soma +i;
mensagem.append("\nA soma entre os numeros e: ").append(soma);
JOptionPane.showMessageDialog(null,mensagem);     
 }
 System.exit(0);   
    
    }
    
}
