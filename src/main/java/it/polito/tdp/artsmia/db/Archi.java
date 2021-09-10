package it.polito.tdp.artsmia.db;

import it.polito.tdp.artsmia.model.ArtObject;

public class Archi {
	ArtObject obj1;
	ArtObject obj2;
	int peso;
	
	public Archi(ArtObject obj1, ArtObject obj2, int peso) {
		this.obj1 = obj1;
		this.obj2 = obj2;
		this.peso = peso;
	}

	public ArtObject getObj1() {
		return obj1;
	}

	public void setObj1(ArtObject obj1) {
		this.obj1 = obj1;
	}

	public ArtObject getObj2() {
		return obj2;
	}

	public void setObj2(ArtObject obj2) {
		this.obj2 = obj2;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return obj1.getId() + obj2.getId() + peso +"\n";
	}
	
	
	
	
}
