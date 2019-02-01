package br.com.unicred.restapp.core.api;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import br.com.unicred.restapp.application.api.DocumentoAPI;

public class RestAppApplication extends Application {
	
	private Set<Class<?>> classes;
	
	public RestAppApplication() {
		super();
		initializate();
	}
	
	private void initializate() {		
		classes = new HashSet<Class<?>>();
		classes.add(DocumentoAPI.class);
	}

	@Override
	public Set<Class<?>> getClasses() {
		return classes;
	}
	
}