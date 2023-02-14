package Gasolinera;


import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Gasolineria 
{
	//Metodo de una gasolinera la opcion 1 y 2
	public Gasolineria gasolinera(boolean ok, ArrayList<Gasolineria>bd)
	{
		//Creamos un objeto gasoVacio para poder devolver el tipo de obeto y poder añadirlo a la base de datos
		Gasolineria gasoVacio = new Gasolineria();
		 Scanner pedir = new Scanner(System.in);
		 //Construccion de la fecha y hora en este momento
		 String dateTime = DateTimeFormatter.ofPattern("dd MMM yyyy, hh:mm:ss a")
                 .format(LocalDateTime.now());
		 
		 
		 //Pedimos los litros
		 System.out.println("Introduce los litros:");
		
		 //Implementamos los litros en la base de datos
		 gasoVacio.setLitos(pedir.nextDouble());
		 
		 //Pedimos el importe
		 System.out.println("Introduce el importe:");
		 
		 //Implementamos el importe en la base de datos
		 gasoVacio.setImporte(pedir.nextDouble());
				    
		 //Implementamos la fecha y hora en la base de datos
		 gasoVacio.setFecha(dateTime);
				    
		 //If si la persona introduce la 2 opcion pasa y si no pues va por el else
		if(ok)
		{
			System.out.println("Introduce tu dni:");
			//Implementamos el dni
			gasoVacio.setDni(pedir.next());
			System.out.println("Introduce tu matricula:");
			//Implementamos la matricula
			gasoVacio.setMatricula(pedir.next());
		}
		else
		{
			//En este caso solo entra cuando la persona ha elegido la 1 opcion y no se le tiene que pedir ni el dni ni la matricula
			
			//Guardamos dni como si fuera nulo
			gasoVacio.setDni(null);
			//Guardamos matricula como si fuera nula 
			gasoVacio.setMatricula(null);
		}
		//Devolvemos gasoVacio para que en la llamada se pueda implementar en una lista del mismo tipo que en este caso es Gasolineria
		return gasoVacio;
	}
	//Mostrar repostaje opcion 3
		public void mostrardatosgasolinera(ArrayList<Gasolineria>bd)
		{	//Un bucle forech para sacar todos los datos de la base de datos de gasolinera
			//Dentro del bloque recorre toda la lista bd con un atributo del tipo Gasolina que es el mismo que el de la base de datos
			for(Gasolineria gaso:bd)
			{
				System.out.println("Dni: "+gaso.getDni()+", Importe: "+gaso.getImporte()+", Litros: "+gaso.getLitos()+", Matricula: "+gaso.getMatricula()+", fecha: "+gaso.getFecha());
				System.out.println("");
			}
		}
	
	//--------------------------ATRIBUTOS, GETTERS Y SETTERS, OBJETOS TIPO GASOLINA------------------------------------
	
	
	//Mi objeto gasolinera en uno no esta vacio mientras que en el otro lo tengo que declarar vacio 
	public Gasolineria(String dni, String fecha, String matricula, double litos,double importe) 
	{
		super();
		this.dni = dni;
		this.fecha = fecha;
		this.matricula = matricula;
		this.litos = litos;
		this.importe = importe;
	}
	public Gasolineria() 
	{
		super();
		
	}
	//Los atributos de mi gasolinera
	private String dni;
	private String fecha;
	private String matricula;
	private double litos;
	private double importe;
	//Los getters y los setters de los atributos
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) 
	{
		this.fecha = fecha;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getLitos() {
		return litos;
	}
	public void setLitos(double litos) {
		this.litos = litos;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
}
