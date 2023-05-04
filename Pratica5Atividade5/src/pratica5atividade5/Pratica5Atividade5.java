/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratica5atividade5;
import javax.swing.JOptionPane;
/**
 *
 * @author gabriel
 */
public class Pratica5Atividade5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            StringBuilder mensagem = new StringBuilder();
            
                        int n1,maior=0, menor=100,cond=0;
            
            do{
                n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero\n"));
                
                cond = Integer.parseInt(JOptionPane.showInputDialog("Quer inserir mais um numero?\n1) Sim  2) Nao"));
                if(maior< n1) maior = n1;
                if(menor> n1) menor = n1;
                
            }while(cond==1);
             mensagem.append("O maior numero e: ").append(maior).append("\no menor numero e: ").append(menor);
            JOptionPane.showMessageDialog(null,mensagem);
            System.exit(0);   
    
    }
    
}
