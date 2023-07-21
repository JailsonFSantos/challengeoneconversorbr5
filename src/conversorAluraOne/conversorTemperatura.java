package conversorAluraOne;


import javax.swing.*;

public class conversorTemperatura {
	
	public void executeConversorTemperatura() {
		
		String temperatura = JOptionPane.showInputDialog(""
				+ "Escolha a Opção de conversão de Temperatura"
				+ "\n1. Celsius para Fahrenheit"
				+ "\n2. Fahrenheit para Celsius");
		
		int opcao = Integer.parseInt(temperatura);
		
		if (opcao == 1) {
            String inputCelsius = JOptionPane.showInputDialog("Digite a temperatura em Celsius:");
            try {
                double celsius = Double.parseDouble(inputCelsius);
                double fahrenheit = (celsius * 9 / 5) + 32;
                JOptionPane.showMessageDialog(null, String.format("%.2f graus Celsius equivalem a %.2f graus Fahrenheit.", celsius, fahrenheit), "Resultado", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido! Digite um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else if (opcao == 2) {
            String inputFahrenheit = JOptionPane.showInputDialog("Digite a temperatura em Fahrenheit:");
            try {
                double fahrenheit = Double.parseDouble(inputFahrenheit);
                double celsius = (fahrenheit - 32) * 5 / 9;
                JOptionPane.showMessageDialog(null, String.format("%.2f graus Fahrenheit equivalem a %.2f graus Celsius.", fahrenheit, celsius), "Resultado", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido! Digite um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } 
		
		
		
	}
	
	public static void main(String[] args) {
        conversorTemperatura conversor = new conversorTemperatura();
        conversor.executeConversorTemperatura();
    }

}
