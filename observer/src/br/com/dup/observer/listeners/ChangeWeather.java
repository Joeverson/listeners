package br.com.dup.observer.listeners;

import java.util.ArrayList;
import java.util.Collection;

import javax.swing.event.ChangeListener;

public class ChangeWeather {
	private Collection listeners = new ArrayList<ChangeListener>();
	
	//adicionando um novo listener
	public void addListener(ChangeListeners c) throws Exception{
		if(this.listeners.contains(c))
			throw new Exception("Object already exist.");
		
		this.listeners.add(c);			
	}
	
	//removendo um novo listener
	public void removeListener(ChangeListeners c) throws Exception{
		if(!this.listeners.contains(c))		
			throw new Exception("Object already no exist.");
		
		this.listeners.add(c);
	}
	
	//removendo um novo listener
		public void changeListener(ChangeListeners old, ChangeListeners c) throws Exception{
			if(!this.listeners.contains(c))		
				throw new Exception("Object already no exist.");

			this.listeners.remove(old);
			this.listeners.add(c);
		}
		
		
		//chamada para começar a rodar o listeners
		public void update(){
			this.run();
		}
		
		private void run(){
			System.out.println("chamou run");
			Collection<ChangeListeners> c;
			
			synchronized (this) {
				//se clona para empedir problemas na lista dos listeners
				c = (Collection) ((ArrayList)this.listeners).clone();
			}
			
			ChangeParameter p = new ChangeParameter(this);
			
			for (ChangeListeners ls : c){				
				ls.goChange(p);
			}
		}
}
