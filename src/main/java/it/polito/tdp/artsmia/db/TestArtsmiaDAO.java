package it.polito.tdp.artsmia.db;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import it.polito.tdp.artsmia.model.ArtObject;

public class TestArtsmiaDAO {

	public static void main(String[] args) {

		ArtsmiaDAO dao = new ArtsmiaDAO();
		Map<Integer,ArtObject> mappaOggetti=new HashMap<>();
		dao.listObjects(mappaOggetti);
		//System.out.println(objects.toString()+"\n");
		System.out.println(mappaOggetti.values().size());
		List<Archi> archi=dao.listArchi(mappaOggetti);
		//System.out.println(archi.toString());
		System.out.println(archi.size());
	}

}
