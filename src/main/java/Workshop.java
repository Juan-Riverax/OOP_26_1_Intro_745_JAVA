import java.util.List;

public class Workshop {
    public static void main(String[] args) {

    }

    // Método que suma dos números enteros
    public int sumarDosNumeros(int a, int b) {
      return a+b;
    }

    // Método que encuentra el mayor de tres números enteros
    public int mayorDeTresNumeros(int a, int b, int c) {
        if (a >= b && a >= c) return a;
	else if (b >= c) return b;
	else return c;
    }

    // Método que retorna la tabla de multiplicar de un número
    public int[] tablaMultiplicar(int numero, int limite) {
        int [] tabla = new int [limite];
		for (int i=1; i<=limite; i++){
			tabla[i-1]= numero*i;
		}
	return tabla;
    }

    // Método que calcula el factorial de un número entero
    public int factorial(int n) {
        int factor=1;
	if(n>=0){
		for(int i=1; i<=n; i++){
		factor = i*factor;
		}
        } return factor;
    }

    // Método que verifica si un número es primo
    public boolean esPrimo(int numero) {
	int modulo;
	int b=0;
	if(numero>0){
	for(int i=1; i<=numero;i++){
		modulo=numero%i;
		if(modulo==0)
			{
			b++;
			}
		}
	}
	if(b==2)
	{
	return true;
	}
	else
	{
        return false;
	}
    }

    // Método que genera una serie de Fibonacci
    public int[] serieFibonacci(int n) {
	int a=0;
	int b=1;
	int c;
	int [] seriefibo = new int[n];

	if(n>0)
	{
	seriefibo[0]=0;
	}
	if(n>1)
	{
	seriefibo[1]=1;
	}
	
	for (int i=2; i<n; i++)
	{
	seriefibo[i]=seriefibo[i-1]+seriefibo[i-2];
	}
	
        return seriefibo;
    }

    // Método que suma todos los elementos de un arreglo
    public int sumaElementos(int[] arreglo) {
	int suma=0;
	for(int i=0; i<arreglo.length; i++)
		suma=suma+arreglo[i];
        return suma;
    }

    // Método que calcula el promedio de los elementos de un arreglo
    public double promedioElementos(int[] arreglo) {
        int suma=0;
	double promedio;
	for(int i=0; i<arreglo.length; i++){
		suma=suma+arreglo[i];
	}
	promedio=suma/arreglo.length;
        return promedio;
    }

    // Método que encuentra el elemento mayor en un arreglo
    public int encontrarElementoMayor(int[] arreglo) {
        int max=0;
	for(int i=0; i<arreglo.length; i++)
	{
		if(arreglo[i]>max)
		{
		max=arreglo[i];
		}
	}
        return max;
    }

    // Método que encuentra el elemento menor en un arreglo
    public int encontrarElementoMenor(int[] arreglo) {
        int min=arreglo[0];
	for(int i=1; i<arreglo.length; i++)
	{
		if(arreglo[i]<min)
		{
		min=arreglo[i];
		}
	}
        return min;
    }

    // Método que busca un elemento en un arreglo
    public boolean buscarElemento(int[] arreglo, int elemento) {
	int b=0;
	for(int i=0; i<arreglo.length; i++){
		if(arreglo[i]==elemento){
		b++;
		}
    	}
	if(b==1)
	{
	return true;
	}
	else
	{
	return false;
	}
}
	

    // Método que invierte un arreglo
    public int[] invertirArreglo(int[] arreglo) {
	int AUX;
	for(int i=0; i<arreglo.length; i++){
		for(int j=i+1; j<arreglo.length; j++){
			AUX=arreglo[i];
			arreglo[i]=arreglo[j];
			arreglo[j]=AUX;
			}
	}
        return arreglo;
    }

    // Método que ordena un arreglo en orden ascendente
    public int[] ordenarArreglo(int[] arreglo) {
	int AUX;
	int[] arregloOrdenado = new int [arreglo.length];
		
		for (int i=0; i<arreglo.length; i++)
		{
			arregloOrdenado[i]=arreglo[i];
		}
		
		for (int i=0; i<arregloOrdenado.length-1; i++)
		{
			int chiquilin=i;
			for(int j=i+1; j<arregloOrdenado.length; j++)
			{
			if(arregloOrdenado[j]<arregloOrdenado[chiquilin]){
				chiquilin=j;
			}
			}
		AUX=arregloOrdenado[i];
		arregloOrdenado[i]=arregloOrdenado[chiquilin];
		arregloOrdenado[chiquilin]=AUX;
		}
        return arregloOrdenado;
    }

