package Ejercicio_1;

public class Fraccion {
	
	private int numerador;
	private int denominador;
	
	Fraccion ()
	{
		numerador = 0;
		denominador = 0;
	}
	
	public void setNumerador(int value) 
	{
		numerador = value;
	}
	
	public void setDenominador(int value) 
	{
		denominador = value;
	}
	
	//método de instancia void imprimir()
	
	public void imprimir() 
	{
		System.out.println("La fracion es: " + numerador + "/" + denominador);
	}

}
