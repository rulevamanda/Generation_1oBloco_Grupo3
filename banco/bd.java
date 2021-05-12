package lista;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class bd {
	public bd(String id, String nome){
	List<String> info  = new ArrayList<String>();
	
	info.add(id);
	info.add(nome);
	
	List<List> livros  = new ArrayList<List>();
	
	livros.add(info);
	
	for(int x = 0; x < 2; x++) {
		if(info.get(x) == "harry") {
			System.out.println("okay");
		}

	}
	//mostrar as listas em vetor para visualizar
	/*
	Iterator<List> intr = livros.iterator();
	while(intr.hasNext()) {
		System.out.println("Livro: " + intr.next());	
		
		Iterator<List> itD = intr.next().iterator();
		while(itD.hasNext()){			
			System.out.println(itD.next());	
			}
		}*/
	}
}
