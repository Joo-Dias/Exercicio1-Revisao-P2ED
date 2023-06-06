package view;

import javax.swing.JOptionPane;

import controller.Controller;
import model.Telefone;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Telefone t1 = new Telefone();
		Controller ct = new Controller();
		
		t1.numero = "11953140656";
		
		ct.adiciona(t1);
		
		ct.lista("11");
	}

}
