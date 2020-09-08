package entities;

public abstract class PagadorImposto {
	
	private String nome;
	private Double rendaAnual;

	
	public PagadorImposto() {
	}


	public PagadorImposto(String nome, Double rendaAnual) {
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Double getRendaAnual() {
		return rendaAnual;
	}


	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	
	
	public abstract double taxa();	
	
}