    // Método que elimina los duplicados de un arreglo
    public int[] eliminarDuplicados(int[] arreglo) {
        
int ting=0;
int n=0;
	for(int i=0; i<arreglo.length; i++)
	{
		for(int j=i+1; j<arreglo.length; j++)
		{
			if(arreglo[i]==arreglo[j])
			{
				ting++;
			}
		}
		if(ting!=0)
		{
			n++;
		}
		ting=0;
	}

int [] NoDuplicados= new int[arreglo.length-n];
int indice=0;
	for(int i=0;i<arreglo.length;i++)
	{
		for(int j=i+1;j<arreglo.length;j++)
		{
			if(arreglo[i]==arreglo[j])
			{
				ting++;
			}
		}
		if(ting==0)
		{
			NoDuplicados[indice]=arreglo[i];
			indice++;
		}
		ting=0;
	}

        return NoDuplicados;
    }

    // Método que combina dos arreglos en uno solo
    public int[] combinarArreglos(int[] arreglo1, int[] arreglo2) {
       int[] combined = new int[arreglo1.length+arreglo2.length];

	for(int i=0; i<arreglo1.length; i++)
	{
		combined[i]=arreglo1[i];
	}

	for(int i=0; i<arreglo2.length; i++)
	{
		combined[i+arreglo1.length]=arreglo2[i];
	}

        return combined;
    }

    // Método que rota un arreglo n posiciones
    public int[] rotarArreglo(int[] arreglo, int posiciones) {
        // TODO: Implementar el método para rotar un arreglo n posiciones.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5] y posiciones = 2, el resultado debería ser [3, 4, 5, 1, 2].
        return new int[0];
    }

    // Método que cuenta los caracteres en una cadena
    public int contarCaracteres(String cadena) {
        int conteo=0;
	char[] letras = cadena.toCharArray();
		for(int i=0; i<letras.length; i++)
		{
		conteo++;
		}
        return conteo;
    }

    // Método que invierte una cadena
    public String invertirCadena(String cadena) {

        char[] arregloInvertido = new char[cadena.length()];
		
		for (int i=0; i<cadena.length(); i++)
		{
			arregloInvertido[i]=cadena.charAt(cadena.length()- 1 - i);
		}

        return new String(arregloInvertido);
    }

    // Método que verifica si una cadena es un palíndromo
    public boolean esPalindromo(String cadena) {
        char[] arregloInvertido = new char[cadena.length()];
		
		for (int i=0; i<cadena.length(); i++)
		{
			arregloInvertido[i]=cadena.charAt(cadena.length()- 1 - i);
		}
		String invertido = new String(arregloInvertido);

		if(invertido.equals(cadena))
		{
			return true;
		}
		else{return false;}
        // Ejemplo: Si cadena = "madam", el resultado debería ser true.
    }

    // Método que cuenta el número de palabras en una cadena
    public int contarPalabras(String cadena) {
	int npalabras;
        if(cadena == null || cadena.trim().isEmpty())
	{
		npalabras=0;
		return npalabras;
	}
	else 
	{
	String[] palabras = cadena.trim().split("\\s+");
	 npalabras = palabras.length;
        return npalabras;
	}
    }

    // Método que convierte una cadena a mayúsculas
    public String convertirAMayusculas(String cadena) {
       String mayuscula= cadena.toUpperCase();
        return mayuscula;
    }

    // Método que convierte una cadena a minúsculas
    public String convertirAMinusculas(String cadena) {
        String minuscula=cadena.toLowerCase();
        return minuscula;
    }

    // Método que reemplaza una subcadena en una cadena por otra subcadena
    public String reemplazarSubcadena(String cadena, String antiguaSubcadena, String nuevaSubcadena) {
        // TODO: Implementar el método para reemplazar una subcadena en una cadena por otra subcadena.
        // Ejemplo: Si cadena = "Hello Java", antiguaSubcadena = "Java", y nuevaSubcadena = "world", el resultado debería ser "Hello world".
        return "";
    }

    // Método que busca una subcadena en una cadena y retorna su índice
    public int buscarSubcadena(String cadena, String subcadena) {
        // TODO: Implementar el método para buscar una subcadena en una cadena y retornar su índice.
        // Ejemplo: Si cadena = "Hello world" y subcadena = "world", el resultado debería ser 6.
        return -1;
    }

    // Método que valida un correo electrónico
    public boolean validarCorreoElectronico(String correo) {
        // TODO: Implementar el método para validar un correo electrónico.
        // Ejemplo: Si correo = "test@example.com", el resultado debería ser true.
        return false;
    }

    // Método que calcula el promedio de una lista de números

    public double promedioLista(List<Integer> lista) {
	double promedio;
	int suma=0;
	int k=0;

		for(int i=0; i<lista.size(); i++)
		{
		suma=suma+lista.get(i);
		}
	if(suma!=0)
	{
	promedio=(double)(suma/lista.size());
	return promedio;
	}
        else
	{
	return 0.0;
	}
    }

