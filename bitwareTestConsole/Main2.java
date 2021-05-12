package com.bitwareTestConsole;

import java.util.Scanner;

public class Main2 {

	private static String nombre = "";
	private static String edad = "";
	private static String peso = "";
	private static String altura = "";
	private static String sexo = "";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printText();
		
		Persona persona = new Persona();
		persona.setNombre(nombre);
		persona.setEdad(Integer.parseInt(edad));
		persona.setAltura(Double.parseDouble(altura));
		persona.setPeso(Double.parseDouble(peso));
		persona.setSexo(sexo.charAt(0));
		
		int res = persona.calcularIMC(Double.parseDouble(peso), Double.parseDouble(altura), sexo.charAt(0));
		if(res == -1) System.out.println("Esta por debajo de su peso ideal");
		if(res == 0) System.out.println("Esta en su peso ideal");
		if(res == 1) System.out.println("Esta por encima de su peso ideal");
		
		Boolean res1 = persona.esMayorDeEdad(Integer.parseInt(edad));
		System.out.println(res1 == true ? "Usted es mayor de edad" : "Usted es menor de edad");
		System.out.println("NSS: "+persona.generarNSS().toUpperCase());
		System.out.println("Sus datos: "+ persona.toString());
		
	}
	
	public static Boolean validateInput(String val) {
		return val.length() == 0 ? false : true;
	}
	
	public static void printText() {
		Scanner scanner = new Scanner(System.in);
		boolean res = false;
		while(res == false) {
			System.out.println("Ingrese el nombre:");
			nombre = scanner.nextLine();
			res = validateInput(nombre);
		}
		while(validateInput(edad) == false) {
			System.out.println("Ingrese la edad:");
			edad = scanner.nextLine();
			res = validateInput(edad);
		}
		while(validateInput(peso) == false) {
			System.out.println("Ingrese el peso:");
			peso = scanner.nextLine();
			res = validateInput(peso);
		}
		while(validateInput(altura) == false) {
			System.out.println("Ingrese la altura:");
			altura = scanner.nextLine();
			res = validateInput(altura);
		}
		while(validateInput(sexo) == false) {
			System.out.println("Ingrese el sexo:");
			sexo = scanner.nextLine().toUpperCase();
			res = validateInput(sexo);
		}
	}

}
