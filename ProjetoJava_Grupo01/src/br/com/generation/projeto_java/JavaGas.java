package br.com.generation.projeto_java;

import java.awt.Desktop;
import java.net.URI;
import java.awt.Font;
import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JavaGas {

	public static void main(String[] args) {
				 
		   		    
		UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Verdana", Font.BOLD, 25))); 
		UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Verdana", Font.BOLD, 25)));
			   

		Beneficiarios novoBene = new Beneficiarios();

		ImageIcon icone = new ImageIcon("bin/Imagens/Gaspar.png");
		ImageIcon gaspar = new ImageIcon("bin/Imagens/Gaspar2.png");

		Object Options[] = { "Pr�ximo >"};

		JOptionPane.showOptionDialog(null,
				"Sou o seu assistente virtual e ficarei \nrespons�vel pelo seu atendimento.\nMas, vamos l�...",
				"ValeJavaG�s", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, icone, Options, null);

		novoBene.setNome((String) JOptionPane.showInputDialog(null, "Qual o seu nome?", "ValeJavaG�s",0, gaspar, null, null));

		Object yes[] = { "SIM", "N�O" };

		novoBene.setUf(JOptionPane.showOptionDialog(null, novoBene.getNome() + ", voc� reside no estado de S�o Paulo?",
				"ValeJavaG�s", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, gaspar, yes, null));

		while (novoBene.getUf() == 0) {

			novoBene.setIdade(Integer.parseInt((String) JOptionPane.showInputDialog(null,
					novoBene.getNome() + ", qual a sua idade? ", "ValeJavaG�s", 0, gaspar, null, null)));

			if (novoBene.getIdade() >= 18) {

			} else {
				JOptionPane.showInternalMessageDialog(null,
						novoBene.getNome() + ", voc� � menor de idade, infelizmente " + "n�o tem direito ao benef�cio.",
						"ValeJavaG�s", 0, gaspar);
				break;
			}

			novoBene.setPessoasFamilia(Integer.parseInt((String) JOptionPane.showInputDialog(null,
					novoBene.getNome() + ", quantas pessoas moram com voc�? ", "ValeJavaG�s", 0, gaspar, null, null)));

			novoBene.setRenda(Double.parseDouble((String) JOptionPane.showInputDialog(null,
					novoBene.getNome() + ", qual a sua renda familiar? ", "ValeJavaG�s", 0, gaspar, null, null)));

			if (novoBene.getRendaPerCapita() < 178.00) {

			} else {
				JOptionPane.showInternalMessageDialog(null, novoBene.getNome() + ", voc� tem uma renda per capita"
						+ " maior que R$ 178.00.\nDe acordo com as nossas regras, voc� n�o tem direito ao benef�cio.",
						"ValeJavaG�s", 0, gaspar);
				break;
			}

			Object yesB[] = { "SIM", "N�O" };

			novoBene.setBolsaFamilia(JOptionPane.showOptionDialog(null,
					novoBene.getNome() + ", voc� possui cadastro no" + " Bolsa Fam�lia?", "ValeJavaG�s",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, gaspar, yesB, null));

			if (novoBene.getBolsaFamilia() == 1) {

			} else {
				JOptionPane.showInternalMessageDialog(null, novoBene.getNome()
						+ ", por ser um benefici�rio do Bolsa Fam�lia," + " voc� n�o tem direito ao Vale G�s.",
						"ValeJavaG�s", 0, gaspar);
				break;
			}

			Object yesCad[] = { "SIM", "N�O" };

			novoBene.setCadUnico(JOptionPane.showOptionDialog(null,
					novoBene.getNome() + ", voc� est� participando do Cadastro �nico?", "ValeJavaG�s",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, gaspar, yesCad, null));

			if (novoBene.getCadUnico() == 0) {

			} else {
				Object CRAS[] = { "Clique Aqui!" };

				JOptionPane.showOptionDialog(null, novoBene.getNome()
						+ ", voc� n�o � participante do Cadastro �nico, se dirija ao CRAS mais pr�ximo \n"
						+ "para realizar o cadastro.\n\nPara localizar o CRAS mais pr�ximo clique em CLIQUE AQUI!.",
						"ValeJavaG�s", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, gaspar, CRAS, null);

				try {
					URI link2 = new URI("www.encurtador.com.br/ceqF0");
					Desktop.getDesktop().browse(link2);
				} catch (Exception erro) {
					System.out.println(erro);
				}
				break;
			}

			Object valeGas[] = { "OK!" };

			JOptionPane.showOptionDialog(null, novoBene.getNome()
					+ ", voc� atende a todos os requisitos e tem direito ao benef�cio do Vale G�s!"
					+ "\n\nPara realizar o cadastro tenha em m�os o n�mero do seu NIS/PIS e \nclique no bot�o OK! "
					+ "para ser redirecionado ao site.",
					"ValeJavaG�s", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, gaspar, valeGas, null);

			try {
				URI link = new URI("www.bolsadopovo.sp.gov.br");
				Desktop.getDesktop().browse(link);
			} catch (Exception erro) {
				System.out.println(erro);
			}
			break;
		}

		if (novoBene.getUf() == 1) {
			JOptionPane.showInternalMessageDialog(null,
					novoBene.getNome() + ", infelizmente voc� est� fora do estado de S�o Paulo, "
							+ "\ne o benef�cio s� contempla esse estado!","ValeJavaG�s", 0, gaspar);
		}
	}
}