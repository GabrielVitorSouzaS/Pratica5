/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratica5atividade10;
import javax.swing.JOptionPane;
/**
 *
 * @author gabriel
 */
public class Pratica5Atividade10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            StringBuilder mensagem = new StringBuilder();
            int idade, sexo, sef=0,i=1;
            
            do{

                idade = Integer.parseInt(JOptionPane.showInputDialog("Insira a idade da "+ i + "° pessoa: \n"));
                sexo = Integer.parseInt(JOptionPane.showInputDialog("De qual sexo esta pessoa e:  \n1)Masculino  2)Feminino\n"));                
                if(sexo==2 && idade>=20 && idade<=40){
                    sef++;
                }
                 i++;
            }while(i<11);
              mensagem.append("A quantidade de mulheres entre 20 e 40 anos e: ").append(sef);
            JOptionPane.showMessageDialog(null,mensagem);
            System.exit(0);                       
            
    }
    
}
