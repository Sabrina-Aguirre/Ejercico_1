package Ejercicio_1;

public class Fraccion {
	
	private int numerador;
	private int denominador;
	
	Fraccion ()
	{
		numerador = 1;
		denominador = 1;
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
	
	// método de instancia void invertirSigno()
	
	public void invertirSigno()
	{
		numerador = numerador * -1;
		System.out.println(numerador);
		
	}
	
	// void invertir()
	public void invertir()
	{
		if( numerador < 0 ) 
		{
			int numero = numerador * -1;
			System.out.println("La fracion invertida es: " + denominador + "/" + numero);
		}
		
	}
	
	//método de instancia double aDouble()
	public void aDouble() 
	{
		float resultado = denominador / numerador;
		System.out.println(resultado);
	}
	
	
	// metodo maximo comun divisor
	/*public int mcd(int numerador, int denominador) 
	{
		int aux;
		while(denominador != 0)
		{
			aux = denominador;
			
			denominador = numerador % denominador;
			
			numerador= denominador;
			
			numerador=aux;
		}
		return numerador;
		
	}
	//método de instancia void reducir()
	public int reducir(int numerador, int denominador) 
	{
		return (numerador * denominador)/
	}*/
	
	//método de clase static Fraccion producto(Fraccion q1, Fraccion q2)
	

}
