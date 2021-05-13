package prjModuloBloco1;

public class TesteEmprestimo extends EmprestimoDevolucao {
	
	public TesteEmprestimo (int codCliente) {
		
		//nesta classe estamos usando herança da classe EmprestimoDevolucao;
		super(codCliente);
		//System.out.println("Nome do cliente: "+getNomeCliente());
		fazerEmprestimo();
		
		
	}

}
