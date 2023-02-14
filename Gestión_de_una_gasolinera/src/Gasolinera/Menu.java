package Gasolinera;
import java.util.ArrayList;
import java.util.Scanner;


public class Menu {

	public static void main(String[] args) 
	{
		//Creamos un objeto de tipo Gasolineria para tener el mismo tipo que en Gasolineria.java y poder llamar metodos de esa clase
		Gasolineria gaso = new Gasolineria();
		//La base de datos del tipo Gasolineria 
		ArrayList<Gasolineria> listgasolinera=new ArrayList<>();
		Scanner preguntar = new Scanner(System.in);		
		Boolean cerrarMenu = false;
		
		int opcion;
		while(!cerrarMenu) 
		{	
			//Mostramos el menú
			mostrarMenu();
			System.out.println("Introduza la opción deseada: ");
			opcion = preguntar.nextInt();
			System.out.println("[INFO] - Has seleccionado la opcion " + opcion);
			
			switch (opcion) 
			{			
				case 1:
					listgasolinera.add(gaso.gasolinera(false, listgasolinera));
					break;
				case 2:
					listgasolinera.add(gaso.gasolinera(true, listgasolinera));
					
					break;
				case 3:
					gaso.mostrardatosgasolinera(listgasolinera);
					break;
				
				case 4:
					cerrarMenu = true;
					break;
				default:

			}
		}
	}
	static void mostrarMenu() 
	{
		System.out.println("<-----------Menu------------->");
		System.out.println("1. Repostaje normal");
		System.out.println("2. Repostaje factura");
		System.out.println("3. Ver todos los repostajes");
		System.out.println("4. Salir");
	}
		
}
