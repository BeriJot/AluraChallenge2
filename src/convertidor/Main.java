package convertidor;

import javax.swing.JOptionPane;

import monedas.ConversorMoneda;
import temp.ConversorTemperatura;

public class Main {

	public static void main(String[] args) {
		
		ConversorMoneda conversorMoneda = new ConversorMoneda();
		ConversorTemperatura conversorTemp = new ConversorTemperatura();
		
		boolean flag = true;
		while(flag) {
			String opciones = (JOptionPane.showInputDialog(null, "Seleccione el convertidor deseado", "Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Conversor de Moneda", "Conversor de Temperatura"}, "Elije")).toString();
			switch(opciones) {
				case "Conversor de Moneda": 
					conversorMoneda.convertirMoneda();
					break;
				case "Conversor de Temperatura":
					conversorTemp.convertirTemp();
					break;
			}		
			int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra operación?");
			if (JOptionPane.OK_OPTION == respuesta) {
				System.out.println("selecciona opcion afirmativa");
			} else {
				flag = false;
				JOptionPane.showMessageDialog(null, "Programa terminado");
			}
		}
	}	
}

