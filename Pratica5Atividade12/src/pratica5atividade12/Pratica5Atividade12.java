/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratica5atividade12;
import javax.swing.JOptionPane;
/**
 *
 * @author gabriel
 */
public class Pratica5Atividade12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             StringBuilder mensagem = new StringBuilder();
             int i=0,n1, calculo;
             
             n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero"));
             do{
                 calculo = n1 * i;
                 mensagem.append(n1).append(" x ").append(i).append(" = ").append(calculo).append("\n");
                JOptionPane.showMessageDialog(null, mensagem);
                 i++;
             }while(i<11);
             System.exit(0);
    }
    
}
