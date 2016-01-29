package br.edu.ifpb.pdp.labirinty;

import java.util.ArrayList;

public class GameSettings {
	private static ArrayList<Sala> salas;
	
	static{
		//preparando o ambiente para a adicao das salas
		salas = new ArrayList<Sala>();
	}
	
	public static void add(ElementLabirinty el){
		Sala s = (Sala) el;
		s.setElements(create("parede"));
		s.setElements(create("parede"));
		s.setElements(create("porta"));
		s.setElements(create("parede"));
		
		salas.add(s);
	}
	
	public static ArrayList<Sala> getSalas(){
		return salas;
	}
	
	
	//criando as instancias dos elementos
	public static ElementLabirinty create(String str){
		ElementLabirinty obj = null;
		
		switch(str){
			case "parede":
				obj = new Wall();	
				break;
			case "sala":
				obj = new Sala(salas.size() + 1);
				break;
			case "porta":
				obj = new Door();
				break;
		}	
		
		return obj;		
	}
}
