package conversorAluraOne;


import javax.swing.*;

public class menuPrincipal {
	
	public static void main(String[] args) {
		iniciarConversor();
	}
	
	public static void iniciarConversor() {
		String menu;
		menu = JOptionPane.showInputDialog("Escolha uma opção: "
				+ "\n1- Conversor de Moeda"
				+ "\n2- Conversor de Temperatura");
		
		int escolha;
		escolha = Integer.parseInt(menu);
		
		switch (escolha) {
			case 1:
				conversorMoeda conversorMoeda = new conversorMoeda();
				conversorMoeda.executarConversaoMoeda();
				break;
			case 2:
				conversorTemperatura conversorTemperatura = new conversorTemperatura();
				conversorTemperatura.executeConversorTemperatura();
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida!");
		}
		
		
		int confirmarContinuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Continuar?", JOptionPane.YES_NO_OPTION);
		if (confirmarContinuar == JOptionPane.YES_OPTION) {
			iniciarConversor();
		} else {
			JOptionPane.showMessageDialog(null, "Programa encerrado.");
		}
	}
}
