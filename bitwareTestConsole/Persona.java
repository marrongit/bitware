package com.bitwareTestConsole;

import java.util.Random;

import com.bitwareTestConsole.Constantes;

public class Persona {

	private String nombre;
	private int edad;
	private Long nss;
	private char sexo;
	private double peso;
	private double altura;
	Constantes constantes = new Constantes();
	
	public Persona() {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.nss = nss;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public int calcularIMC(double peso, double altura, char genero) {
		double pesoIdeal =  peso/(altura*2);
		int pesoRango = 0;
		int pesoMax = 0;
		String g = new String();
		if(genero == constantes.H) {
			pesoRango = 20;
			pesoMax = 25;
		} else {
			pesoRango = 19;
			pesoMax = 24;
		}
		
		System.out.println("peso rango: "+ pesoRango +" a "+ pesoMax);
		System.out.println("peso ideal: "+ pesoIdeal);
		
		
		if(pesoIdeal < pesoRango) {
			return constantes.P_INF;
		} else if(pesoIdeal >= pesoRango && pesoIdeal <= pesoMax) {
			return constantes.P_ID;
		} else {
			return constantes.SP;
		}
	}
	
	public Boolean esMayorDeEdad(int edad) {
		return edad >= constantes.MAYOR_EDAD ? true : false;
	}
	
	public Boolean comprobarSexo(char sexo) {
		if(sexo == constantes.M || sexo == constantes.H) return true;
		return false;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", nss=" + nss + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}
	
	public String generarNSS() {
		String nss = "";
		Random rand = new Random();
		String letters = "abcdefghi";
		int upperbound = 10;
		int a = 3;
		for(int i = 0; i <= 7; i++) {
			if(rand.nextInt(a)%2 == 0) {
				nss += rand.nextInt(upperbound);
			} else {
				nss += letters.charAt(rand.nextInt(letters.length()));
			}
			
		}
		return nss;
	}
	
	
}
