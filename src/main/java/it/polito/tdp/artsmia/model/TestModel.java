package it.polito.tdp.artsmia.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class TestModel {
	public static void main(String[] args) {

		Model m= new Model();
		m.creaGrafo();
		System.out.println(m.getGrafo().vertexSet().size());
		System.out.println(m.getGrafo().edgeSet().size());
	}
}
