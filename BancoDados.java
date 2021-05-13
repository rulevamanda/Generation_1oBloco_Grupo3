package prjModuloBloco1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class BancoDados {
	
	private String titulo;
	private String autor;
	private String genero;
	private int quant;
	private int ano;
	private int codigo;
	//private int conf;
	
	List<String> info  = new ArrayList<String>();
	
	public BancoDados (String titulo, String autor, String genero, int quant, int ano){
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.quant = quant;
		this.ano = ano;
		
		

		/*if(tipo == 1) {
			List<String> info  = new ArrayList<String>();
			
			info.add(id);
			info.add(nome);
			
			List<List> livros  = new ArrayList<List>();
			
			livros.add(info);
			
			for(int x = 0; x < 2; x++) {
				if(info.get(x) == "harry") {
					String nome1 = info.get(x);
				}
			}
		}*/
	}
	
	public void setLivros()
	{
		 

			info.add(this.titulo);
			info.add(this.autor);
			info.add(this.genero);
		//	info.add(this.quant);
		//	info.add(this.ano);
				
			List<String> lista = new ArrayList<String>();  
			lista.addAll(info);
	        
			/*
			for (int i = 0; i < lista.size(); i++) {
			    System.out.println("aula : " + lista.get(i));
			}*/
			
			/*
	        for (String l : lista) {
	        	System.out.println(lista.getClass());
	        }*/
	}
	
	
	public void getLivros()
	{
		 {
				
			for(int x = 0; x < 5; x++) {
					System.out.println(info.get(x));
			}
		}
	}
	
	/*
	public void setEmprestimo()
	{
		 {
				List<String> info  = new ArrayList<String>();
				
				info.add(this.id);
				info.add(this.nome);
				
				List<List> livros  = new ArrayList<List>();
				
				livros.add(info);
				
				for(int x = 0; x < 2; x++) {
					if(info.get(x) == "harry") {
						System.out.println(info.get(x));
					}
				}
			}
	}*/
	//public 
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