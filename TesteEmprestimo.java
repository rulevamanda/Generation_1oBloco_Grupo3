package prjModuloBloco1;

public class TesteEmprestimo extends EmprestimoDevolucao {
	
	public TesteEmprestimo (int codCliente) {
		
		//nesta classe estamos usando heran�a da classe EmprestimoDevolucao;
		super(codCliente);
		//System.out.println("Nome do cliente: "+getNomeCliente());
		fazerEmprestimo();
		
		
	}

}
