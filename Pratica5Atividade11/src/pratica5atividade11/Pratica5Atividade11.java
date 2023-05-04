/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratica5atividade11;
import javax.swing.JOptionPane;

/**
 *
 * @author gabriel
 */
public class Pratica5Atividade11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                StringBuilder mensagem = new StringBuilder();
            int peso, sexo, sexf=0,sexm=0,i=1;
            
            do{

                peso= Integer.parseInt(JOptionPane.showInputDialog("Insira o peso da "+ i + "° pessoa: \n"));
                sexo = Integer.parseInt(JOptionPane.showInputDialog("De qual sexo esta pessoa e:  \n1)Masculino  2)Feminino\n"));                
                if(sexo==2 && peso>=50 && peso<=70){
                    sexf++;
                }else if(sexo==1 && peso>=60 && peso<=80){
                    sexm++;
                }
                 i++;
            }while(i<11);
             mensagem.append("A quantidade de mulheres entre 50 e 70 kg e: ").append(sexf).append("\nA quantidade de homens entre 60 e 80 kg e: ").append(sexm);;
            JOptionPane.showMessageDialog(null,mensagem);
            System.exit(0);     
    }
    
}
