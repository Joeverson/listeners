package br.com.dup.observer.listeners;

public class ChangeParameter extends java.util.EventObject {
	//passa os dados do listener que chama os carinhas 
	public ChangeParameter(Object source) {
		super(source);
	}
}
