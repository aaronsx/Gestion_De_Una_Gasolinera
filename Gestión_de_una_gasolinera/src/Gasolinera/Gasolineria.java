package Gasolinera;


import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Gasolineria 
{
	//Mi objeto gasolinera
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
	private int contador = 0;
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
	public int getContador() {
		return contador;
	}
	public void setContador(int contador) {
		this.contador = contador;
	}
	
	
	//Gaso
	public Gasolineria gasolinera(boolean ok, ArrayList<Gasolineria>bd)
	{
		Gasolineria gasoVacio = new Gasolineria();
		 Scanner pedir = new Scanner(System.in);
		 //Haciendo la fecha en este momento
		 String dateTime = DateTimeFormatter.ofPattern("MMM dd yyyy, hh:mm:ss a")
                 .format(LocalDateTime.now());
		 
		 
		 //litros
		 System.out.println("Introduce los litros");
		
		 //Implementamos los litros
		 gasoVacio.setLitos(pedir.nextDouble());
		 
		 //Importe
		 System.out.println("Introduce el importe");
		 
		 //Implementamos el importe
		 gasoVacio.setImporte(pedir.nextDouble());
		 //Fecha nueva
	
		 gasoVacio.setFecha(dateTime);
		 //Un if que si es verdadero pida mas cosas y si es falso lo ponga nulo
		if(ok)
		{
			System.out.println("Introduce tu dni");
			//Implementamos el dni
			gasoVacio.setDni(pedir.next());
			System.out.println("Introduce tu matricula");
			//Implementamos la matricula
			gasoVacio.setMatricula(pedir.next());
		}
		else
		{
			//Guardamos dni nulo
			gasoVacio.setDni(null);
			//Guardamos matricula nula
			gasoVacio.setMatricula(null);
		}
		return gasoVacio;
	}
	//Pedir repostaje
		public void mostrardatosgasolinera(ArrayList<Gasolineria>bd)
		{	//Un bucle forech para sacar todos los datos de la base de datos de gasolinera
			for(Gasolineria gaso:bd)
			{
				System.out.println("Dni: "+gaso.getDni()+", Importe: "+gaso.getImporte()+", Litros: "+gaso.getLitos()+", Matricula: "+gaso.getMatricula()+", fecha: "+gaso.getFecha());
				System.out.println("");
			}
		}
	
}