    // Método que convierte un número en su representación binaria
    public String convertirABinario(int numero) {
	
	if(numero>0)
	{
	String binario="";
		while(numero>0)
		{
		int residuo = numero%2;
		binario=residuo+binario;
		numero=numero/2;
		}
	}

	if(numero<0)
	{
	String binario="";
	numero=Math.abs(numero);

		while(numero>0)	
		{
		int residuo = numero%2;
		binario=residuo+binario;
		numero=numero/2;
		}
	binario="-"+binario;
	return binario;
	}
	
        // TODO: Implementar el método para convertir un número en su representación binaria.
        // Ejemplo: Si numero = 10, el resultado debería ser "1010".
    }

    // Método que convierte un número en su representación hexadecimal
    public String convertirAHexadecimal(int numero) {
        // TODO: Implementar el método para convertir un número en su representación hexadecimal.
        // Ejemplo: Si numero = 255, el resultado debería ser "FF".
        return "";
    }

    // Método para el juego de piedra, papel, tijera, lagarto, Spock
    public String jugarPiedraPapelTijeraLagartoSpock(String eleccionUsuario) {
        // TODO: Implementar el método para el juego de Piedra, Papel, Tijera, Lagarto, Spock.
        // Las reglas del juego son:
        // - Piedra vence a Tijera y Lagarto
        // - Papel vence a Piedra y Spock
        // - Tijera vence a Papel y Lagarto
        // - Lagarto vence a Spock y Papel
        // - Spock vence a Tijera y Piedra


        // El método debe retornar un mensaje indicando el resultado del juego.
        // Ejemplo: Si la eleccionUsuario es "Piedra", el resultado podría ser "Ganaste" o "Perdiste" dependiendo de la elección de la computadora.
        return "";
    }

    public String pptls2(String game[]) {
        //Retornar player ganador o empate
            /*
            Rock = R
            Paper = P
            Scissors = S
            Lizard = L
            Spock = V
        Scissors cuts Paper
Paper covers Rock
Rock crushes Lizard
Lizard poisons Spock
Spock smashes Scissors
Scissors decapitates Lizard
Lizard eats Paper
Paper disproves Spock
Spock vaporizes Rock
Rock crushes Scissors
         */
        return "";
    }

    public double areaCirculo(double radio) {
	double area = Math.PI*radio*radio;
        return area;
    }

    public String zoodiac(int day, int month) {
        String Zodiaco="";
	switch (month)
		{
			case 1: if(day>=1 && day<=19)
				{
				Zodiaco = "Capricornio";
				}
				else 
				{
				Zodiaco = "Acuario";
				}
				break;
			case 2: if(day>=1 && day<=18)
				{
				Zodiaco = "Acuario";
				}
				else 
				{
				Zodiaco = "Piscis";
				}
				if(day>29)
				{
				Zodiaco = "Invalid Date";
				}
				break;
			case 3: if(day>=1 && day<=20)
				{
				Zodiaco = "Piscis";
				}
				else 
				{
				Zodiaco = "Aries";
				}
				break;
			case 4: if(day>=1 && day<=19)
				{
				Zodiaco = "Aries";
				}
				else 
				{
				Zodiaco = "Tauro";
				}
				break;
			case 5: if(day>=1 && day<=20)
				{
				Zodiaco = "Tauro";
				}
				else 
				{
				Zodiaco = "Gemini";
				}
				break;
			case 6: if(day>=1 && day<=20)
				{
				Zodiaco = "Gemini";
				}
				else 
				{
				Zodiaco = "Cancer";
				}
				break;
			case 7: if(day>=1 && day<=22)
				{
				Zodiaco = "Cancer";
				}
				else 
				{
				Zodiaco = "Leo";
				}
				break;
			case 8: if(day>=1 && day<=22)
				{
				Zodiaco = "Leo";
				}
				else 
				{
				Zodiaco = "Virgo";
				}
				break;
			case 9: if(day>=1 && day<=22)
				{
				Zodiaco = "Virgo";
				}
				else 
				{
				Zodiaco = "Libra";
				}
				break;
			case 10: if(day>=1 && day<=22)
				{
				Zodiaco = "Libra";
				}
				else 
				{
				Zodiaco = "Escorpio";
				}
				break;
			case 11: if(day>=1 && day<=21)
				{
				Zodiaco = "Escorpio";
				}
				else 
				{
				Zodiaco = "Sagitario";
				}
				break;
			case 12: if(day>=1 && day<=21)
				{
				Zodiaco = "Sagitario";
				}
				else 
				{
				Zodiaco = "Capricornio";
				}
				break;
		}

	return Zodiaco;
   }
}
