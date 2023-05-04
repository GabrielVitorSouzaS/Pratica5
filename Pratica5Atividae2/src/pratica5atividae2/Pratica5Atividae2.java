/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratica5atividae2;
import javax.swing.JOptionPane;
/**
 *
 * @author gabriel
 */
public class Pratica5Atividae2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         StringBuilder mensagem = new StringBuilder();
         int n1, n2;
         
                     n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro numero"));
                    n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo numero"));      
         
       do{
             
                if(n1>n2){
                    
                    for(int i = n1; i <=n2; i++){
            mensagem.append("\n Teste").append(i); 
            JOptionPane.showMessageDialog(null,mensagem);
                        
                    }
                    
                }else if(n2>n1){
                   
                    for(int i = n2; i <=n1; i++){
                       mensagem.append("\n Teste").append(i);
                       JOptionPane.showMessageDialog(null,mensagem);
                        
                    }   
                     
                }
                }while(n1>=0);  
       
    System.exit(0);
    }
    
}
