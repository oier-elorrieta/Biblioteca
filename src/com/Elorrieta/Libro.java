package com.Elorrieta;

public class Libro {
	
	private String titulo;
	private String codigo;
	
	
	
	public Libro(String titulo, String codigo) {
		super();
		this.titulo = titulo;
		this.codigo = codigo;
	}
	
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", codigo=" + codigo + "]";
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
	

}
