package br.edu.ifpb.pdp.labirinty;

import java.util.ArrayList;
import java.util.Iterator;

public class Labirinto {

	public static void main(String[] args) {
		
		GameSettings.add(GameSettings.create("sala")); // adicionando sala e e paredes com porta
		GameSettings.add(GameSettings.create("sala")); // adicionando sala e e paredes com porta
		GameSettings.add(GameSettings.create("sala")); // adicionando sala e e paredes com porta
		GameSettings.add(GameSettings.create("sala")); // adicionando sala e e paredes com porta
		
		ArrayList<Sala> salas = GameSettings.getSalas();
		
		Iterator<Sala> i = salas.iterator();
		
		while(i.hasNext()){
			Sala s = (Sala) i.next();
			//s.entrar();
			s.getVizinho();
		}
		
	}

}