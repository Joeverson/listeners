package br.com.dup.observer.controllers;

import br.com.dup.observer.listeners.ChangeListeners;
import br.com.dup.observer.listeners.ChangeParameter;

public class WeatherDate implements ChangeListeners{
	private double temperatura;
	private double humidity;
	private double pressure;
	
	public WeatherDate(double t, double h, double p){
		this.temperatura = t;
		this.humidity = h;
		this.pressure = p;
	}

	public double getTemperatura() {
		return temperatura;
	}
	public double getHumidity() {
		return humidity;
	}
	public double getPressure() {
		return pressure;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}

	public void setPressure(double pressure) {
		this.pressure = pressure;
	}

	@Override
	public void goChange(ChangeParameter e) {
		System.out.println("humidade: "+this.getHumidity());		
		System.out.println("pressao: "+this.getPressure());		
		System.out.println("temperatura: "+this.getTemperatura());		
	}

}
