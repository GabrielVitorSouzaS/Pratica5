/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratica5atividade7;
import javax.swing.JOptionPane;

/**
 *
 * @author gabriel
 */
public class Pratica5Atividade7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                StringBuilder mensagem = new StringBuilder();
            
             int n1,i=1,media,soma=0,maior=0,menor=100000;
             
                         do{
                n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o " + i + "° numero \n"));
                 if(maior< n1) maior = n1;
                if(menor> n1) menor = n1;
                i++;
            }while(i<11);
              
             mensagem.append("O maior numero e: ").append(maior).append("\no menor numero e: ").append(menor);
            JOptionPane.showMessageDialog(null,mensagem);
            System.exit(0);                        
                         
    }
    
    }
    

