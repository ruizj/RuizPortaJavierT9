package main;
 import models.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListaOrdenada<Integer> jr = new ListaOrdenada<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1-o2;
			}
		});
		
		jr.add(2);
		jr.add(60);
		jr.add(10);
		jr.add(55);
		
		//Mostramos el numero mas grande
		System.out.println(Collections.max(jr));
		
		//Mostramos el valor mas pequeño
		
		System.out.println(Collections.min(jr));
		
		//Mostramos Ordenado de menor a mayor
		
		Collections.sort(jr);
		System.out.println(jr);
		
		
		
			
		}
		
		
	}


