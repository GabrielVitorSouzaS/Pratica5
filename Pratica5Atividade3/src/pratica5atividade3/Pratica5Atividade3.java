/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratica5atividade3;
import javax.swing.JOptionPane;
/**
 *
 * @author gabriel
 */
public class Pratica5Atividade3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         StringBuilder mensagem = new StringBuilder();
         
         int n1, fatorial=1;
         
         n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero\n"));
         
         if(n1>0) {
                     
            for(int i = 1; i<=n1; i++){
                fatorial = fatorial *i;
                mensagem.append(n1).append("! ").append(fatorial).append("\n");
                JOptionPane.showMessageDialog(null,mensagem);
            }         
                     System.exit(0);       
                 }else if(n1==0){
           mensagem.append("0! = 1");
                JOptionPane.showMessageDialog(null,mensagem);
                System.exit(0);
                 }else{
                                mensagem.append("Numero invalido");
                JOptionPane.showMessageDialog(null,mensagem);
                System.exit(0);
                     
                 } 
    }
    
}
