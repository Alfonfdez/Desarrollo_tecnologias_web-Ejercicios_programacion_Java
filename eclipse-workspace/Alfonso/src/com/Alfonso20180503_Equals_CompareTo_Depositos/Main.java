package com.Alfonso20180503_Equals_CompareTo_Depositos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Deposito deposito1 = new Deposito("A", 1, 1, 1);
		Deposito deposito2 = new Deposito("B", 1, 1, 1);
		Deposito deposito3 = new Deposito("C", 3, 3, 3);
		Deposito deposito4 = new Deposito("D", 4, 4, 4);
		Deposito deposito5 = new Deposito("E", 5, 5, 5);

		System.out.println(deposito1.equals(deposito2));

		System.out.println(deposito1.hashCode() == deposito2.hashCode());

		List<Deposito> depositos = new ArrayList<Deposito>();
		depositos.add(deposito3);
		depositos.add(deposito2);
		depositos.add(deposito5);
		depositos.add(deposito4);
		depositos.add(deposito1);

		Collections.sort(depositos);
		Iterator<Deposito> it = depositos.iterator();
		while (it.hasNext()) {
			Deposito d = it.next();

			System.out.println(d.getNombre());

		}
	}

}
