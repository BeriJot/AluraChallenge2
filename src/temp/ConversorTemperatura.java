package temp;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ConversorTemperatura extends Temperatura{

	public ConversorTemperatura() {}
	
	public void convertirTemp() {
		double resultado = 0;
		String oTemp = "";
		String dTemp = "";
		DecimalFormat df = new DecimalFormat("###.##");
		oTemp = (JOptionPane.showInputDialog(null, "Ingrese la escala de temperatura de origen", "Elije", JOptionPane.PLAIN_MESSAGE, null, opcionTemp, "Elije")).toString();
		dTemp = (JOptionPane.showInputDialog(null, "Ingrese la escala de temperatura a la que desea convertir", "Elije", JOptionPane.PLAIN_MESSAGE, null, opcionTemp, "Elije")).toString();
		
		if (oTemp != dTemp) {
			String valor = JOptionPane.showInputDialog("Ingrese la temperatura a convertir");
			if (valor.matches("^[0-9]+(\\.[0-9]+){0,1}$")) {
				double t = Double.parseDouble(valor);
				switch (oTemp) {
				case "Celcius": 
					switch (dTemp) {
					case "Fahrenheit":
						resultado = t * 9/5 + 32;
						break;
					case "Kelvin": 
						resultado = t + 273.15;
						break;
					case "Rankine": 
						resultado = t * 9/5 + 491.67;
						break;
					}
				case "Fahrenheit": 
					switch (dTemp) {
					case "Celcius":
						resultado = (t * - 32) * 5/9;
						break;
					case "Kelvin": 
						resultado = (t * 459.67) * 5/9;
						break;
					case "Rankine": 
						resultado = t * 459.67;
						break;
					}
				case "Kelvin": 
					switch (dTemp) {
					case "Celcius":
						resultado = t - 273.15;
						break;
					case "Fahrenheit": 
						resultado = (t - 273.15) * 9/5 + 32;
						break;
					case "Rankine": 
						resultado = t * 1.8;
						break;
					}
				case "Rankine": 
					switch (dTemp) {
					case "Celcius":
						resultado = (t - 491.67) * 5/9;
						break;
					case "Fahrenheit": 
						resultado = t - 459.67;
						break;
					case "Kelvin": 
						resultado = t * 5/9;
						break;
					}
				JOptionPane.showMessageDialog(null, "Los "+ df.format(t) + "º " + oTemp + " equivalen a " + df.format(resultado) + "º "+ dTemp + ".");
				}
			}else {
				JOptionPane.showMessageDialog(null, "No es un numero valido.");	
			}
		} else {
			JOptionPane.showMessageDialog(null, "Ha elegido la misma escala de temperatura.");
		}
	}
}

