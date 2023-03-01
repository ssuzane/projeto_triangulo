package br.senai.sp.model;

public class Triangulo {
	
	//propreiedades/atributos da classe
	public double base;
	public double ladob;
	public double ladoc;
	public double altura;
	public String nome;
	
	//métodos da classes
	public void mostrarDimesoes() {
		
		  System.out.println("--------------------");
		  System.out.println(nome);
		  System.out.println("--------------------");
		  System.out.println("base---> " + base);
		  System.out.println("ladoc---> " + ladoc);
		  System.out.println("ladob---> " + ladob);
	      System.out.println("altura--->" + altura);
	      calcularArea();
	}
              
	          //metodos, função
	         public void calcularArea( ) {
	        	   
	        	double area = (base * altura) / 2;
	        	 System.out.println("area do triangulo = " + area);
	         }
	
	
	
}
