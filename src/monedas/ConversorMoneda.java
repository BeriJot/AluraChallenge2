package monedas;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ConversorMoneda extends Moneda {
	
	public ConversorMoneda() {}
	
	public void convertirMoneda() {
		
		double resultado = 0;
		String oMoneda = "";
		String dMoneda = "";
		DecimalFormat df = new DecimalFormat("###.##");
		oMoneda = (JOptionPane.showInputDialog(null, "Ingrese la moneda de origen", "Elije", JOptionPane.PLAIN_MESSAGE, null, opcionMoneda, "Elije")).toString();
		dMoneda = (JOptionPane.showInputDialog(null, "Ingrese la moneda a la que desea convertir", "Elije", JOptionPane.PLAIN_MESSAGE, null, opcionMoneda, "Elije")).toString();
		
		if (oMoneda != dMoneda) {
			String valor = JOptionPane.showInputDialog("Ingrese pesos a convertir");
			if (valor.matches("^[0-9]+(\\.[0-9]+){0,1}$")) {
				double monto = Double.parseDouble(valor);
				switch (oMoneda) {
				case "Peso": 
					switch (dMoneda) {
					case "Dolar":
						resultado = monto * 0.00445;
						break;
					case "Libra": 
						resultado = monto * 0.00355;
						break;
					case "Euro": 
						resultado = monto * 0.00403;
						break;
					case "Yen": 
						resultado = monto * 0.60268;
						break;
					case "Won": 
						resultado = monto * 5.93405;
						break;
					}
				case "Dolar": 
					switch (dMoneda) {
					case "Peso":
						resultado = monto * 224.857;
						break;
					case "Libra": 
						resultado = monto * 0.79852;
						break;
					case "Euro": 
						resultado = monto * 0.90566;
						break;
					case "Yen": 
						resultado = monto * 135.522;
						break;
					case "Won": 
						resultado = monto * 1334.37;
						break;
					}
				case "Libra": 
					switch (dMoneda) {
					case "Peso":
						resultado = monto * 281.543;
						break;
					case "Dolar": 
						resultado = monto * 1.2521;
						break;
					case "Euro": 
						resultado = monto * 1.13402;
						break;
					case "Yen": 
						resultado = monto * 169.71;
						break;
					case "Won": 
						resultado = monto * 1670.77;
						break;
					}
				case "Euro": 
					switch (dMoneda) {
					case "Peso":
						resultado = monto * 248.243;
						break;
					case "Dolar": 
						resultado = monto * 1.104;
						break;
					case "Libra": 
						resultado = monto * 0.88163;
						break;
					case "Yen": 
						resultado = monto * 149.661;
						break;
					case "Won": 
						resultado = monto * 1473.16;
						break;
					}	
				case "Yen": 
					switch (dMoneda) {
					case "Peso":
						resultado = monto * 1.65896;
						break;
					case "Dolar": 
						resultado = monto * 0.00738;
						break;
					case "Libra": 
						resultado = monto * 0.00589;
						break;
					case "Euro": 
						resultado = monto * 0.00668;
						break;
					case "Won": 
						resultado = monto * 9.84479;
						break;
					}	
				case "Won": 
					switch (dMoneda) {
					case "Peso":
						resultado = monto * 0.16831;
						break;
					case "Dolar": 
						resultado = monto * 0.00075;
						break;
					case "Euro": 
						resultado = monto * 0.00068;
						break;
					case "Libra": 
						resultado = monto * 0.0006;
						break;
					case "Yen": 
						resultado = monto * 0.10144;
						break;
					}	
				JOptionPane.showMessageDialog(null, "La cantidad de "+ oMoneda+ " $" + df.format(monto) + " equivale a $" + df.format(resultado) + " " + dMoneda + ".");
				}
			}else {
				JOptionPane.showMessageDialog(null, "No es un numero valido.");	
			}
		} else {
			JOptionPane.showMessageDialog(null, "Ha elegido la misma moneda.");
		}
	}
}
