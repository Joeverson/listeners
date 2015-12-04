package br.com.dup.observer.main;

import br.com.dup.observer.controllers.WeatherDate;
import br.com.dup.observer.listeners.ChangeWeather;

public class main {

	public static void main(String[] args) {
		ChangeWeather w = new ChangeWeather();
		WeatherDate ww = new WeatherDate(1.2, 5.6, 98.2);
		WeatherDate ww2 = new WeatherDate(1.2, 5, 8.2);
		WeatherDate ww3 = new WeatherDate(1, 5, 9);
		System.out.println("rodando...");
		try{
			w.addListener(ww);
			w.addListener(ww2);
			w.addListener(ww3);
			
			w.update();
			System.out.println("---------------------------------------------------------------\n\n");
			
			
			//mudando depois de de ter mandado ficar ouvindo.
			ww.setHumidity(0);
			ww.setPressure(0);
			ww.setTemperatura(0);
			
			
			w.update();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}

	}

}
