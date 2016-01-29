package br.edu.ifpb.pdp.labirinty;

import java.util.ArrayList;
import java.util.Random;


public class Sala  implements ElementLabirinty{
	private int numberRoom;
	private ArrayList<ElementLabirinty> elements;
	
	
	public Sala(int number) {
		this.elements = new ArrayList<ElementLabirinty>();
		this.numberRoom = number;
	}


	public int getNumberRoom() {
		return numberRoom;
	}


	public void getVizinho() {
		Random gerador = new Random();		
		elements.get(gerador.nextInt(elements.size() - 1)).entrar();
	}


	@Override
	public void entrar() {
		System.out.println("Opa, bem vindo a sala"+getNumberRoom()+" \n");
		
	}


	public void setElements(ElementLabirinty elements) {
		this.elements.add(elements);
	}
	
}
