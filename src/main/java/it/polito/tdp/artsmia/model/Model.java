package it.polito.tdp.artsmia.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleWeightedGraph;

import it.polito.tdp.artsmia.db.Archi;
import it.polito.tdp.artsmia.db.ArtsmiaDAO;


public class Model {
	
	Graph<ArtObject,DefaultWeightedEdge> grafo;
	ArtsmiaDAO dao= new ArtsmiaDAO();
	Map<Integer,ArtObject> mappaOggetti=new HashMap<>();
	
	public void creaGrafo() {
		grafo=new SimpleWeightedGraph<>(DefaultWeightedEdge.class);
		dao.listObjects(mappaOggetti);
		Graphs.addAllVertices(grafo, mappaOggetti.values());
		for(Archi a:dao.listArchi(mappaOggetti)) {
				Graphs.addEdgeWithVertices(grafo, a.getObj1(), a.getObj2(),a.getPeso());
		}
	}
	
	public Graph<ArtObject,DefaultWeightedEdge> getGrafo(){
		return grafo;
	}
	
}
