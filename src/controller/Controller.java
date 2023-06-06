package controller;

import br.edu.fateczl.lista.listaObj.Lista;
import model.Telefone;

public class Controller {
	
	Lista[] telefones;

	public Controller() {
		telefones = new Lista[89];
		for (int i = 11 ; i < 89 ; i++) {
			telefones[i] = new Lista();
		}
	}
	
	public void adiciona(Telefone numero) throws Exception {
		int hash = numero.hashCode();
		Lista l = telefones[hash];
		if (l.isEmpty()) {
			l.addFirst(numero);
		} else {
			l.addLast(numero);
		}
	}
	
	/*
	public Telefone busca(Telefone t) throws Exception {
		int hash = t.hashCode();
		Lista l = telefones[hash];
		int tamanho = l.size();
		for (int i = 0 ; i < tamanho ; i++) {
			Telefone t1 = (Telefone) l.get(i);
			if (t1.numero.equals(t.numero)) {
				return t1;
			}
		}
		return null;
	}
	*/
	
	public void lista(String numero) throws Exception {
		int hash = hashCode(numero);
		Lista l = telefones[hash];
		int tamanho = l.size();
		for (int i = 0 ; i < tamanho ; i++) {
			Telefone t = (Telefone) l.get(i);
			System.out.println(t.toString());
		}
	}
	
	public int hashCode(String numero) {
		String nmrDD = numero.substring(0, 2);
		int ddInt = Integer.parseInt(nmrDD);
		int hash = ddInt % 89;
		return hash;
	}

	

}
