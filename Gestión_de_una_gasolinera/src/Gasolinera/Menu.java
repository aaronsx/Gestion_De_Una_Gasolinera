package Gasolinera;
import java.util.ArrayList;
import java.util.Scanner;


public class Menu {

	public static void main(String[] args) 
	{
		Gasolineria gaso = new Gasolineria();
		//La base de datos
		ArrayList<Gasolineria> listgasolinera=new ArrayList<>();
		Scanner preguntar = new Scanner(System.in);		
		Boolean cerrarMenu = false;
		boolean otraopcion;
		int opcion;
		while(!cerrarMenu) {	
			//Mostramos el menú
			mostrarMenu();
			System.out.println("Introduza la opción deseada: ");
			opcion = preguntar.nextInt();
			System.out.println("[INFO] - Has seleccionado la opcion " + opcion);
			
			switch (opcion) {			
				case 1:
					otraopcion=false;
					listgasolinera.add(gaso.gasolinera(otraopcion, listgasolinera));
					break;
				case 2:
					otraopcion=true;
					listgasolinera.add(gaso.gasolinera(otraopcion, listgasolinera));
					
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
	static void mostrarMenu() {
		System.out.println("1. Repostaje normal");
		System.out.println("2. Repostaje factura");
		System.out.println("3. Ver todos los repostajes");
		System.out.println("4. Salir");
	}
		
}
