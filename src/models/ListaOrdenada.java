package models;

import java.util.*;


import exceptions.ElementNotAllowedException;
import exceptions.ListSizeOverflownException;

public class ListaOrdenada<J> extends ArrayList<J> {
	
	private Comparator comp;
	private final static int MAX_SIZE = 100;
	
	public ListaOrdenada(Comparator comp){
		super ();
		this.comp = comp;
	}
	
	
	//Gestionamos los mensajes de error que nos apareceran segun sea su excepcion
	
	@Override
	
	public boolean add(J element) throws ElementNotAllowedException , ListSizeOverflownException{
		if (element != null) {
			if (this.size() <= MAX_SIZE) {
				return super.add(element);
			} else {
				throw new ListSizeOverflownException("La lista esta llena");
			}
		}else { 
			throw new ElementNotAllowedException("No Puede contener ningun valor null");
			} 
		}
		
		@Override
		public boolean addAll(Collection<? extends J> collection) throws ElementNotAllowedException , ListSizeOverflownException {
			if(collection.size()+this.size() <= MAX_SIZE) {
				return super.addAll(collection);
			} else {
				throw new ListSizeOverflownException("La lista esta llena");
			}
	
		
	
	}
	

}
