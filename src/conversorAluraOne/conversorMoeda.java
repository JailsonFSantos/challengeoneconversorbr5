package conversorAluraOne;

import javax.swing.*;

public class conversorMoeda {

	public void executarConversaoMoeda() {
		
		
		String moeda;
		moeda = JOptionPane.showInputDialog("Escolha a opcao de conversao de"
				+ "moeda desejada: "
				+ "\n1 - Real Em Euro "
				+ "\n2 - Real Em Dolar ");
		
		int opcao;
		opcao = Integer.parseInt(moeda);
		
		if (opcao == 1) {
            String valor = JOptionPane.showInputDialog("Digite o valor em Reais");
            try {
                double valorReal = Double.parseDouble(valor);

                final double euro = 5.35;
                double valorConvertido = valorReal / euro;

                String msg = "O valor em EURO é: " + valorConvertido;
                JOptionPane.showMessageDialog(null, msg);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido! Digite um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else if (opcao == 2) {
            String valor = JOptionPane.showInputDialog("Digite o valor em Reais");
            try {
                double valorReal = Double.parseDouble(valor);

                final double dolar = 4.80;
                double valorConvertido = valorReal / dolar;

                String msg = "O valor em DOLAR é: " + valorConvertido;
                JOptionPane.showMessageDialog(null, msg);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido! Digite um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
	}
	
	public static void main(String[] args) {
        conversorMoeda conversor = new conversorMoeda();
        conversor.executarConversaoMoeda();
    }
	

}
