import javax.swing.*;

public class Produto {

	// Atributos
	private String descricao;
	private String genero;
	private int estoqueDisponivel;
	private double precoCusto;
	
	// Construtores
	// -- Inicializa os atributos "zerados"
	public Produto() {
		this("","",0,0);
	}
	
	// -- Possibilita a inicialização dos atributos com valores passados por parametro
	public Produto(String descricao, String genero, int estoqueDisponivel, double precoCusto) {
		this.descricao = descricao;
		this.genero = genero;
		this.estoqueDisponivel = estoqueDisponivel;
		this.precoCusto = precoCusto;
	}

	// Getters e Setters
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getEstoqueDisponivel() {
		return estoqueDisponivel;
	}

	public void setEstoqueDisponivel(int estoqueDisponivel) {
		this.estoqueDisponivel = estoqueDisponivel;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}
	
	// Metodos especificos da classe
	
	// Recebe a quantidade comprada por parametro
	public void comprar(int qtde){
		// Apresenta o estoque atual e o estoque ja reajustado
		JOptionPane.showMessageDialog(null, "Estoque anterior:" + this.getEstoqueDisponivel() + "\nQuantidade comprada:" + qtde  + "\nEstoque atual:" + (this.getEstoqueDisponivel() + qtde));
		// Atribui o resultado da soma ao atributo estoqueDisponivel
		this.setEstoqueDisponivel(this.estoqueDisponivel + qtde);
	}
	
	// Recebe a quantidade vendida por parametro
	public void vender(int qtde){
		// Apresenta o estoque atual e o estoque ja reajustado
		JOptionPane.showMessageDialog(null, "Estoque anterior:" + this.getEstoqueDisponivel() + "\nQuantidade vendida:" + qtde  + "\nEstoque atual:" + (this.getEstoqueDisponivel() - qtde));
		// Atribui o resultado da subtracao do atributo estoqueDisponivel		
		this.setEstoqueDisponivel(this.estoqueDisponivel - qtde);		
	}
	
	
}
