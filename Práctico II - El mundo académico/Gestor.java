package mundoacademico;

import java.util.Scanner;

public class Gestor {

	public static void main(String[] args) {
		
		
	
		Scanner lec = new Scanner(System.in);
		
			
				
				Libro libro1 = new Libro("a", "a", 0, "a", "a", "a" );
				
				Revista revista1 = new Revista("a", "a", 0, "a", 0);
				
				ArticuloCientifico artiCien1 = new ArticuloCientifico ("a", "a", 0, "a", "a");
				
				System.out.println("Dime el título del libro ");
				libro1.settituloPublicacion(lec.next());
				System.out.println("Dime el autor ");
				libro1.setAutor(lec.next());
				System.out.println("Dime el año en que se publicó ");
				libro1.setAñopubli(lec.nextInt());
				System.out.println("Dime la editorial del libro ");
				libro1.setEditorial(lec.next());
				System.out.println("Cuantas páginas tiene?");
				libro1.setNumeroPaginas(lec.next());
				System.out.println("Cuál es su género");
				libro1.setGenero(lec.next());
				
				System.out.println("-----------------------------");
				
				System.out.println("Dime el título de la revista ");
				revista1.settituloPublicacion(lec.next());
				System.out.println("Dime el autor ");
				revista1.setAutor(lec.next());
				System.out.println("Dime el año en que se publicó ");
				revista1.setAñopubli(lec.nextInt());
				System.out.println("Dime la editorial ");
				revista1.setEditorial(lec.next());
				System.out.println("Dime el número de la edición de la revista");
				revista1.setNumero(lec.nextInt());
				//hola profe
				System.out.println("-----------------------------");
				
				System.out.println("Dime el título del artículo científico ");
				artiCien1.settituloPublicacion(lec.next());
				System.out.println("Nombre de la revista en la que se publicó el articulo");
				artiCien1.setNombreRevista(lec.next());
				System.out.println("Dime el autor ");
				artiCien1.setAutor(lec.next());
				System.out.println("Dime el año en que se publicó ");
				artiCien1.setAñopubli(lec.nextInt());
				
				System.out.println("-----------------------------");
				
				System.out.println("Datos registrados: ");
				System.out.println(" ");
				System.out.println("Libro: ");
				System.out.println("Título: " + libro1.gettituloPublicacion());
				System.out.println("Autor: " + libro1.getAutor());
				System.out.println("Año de publicación: " + libro1.getAñopubli());
				System.out.println("Editorial: " + libro1.getEditorial());
				System.out.println("Páginas que contiene: " + libro1.getNumeroPaginas());
				System.out.println("Género: " + libro1.getGenero());
				System.out.println(" ");
				System.out.println("Revista: ");
				System.out.println("Título: " + revista1.gettituloPublicacion());
				System.out.println("Autor: " + revista1.getAutor());
				System.out.println("Año de publicación: " + revista1.getAñopubli());
				System.out.println("Editorial: " + revista1.getEditorial());
				System.out.println("Número de edición: " + revista1.getNumero());
				System.out.println(" ");
				System.out.println("Artículo Científico: ");
				System.out.println("Título: " + artiCien1.gettituloPublicacion());
				System.out.println("Nombre de la revista publicada: " + artiCien1.getNombreRevista());
				System.out.println("Autor: " + artiCien1.getAutor());
				System.out.println("Año de publicación: " + artiCien1.getAñopubli());
				
				
	}
}
