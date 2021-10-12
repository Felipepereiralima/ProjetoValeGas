package projeto_java;

import javax.swing.JOptionPane;
import java.awt.Desktop;
import java.net.URI;

public class JavaGas {

	public static void main(String[] args) {
		Beneficiarios novoBene = new Beneficiarios();
		
        JOptionPane.showMessageDialog(null, "Ol�, eu sou o G�Spar!\nO seu assistente virtual e ficarei respons�vel pelo seu atendimento.\nAgora que eu j� me apresentei, preciso saber com quem eu estou falando.");
        novoBene.setNome(JOptionPane.showInputDialog("Qual � o seu nome? "));
        
        novoBene.setUf(Integer.parseInt(JOptionPane.showInputDialog(novoBene.getNome() +", voc� reside no estado de  S�o Paulo? \n[1]SIM" + "  " + "[2]N�O")));
        
        while (novoBene.getUf() == 1) {
        	
        	novoBene.setIdade(Integer.parseInt(JOptionPane.showInputDialog(novoBene.getNome() + ", qual a sua idade? ")));
        
                if (novoBene.getIdade() >= 18) {
            
                    } else {
                        JOptionPane.showMessageDialog(null, novoBene.getNome() + ", voc� � menor de idade, infelizmente n�o tem direito ao benef�cio.", "Informa��o" , JOptionPane.INFORMATION_MESSAGE);
                        break;
                    }
        
            novoBene.setPessoasFamilia(Integer.parseInt(JOptionPane.showInputDialog( novoBene.getNome() + ", quantas pessoas moram com voc�? ")));
        
            novoBene.setRenda(Double.parseDouble(JOptionPane.showInputDialog( novoBene.getNome() + ", qual a sua renda familiar? ")));
        
                if (novoBene.getRendaPerCapita() < 178.00) {
                    }else {
                    	JOptionPane.showMessageDialog(null, novoBene.getNome() + ", voc� tem uma renda per capita maior que R$ 178.00. De acordo com as nossas regras, voc� n�o tem direito ao benef�cio.", "Informa��o", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    } 
        
            
                novoBene.setBolsaFamilia(Integer.parseInt(JOptionPane.showInputDialog(novoBene.getNome() + ", voc� possui cadastro no Bolsa Fam�lia? \n[1]SIM" + "  " + "[2]N�O")));
        
                if (novoBene.getBolsaFamilia() == 2) {
            
                    } else {
                    	JOptionPane.showMessageDialog(null, novoBene.getNome() + ", por ser um benefici�rio do Bolsa Fam�lia, voc� n�o tem direito ao Vale G�s.", "Informa��o", JOptionPane.INFORMATION_MESSAGE);
                        break;    
                    }
        
                novoBene.setCadUnico(Integer.parseInt(JOptionPane.showInputDialog(novoBene.getNome() + ", voc� est� participando do Cadastro �nico? \n[1]SIM"+ "  " +"[2]N�O")));
                    
                if (novoBene.getCadUnico() == 1) {
            
                } else {
                    JOptionPane.showMessageDialog(null,novoBene.getNome() + ", voc� n�o � participante do Cadastro �nico, se dirija ao CRAS mais pr�ximo para realizar o cadastro.\n\n Para localizar o CRAS mais pr�ximo clique em OK.", "Informa��o", JOptionPane.INFORMATION_MESSAGE);
                    try {
                    	URI link2 = new URI("www.encurtador.com.br/ceqF0");
                    	Desktop.getDesktop().browse(link2);
                    }
                    catch(Exception erro) {
                    	System.out.println(erro);
                    }
                    break;
                }
                
                JOptionPane.showMessageDialog(null, novoBene.getNome() + ", voc� atende a todos os requisitos e tem direito ao benef�cio do Vale G�s!\n\nPara realizar o cadastro tenha em m�os o n�mero do seu NIS/PIS e clique no bot�o OK para ser redirecionado ao site." , "Informa��o", JOptionPane.INFORMATION_MESSAGE);
                try {
                	URI link = new URI("www.bolsadopovo.sp.gov.br");
                	Desktop.getDesktop().browse(link);
                }
                catch(Exception erro) {
                	System.out.println(erro);
                }
                break;
            }         
                if (novoBene.getUf() == 2 ) {
                    JOptionPane.showMessageDialog(null, novoBene.getNome() + ", infelizmente voc� est� fora do estado de S�o Paulo, e o benef�cio s� contempla esse estado!", "Informa��o", JOptionPane.INFORMATION_MESSAGE);
                } 
    }    
}