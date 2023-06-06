package model;

public class Telefone {

	public String numero;
	
	@Override
	public String toString() {
		return "Número de telefone: "+numero;
	}
	
	public int hashCode() {
		String nmrString = String.valueOf(numero);
		String nmrDD = nmrString.substring(0, 2);
		int ddInt = Integer.parseInt(nmrDD);
		int hash = ddInt % 89;
		return hash;
	}

}
