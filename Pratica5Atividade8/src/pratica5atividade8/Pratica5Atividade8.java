/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratica5atividade8;
import javax.swing.JOptionPane;
/**
 *
 * @author gabriel
 */
public class Pratica5Atividade8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            StringBuilder mensagem = new StringBuilder();
   
            int n1,n2,potencia=1,i;
                            
            n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o 1° numero \n"));
            n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o 2° numero \n"));    
    
            for(i =1; i <= n2; i++){
                potencia = potencia *n1;
                
            }
                 mensagem.append(potencia);
            JOptionPane.showMessageDialog(null,mensagem);
            System.exit(0);                        
                         
    }
    
    
    
}
